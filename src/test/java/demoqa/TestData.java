package demoqa;

import com.github.javafaker.Faker;
import demoqa.utils.RandomUtils;

import static demoqa.utils.RandomUtils.*;


public class TestData {
    Faker faker = new Faker();
    RandomUtils randomUtils = new RandomUtils();
    public String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = randomUtils.getRandomGender(),
            number = faker.numerify("##########"),
            month = randomUtils.getRandomMonth(),
            year = randomUtils.getRandomYear(),
            day = randomUtils.getRandomDay(month),
            subjects = randomUtils.getRandomSubject(),
            hobbies = randomUtils.getRandomHobie(),
            photo = "photo_1.png",
            address = faker.address().fullAddress(),
            selectState = randomUtils.getRandomState(),
            selectCity = randomUtils.getRandomCity(selectState);
}

