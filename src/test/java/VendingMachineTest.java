import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    @Test
    public void TestGetChangeAmount() throws Exception{
        VendingMachine machine = new VendingMachine();
        machine.putCoin(100);

        assertEquals("투입금액 100원", 100, machine.getChangeAmount());

        machine.putCoin(500);
        assertEquals("추가 투입 금액 500원", 600, machine.getChangeAmount());
    }

    @Test // 거스름돈 50원
    public void testReturnChangeCoinSet_oneCoin_50() throws Exception{

        VendingMachine machine = new VendingMachine();
        machine.putCoin(100);
        machine.putCoin(100);
        machine.putCoin(500);
        machine.selectDrink(new Drink("Cola", 650));

        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(50);
        assertEquals("700원 투입 후 650원 음료 선택", expectedCoinSet, machine.getChangeCoinSet());
    }

    @Test
    public void testReturnChangeCoinSet_coin_180() throws Exception{

        VendingMachine machine = new VendingMachine();
        machine.putCoin(100);
        machine.putCoin(100);
        machine.putCoin(500);
        machine.selectDring(new Dring("soda", 520));

        CoinSet ExpectedCoinSet = new CoinSet();
        expectedCoinSet.add(100);
        expectedCoinSet.add(50);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);

        assertEquals("700원 투입 후 520원 음료 선택", expectedCoinSet, machine.getChangeCoinSet());
    }
}
