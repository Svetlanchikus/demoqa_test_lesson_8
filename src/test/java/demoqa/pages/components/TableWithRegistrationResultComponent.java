package demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TableWithRegistrationResultComponent {
    SelenideElement
            tableHeader = $("#example-modal-sizes-title-lg"),
            lineStudentName = $x("//tbody/tr[1]/td[2]"),
            lineStudentEmail = $x("//tbody/tr[2]/td[2]"),
            lineGender = $x("//tbody/tr[3]/td[2]"),
            lineMobile = $x("//tbody/tr[4]/td[2]"),
            lineDateBirth = $x("//tbody/tr[5]/td[2]"),
            lineSubjects = $x("//tbody/tr[6]/td[2]"),
            lineHobbies = $x("//tbody/tr[7]/td[2]"),
            linePicture = $x("//tbody/tr[8]/td[2]"),
            lineAddress = $x("//tbody/tr[9]/td[2]"),
            lineStateAndCity = $x("//tbody/tr[10]/td[2]"),
            buttonClose = $("#closeLargeModal");

    public TableWithRegistrationResultComponent clickClose() {
        buttonClose.click();

        return this;
    }

    public TableWithRegistrationResultComponent checkThatTheTableHasOpened() {
        tableHeader.shouldHave(text("Thanks for submitting the form"));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueName(String valueFirstName, String valueLastName) {
        lineStudentName.shouldHave(text(valueFirstName + " " + valueLastName));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueEmail(String value) {
        lineStudentEmail.shouldHave(text(value));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueGender(String value) {
        lineGender.shouldHave(text(value));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueNumber(String value) {
        lineMobile.shouldHave(text(value));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueBirthDate(String valueDay,
                                                                    String valueMonth,
                                                                    String valueYear) {
        lineDateBirth.shouldHave(text(valueDay + " " + valueMonth + "," + valueYear));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueSubjects(String value) {
        lineSubjects.shouldHave(text(value));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueHobbies(String value) {
        lineHobbies.shouldHave(text(value));

        return this;
    }

    public TableWithRegistrationResultComponent checkValuePhoto(String value) {
        linePicture.shouldHave(text(value));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueAddress(String value) {
        lineAddress.shouldHave(text(value));

        return this;
    }

    public TableWithRegistrationResultComponent checkValueStateAndCity(String valueState, String valueCity) {
        lineStateAndCity.shouldHave(text(valueState + " " + valueCity));
        return this;
    }

    public TableWithRegistrationResultComponent checkValueEmptyEmail() {
        lineStudentEmail.shouldBe(empty);

        return this;
    }

    public TableWithRegistrationResultComponent checkValueEmptySubjects() {
        lineSubjects.shouldBe(empty);

        return this;
    }

    public TableWithRegistrationResultComponent checkValueEmptyHobbies() {
        lineHobbies.shouldBe(empty);

        return this;
    }

    public TableWithRegistrationResultComponent checkValueEmptyPhoto() {
        linePicture.shouldBe(empty);

        return this;
    }

    public TableWithRegistrationResultComponent checkValueEmptyAddress() {
        lineAddress.shouldBe(empty);

        return this;
    }

    public TableWithRegistrationResultComponent checkValueEmptyStateAndCity() {
        lineStateAndCity.shouldBe(empty);

        return this;
    }
}

