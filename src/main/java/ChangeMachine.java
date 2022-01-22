public class ChangeMachine {

    private int money = 0;

    private int drinkPrice = 0;

    public ChangeMachine(int money) {
        this.money = money ;
    }

    public ChangeMachine(){
    }

    public int getMoney() {
        return money;
    }

    public int sumMoney(int i) {
        return money += i;
    }

    public int setDrinkPrice(int drinkPrice) {
        return this.drinkPrice = drinkPrice;
    }

    public int getDrinkPrice() {
        return this.drinkPrice;
    }
}
