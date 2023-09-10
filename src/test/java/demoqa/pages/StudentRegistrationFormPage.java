package demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.TableWithRegistrationResultComponent;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationFormPage {
    CalendarComponent calendar = new CalendarComponent();
    SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            stateField = $("#state"),
            stateCityWrapper = $("#stateCity-wrapper"),
            cityField = $("#city"),
            buttonSubmit = $("#submit");

    public StudentRegistrationFormPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public StudentRegistrationFormPage checkThatTheSiteHasOpened() {
        formTitle.shouldHave(text("Student Registration Form"));

        return this;
    }

    public StudentRegistrationFormPage closeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public StudentRegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public StudentRegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public StudentRegistrationFormPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public StudentRegistrationFormPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;
    }

    public StudentRegistrationFormPage setNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public StudentRegistrationFormPage setBirthDate(String valueDay,
                                                    String valueMonth,
                                                    String valueYear) {
        birthDateInput.click();
        calendar.setDate(valueDay, valueMonth, valueYear);
        return this;
    }

    public StudentRegistrationFormPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public StudentRegistrationFormPage setHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();
        return this;
    }

    public StudentRegistrationFormPage setPhoto(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public StudentRegistrationFormPage setAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public StudentRegistrationFormPage setState(String value) {
        stateField.click();
        stateCityWrapper.$(byText(value)).click();
        return this;
    }

    public StudentRegistrationFormPage setCity(String value) {
        cityField.click();
        stateCityWrapper.$(byText(value)).click();
        return this;
    }

    public TableWithRegistrationResultComponent clickSubmit() {
        buttonSubmit.click();

        return new TableWithRegistrationResultComponent();
    }
}
