import org.junit.Assert;
import org.junit.Test;

public class TestChangeMachine {

    @Test
    public void testGetChangeAmount() {
        ChangeMachine cm = new ChangeMachine(1000);
        cm.getMoney();
        Assert.assertEquals(1000, cm.getMoney() );
    }

}
