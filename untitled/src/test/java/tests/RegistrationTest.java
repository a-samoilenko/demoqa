package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static pages.RegistrationPage.*;
import static tests.TestData.*;

public class RegistrationTest extends TestBase {

    @Test
    void successRegistrationTest() {
        String firstName = fakeFirstname,
                lastName = rufaker.name().lastName(),
                eMail = faker.internet().emailAddress(),
                gender = faker.options().option("Male", "Female", "Other"),
                mobileNumber = faker.number().numberBetween(1000000000l, 9999999999l) + "",
                yearOfBirth = faker.number().numberBetween(1900, 2022) + "",
                monthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
                dayOfBirth = String.format("%02d", faker.number().numberBetween(1, 28)),
                subjects = "Arts",
                hobbies = "Music",
                city = "NCR",
                city2 = "Noida",
                currentAddress = "РАСЕЯ",
                assertText = "Thanks for submitting the form";

        openPage();
        setUser(firstName, lastName);
        setEmail(eMail);
        setGender(gender);
        setNumber(mobileNumber);
        setHobbie(hobbies);
        setcurrentAddress(currentAddress);
        setCalendar(yearOfBirth, monthOfBirth,dayOfBirth);


        $("#subjectsInput").setValue(subjects).pressEnter();
        $("#state").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#city").click();
        $("#city").$(byText(city2)).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text(assertText));

    }
}
