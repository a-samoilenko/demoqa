package tests;

import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().fillGroupForm("test", "test", "test");
        app.getGroupHelper().returnToGroupPage();
    }

}