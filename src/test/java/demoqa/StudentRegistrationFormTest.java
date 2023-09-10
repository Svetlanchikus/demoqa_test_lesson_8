package demoqa;

import demoqa.pages.StudentRegistrationFormPage;
import org.junit.jupiter.api.Test;

public class StudentRegistrationFormTest extends TestBase {

    StudentRegistrationFormPage studentRegistrationForm = new StudentRegistrationFormPage();
    TestData testData = new TestData();

    @Test
    void successfulRegistrationWithRequiredFieldsTest() {
        studentRegistrationForm
                .openPage()
                .checkThatTheSiteHasOpened()
                .closeBanners()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setGender(testData.gender)
                .setNumber(testData.number)
                .setBirthDate(testData.day,
                        testData.month,
                        testData.year)
                .clickSubmit()
                .checkThatTheTableHasOpened()
                .checkValueName(testData.firstName,
                        testData.lastName)
                .checkValueEmptyEmail()
                .checkValueGender(testData.gender)
                .checkValueNumber(testData.number)
                .checkValueBirthDate(testData.day,
                        testData.month,
                        testData.year)
                .checkValueEmptySubjects()
                .checkValueEmptyHobbies()
                .checkValueEmptyPhoto()
                .checkValueEmptyAddress()
                .checkValueEmptyStateAndCity()
                .clickClose();
    }

    @Test
    void successfulRegistrationWithAllFieldsTest() {
        studentRegistrationForm
                .openPage()
                .checkThatTheSiteHasOpened()
                .closeBanners()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setNumber(testData.number)
                .setBirthDate(testData.day,
                        testData.month,
                        testData.year)
                .setSubjects(testData.subjects)
                .setHobbies(testData.hobbies)
                .setPhoto(testData.photo)
                .setAddress(testData.address)
                .setState(testData.selectState)
                .setCity(testData.selectCity)
                .clickSubmit()
                .checkThatTheTableHasOpened()
                .checkValueName(testData.firstName,
                        testData.lastName)
                .checkValueEmail(testData.email)
                .checkValueGender(testData.gender)
                .checkValueNumber(testData.number)
                .checkValueBirthDate(testData.day,
                        testData.month,
                        testData.year)
                .checkValueSubjects(testData.subjects)
                .checkValueHobbies(testData.hobbies)
                .checkValuePhoto(testData.photo)
                .checkValueAddress(testData.address)
                .checkValueStateAndCity(testData.selectState,
                        testData.selectCity)
                .clickClose();
    }
}
