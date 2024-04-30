

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class Allure {
    @Test
    @Feature("Проверка ишью")
    @Story("Проверка ишью")
    @Owner("a.samoilenko")
    @DisplayName("Проверка ишью с Листенер")
    void allureTest(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com/");
        $(withText("Search or jump to...")).click();
        $("#query-builder-test").setValue("samoilenko").pressEnter();
        $("[data-testid='desktop-filters']").shouldHave(text("Issues"));
    }

    @Test
    @Feature("Проверка ишью")
    @Story("Проверка ишью")
    @Owner("a.samoilenko")
    @DisplayName("Проверка ишью через лямбда-стэп")
    void allureTestWithLiambda(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открыть главную страницу", () -> {
        open("https://github.com/");
        });
        step("Ввести в троку поиска 'Самойленко' и нажать интер", () -> {
        $(withText("Search or jump to...")).click();
        $("#query-builder-test").setValue("samoilenko").pressEnter();
        });
        step("Убедиться, что на странице есть раздел 'Issues'", () -> {
        $("[data-testid='desktop-filters']").shouldHave(text("Issues"));
        });
    }



}