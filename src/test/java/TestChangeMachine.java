import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TestChangeMachine {

    @Test
    public void testGetAmount_돈_얼마_넣었는지_확인() {
        ChangeMachine cm = new ChangeMachine(1000);
        cm.getMoney();
        Assert.assertEquals(1000, cm.getMoney() );
    }

    @Test
    public void testSumAmount_돈_넣었을때_총액_계산() {
        ChangeMachine cm = new ChangeMachine();
        cm.sumMoney(1000);
        Assert.assertThat(cm.getMoney(), CoreMatchers.is(1000));
    }

}
