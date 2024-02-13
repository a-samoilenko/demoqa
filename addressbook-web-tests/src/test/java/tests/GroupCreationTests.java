package tests;

import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.fillGroupForm("test", "test", "test");
        app.returnToGroupPage();
    }

}