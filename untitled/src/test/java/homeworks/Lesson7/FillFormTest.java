package homeworks.Lesson7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.*;
import org.openqa.selenium.*;

import java.io.*;
import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FillFormTest {


    @BeforeAll
    static void startTest() {
        Configuration.pageLoadStrategy = "none";
        Configuration.timeout = 8000;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1600x900";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillForm() {

        var firstName = "Alex";
        var lastName = "Ivanov";
        var eMail = "ivanov@mail.ru";
        var gender = "Male";
        var mobileNumber = "8912365421";
        var yearOfBirth = "1982";
        var monthOfBirth = "September";
        var dayOfBirth = "17";
        var subjects = "Arts";
        var hobbies = "Music";
        var city = "NCR";
        var city2 = "Noida";
        var currentAddress = "РАСЕЯ";
        var assertText = "Thanks for submitting the form";

        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(eMail);
        $(withText(gender)).click();
        $("#userNumber").setValue(mobileNumber);
        $(withText(hobbies)).click();
        $("#currentAddress").setValue(currentAddress);
        $(".react-datepicker__input-container").click();
        $(".react-datepicker__year-select").$(byText(yearOfBirth)).click();
        $(".react-datepicker__month-select").$(byText(monthOfBirth)).click();
        $(".react-datepicker__day--0"+dayOfBirth).click();
        $("#subjectsInput").setValue(subjects).pressEnter();
        $("#state").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#city").click();
        $("#city").$(byText(city2)).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text(assertText));

        //один безобидный комментарий


    }
}
