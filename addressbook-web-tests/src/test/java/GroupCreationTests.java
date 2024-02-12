import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        fillGroupForm("test", "test", "test");
        returnToGroupPage();
    }

}