package Lesson7;

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
        var subjects = "Accounting";
        var hobbies = "Music";
        var currentAddress = "РАСЕЯ";
        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(eMail);
        $(withText(gender)).click();
        $("#userNumber").setValue(mobileNumber);
        $(withText(hobbies)).click();
        $("#currentAddress").setValue(currentAddress);
        $(".react-datepicker__input-container").click();
        $(".react-datepicker__year-select").$(byText("1982")).click();
        $(".react-datepicker__month-select").$(byText("September")).click();
        $(".react-datepicker__day--017").click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#city").$(byText("Noida")).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));


    }
}
