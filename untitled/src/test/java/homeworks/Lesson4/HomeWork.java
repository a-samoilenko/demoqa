package homeworks.Lesson4;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork {

    @Test
    void hoverSolutons(){
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("[content='The AI Powered Developer Platform.']").should(exist);
//        sleep(5000);
    }


}
