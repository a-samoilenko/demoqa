import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

    public class TestBase {
        @BeforeAll
        static void startTest() {
            Configuration.pageLoadStrategy = "none";
            Configuration.timeout = 8000;
            Configuration.baseUrl = "https://demoqa.com";
//            Configuration.browserSize = "1600x900";
            Configuration.holdBrowserOpen = true;
        }
    }
