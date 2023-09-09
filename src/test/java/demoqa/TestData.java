package demoqa;

import com.github.javafaker.Faker;

import static demoqa.utils.RandomUtils.*;


public class TestData {
    static Faker faker = new Faker();
    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = getRandomGender(),
            number = faker.numerify("##########"),
            month = getRandomMonth(),
            year = getRandomYear(),
            day = getRandomDay(month),
            subjects = getRandomSubject(),
            hobbies = getRandomHobie(),
            photo = "photo_1.png",
            address = faker.address().fullAddress(),
            selectState = getRandomState(),
            selectCity = getRandomCity(selectState);
}

