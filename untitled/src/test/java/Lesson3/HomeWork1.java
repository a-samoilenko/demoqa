package Lesson3;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class HomeWork1 {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        $(".search-input").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[data-testid='results-list'] h3 a").click();
        // проверка: заголовок selenide
        $("[data-pjax='repo-content-pjax-container']").shouldHave(text("selenide"));
        //        sleep(5000);
    }

}
