package homeworks.Lesson15;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Allure {
    @Test
    @Feature("Проверка ишью")
    @Story("Проверка ишью через степ-аннотейшен")
    @Owner("a.samoilenko")
    @DisplayName("Проверка ишью с Листенер")
    void allureTest(){
        open("https://github.com/");
        $(withText("Search or jump to...")).click();
        $("#query-builder-test").setValue("samoilenko").pressEnter();
        $("[data-testid='desktop-filters']").shouldHave(text("Issues"));
    }
}
