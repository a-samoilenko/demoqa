import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.BeforeAll;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
        @BeforeAll
        static void startTest() {
            Configuration.pageLoadStrategy = "none";
            Configuration.timeout = 8000;
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.holdBrowserOpen = true;
        }
    }
