import org.junit.jupiter.api.Test;


public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        goToGroupPage();
        selectGroup();
        deleteSelectedGroups();
    }

}
