import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestChangeMachine {

    @Test
    public void testGetAmount_돈_얼마_넣었는지_확인() {
        ChangeMachine cm = new ChangeMachine(1000);
        cm.getMoney();
        assertEquals(1000, cm.getMoney() );
    }

    @Test
    public void testSumAmount_돈_넣었을때_총액_계산() {
        ChangeMachine cm = new ChangeMachine();
        cm.sumMoney(1000);
        assertThat(cm.getMoney(), is(1000));
    }

    @Test
    public void TestSetDrinkPrice_칠백원_어치_음료수_돈확인() {
        ChangeMachine cm = new ChangeMachine();
        cm.setDrinkPrice(1000);
        assertThat(cm.getDrinkPrice(),is(1000));
    }

}
