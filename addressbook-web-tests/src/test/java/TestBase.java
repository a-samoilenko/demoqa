import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook/");
        driver.manage().window().setSize(new Dimension(1050, 840));
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.id("LoginForm")).click();
    }

    protected void returnToGroupPage() {
        driver.findElement(By.cssSelector("#nav > ul > li.admin > a")).click();
    }

    protected void fillGroupForm(String name, String header, String footer) {
        driver.findElement(By.name("new")).click();
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(name);
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(header);
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(footer);
        driver.findElement(By.name("submit")).click();
    }

    protected void goToGroupPage() {
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
        driver.findElement(By.cssSelector("#nav > ul > li.admin > a")).click();
    }

    @AfterEach
    public void tearDown() {

        driver.quit();
    }

    protected void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }

    protected void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
