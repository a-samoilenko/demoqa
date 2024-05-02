import Data.TestData;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static Pages.RegistrationPage.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
@Tag("fillform")
public class FillFormWithJenkinsAndSelenoid extends TestBase {
    @Test
//    @Feature("Регистрация пользователя")
//    @Story("Регистрация пользователя")
//    @Owner("a.samoilenko")
//    @DisplayName("Успешная регистрация")
    void successRegistrationTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        String firstName = TestData.fakeFirstname,
                lastName = TestData.rufaker.name().lastName(),
                eMail = TestData.faker.internet().emailAddress(),
                gender = TestData.faker.options().option("Male", "Female", "Other"),
                mobileNumber = TestData.faker.number().numberBetween(1000000000l, 9999999999l) + "",
                yearOfBirth = TestData.faker.number().numberBetween(1900, 2022) + "",
                monthOfBirth = TestData.faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
                dayOfBirth = String.format("%02d", TestData.faker.number().numberBetween(1, 28)),
                subjects = "Arts",
                hobbies = "Music",
                city = "NCR",
                city2 = "Noida",
                currentAddress = "РАСЕЯ",
                assertText = "Thanks for submitting the form";

        step("Открываем главную страницу", () -> {
        openPage();
        });
        step("Заполняем пользователские данные", () -> {
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
        });
        step("Проверяем успешное заполнение формы", () -> {
        $("#example-modal-sizes-title-lg").shouldHave(text(assertText));
        });
    }
}
