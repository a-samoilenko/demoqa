package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static pages.RegistrationPage.*;

public class RegistrationTest extends TestBase {

    @Test
    void successRegistrationTest() {
        String firstName = "Alex",
                lastName = "Ivanov",
                eMail = "ivanov@mail.ru",
                gender = "Male",
                mobileNumber = "8912365421",
                yearOfBirth = "1982",
                monthOfBirth = "September",
                dayOfBirth = "17",
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
