package demoqa.utils;

import com.github.javafaker.Faker;

public class RandomUtils {
    Faker faker = new Faker();

    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return faker.options().option(genders);
    }

    public String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return faker.options().option(months);
    }

    public String getRandomYear() {

        return Integer.toString(faker.number().numberBetween(1900, 2022));
    }

    public String getRandomDay(String month) {
        int day;
        if (month.equals("February")) {
            day = faker.number().numberBetween(1, 28);
        } else if (month.equals("April")
                || month.equals("June")
                || month.equals("September")
                || month.equals("November")) {
            day = faker.number().numberBetween(1, 30);
        } else {
            day = faker.number().numberBetween(1, 31);
        }
        if (day < 10) {

            return "0" + day;

        } else {

            return Integer.toString(day);
        }
    }

    public String getRandomSubject() {
        String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};

        return faker.options().option(subjects);
    }

    public String getRandomHobie() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public String getRandomCity(String stateValue) {
        switch (stateValue) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};

                return faker.options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};

                return faker.options().option(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};

                return faker.options().option(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};

                return faker.options().option(city);
            }
        }

        return null;
    }
}
