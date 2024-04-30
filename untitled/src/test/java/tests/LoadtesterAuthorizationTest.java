package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoadtesterAuthorizationTest {
    @CsvFileSource(resources = "/credentials.csv")
    @ParameterizedTest(name = "Авторизация по логину {0}")  //название теста
    @Tags({@Tag("BLOCKER"), @Tag("UI_TEST")})  // тэги, котоые мы хотим навесить
    void authorization(String login, String password){
        Configuration.timeout = 8000;
        open("https://platformauth-ift3.sc.dev.sbt/auth/realms/PlatformAuth/protocol/openid-connect/auth?client_id=PlatformAuth-Proxy&response_type=code&state=290ed7517894b132a014ca26d56b4e57&nonce=ffcd89ab8f16b2998d74b8aea7ff36d4&redirect_uri=https%3A%2F%2Fplatform-ift3.sc.dev.sbt%2Fopenid-connect-auth%2Fredirect_uri&scope=openid");
        $("#username").setValue(login);
        $("#password").setValue(password);
        $("#kc-login").click();
        $(withText("Overload")).click();
        $(withText("Load Tester")).click();
        $("#line-chart-outlined-tests").shouldHave(text("Тесты"));
        closeWindow();
    }
}
