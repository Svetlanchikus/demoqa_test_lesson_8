package demoqa.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomItemFromArray(String[] array) {
        int index = getRandomInt(0, array.length - 1);

        return array[index];
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return getRandomItemFromArray(genders);
    }

    public static String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return getRandomItemFromArray(months);
    }

    public static String getRandomYear() {

        return Integer.toString(getRandomInt(1900, 2022));
    }

    public static String getRandomDay(String month) {
        int day;
        if (month.equals("February")) {
            day = getRandomInt(1, 28);
        } else if (month.equals("April")
                || month.equals("June")
                || month.equals("September")
                || month.equals("November")) {
            day = getRandomInt(1, 30);
        } else {
            day = getRandomInt(1, 31);
        }
        if (day < 10) {

            return "0" + day;

        } else {

            return Integer.toString(day);
        }
    }

    public static String getRandomSubject() {
        String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};

        return getRandomItemFromArray(subjects);
    }

    public static String getRandomHobie() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return getRandomItemFromArray(hobbies);
    }

    public static String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return getRandomItemFromArray(states);
    }

    public static String getRandomCity(String stateValue) {
        switch (stateValue) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};

                return getRandomItemFromArray(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};

                return getRandomItemFromArray(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};

                return getRandomItemFromArray(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};

                return getRandomItemFromArray(city);
            }
        }

        return null;
    }
}
