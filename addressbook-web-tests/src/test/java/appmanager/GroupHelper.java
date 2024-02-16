package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    private static WebDriver driver;
    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }


    public static void returnToGroupPage() {
        driver.findElement(By.cssSelector("#nav > ul > li.admin > a")).click();
    }

    public void fillGroupForm(String name, String header, String footer) {
        driver.findElement(By.name("new")).click();
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys(name);
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(header);
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(footer);
        driver.findElement(By.name("submit")).click();
    }

    public void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }
}
