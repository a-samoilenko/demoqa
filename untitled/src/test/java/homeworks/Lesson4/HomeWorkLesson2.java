package homeworks.Lesson4;
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

public class HomeWorkLesson2 {
    @Test
    void dragAndDrop(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(225, 0).release().perform();
        $("#column-a").shouldHave(text("B"));
        sleep(5000);
    }

}
