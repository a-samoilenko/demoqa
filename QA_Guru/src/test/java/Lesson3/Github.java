package Lesson3;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class Github {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
    }
}