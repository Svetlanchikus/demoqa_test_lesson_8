package demoqa;

import demoqa.pages.StudentRegistrationFormPage;
import org.junit.jupiter.api.Test;

import static demoqa.TestData.*;


public class StudentRegistrationFormTest extends TestBase {

    StudentRegistrationFormPage studentRegistrationForm = new StudentRegistrationFormPage();

    @Test
    void successfulRegistrationWithRequiredFieldsTest() {
        studentRegistrationForm
                .openPage()
                .checkThatTheSiteHasOpened()
                .closeBanners()
                .setRequiredFields(firstName,
                        lastName,
                        gender,
                        number,
                        day,
                        month,
                        year)
                .clickSubmit()
                .checkThatTheTableHasOpened()
                .checkResultRequiredFields(firstName,
                        lastName,
                        gender,
                        number,
                        day,
                        month,
                        year)
                .clickClose();
    }

    @Test
    void successfulRegistrationWithAllFieldsTest() {
        studentRegistrationForm
                .openPage()
                .checkThatTheSiteHasOpened()
                .closeBanners()
                .setAllFields(firstName,
                        lastName,
                        email,
                        gender,
                        number,
                        day,
                        month,
                        year,
                        subjects,
                        hobbies,
                        photo,
                        address,
                        selectState,
                        selectCity)
                .clickSubmit()
                .checkThatTheTableHasOpened()
                .checkResultAllFields(firstName,
                        lastName,
                        email,
                        gender,
                        number,
                        day,
                        month,
                        year,
                        subjects,
                        hobbies,
                        photo,
                        address,
                        selectState,
                        selectCity)
                .clickClose();
    }
}
