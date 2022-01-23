public class ChangeMachine {

    private int money = 0;

    private int drinkPrice = 0;

    public ChangeMachine(){
    }

    public ChangeMachine(int money) {
        this.money = money;
    }

    public ChangeMachine(int money, int drink) {
        this.money = money;
        this.drinkPrice = drink;
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

    public int getChange() {
        int money = this.money;
        int drinkPrice = this.drinkPrice;

        int fiveH, oneH, fiveT, T ;
        int temp = money - drinkPrice ;

        int[] changeArr = {500, 100, 50, 10};
        int[] changeCnt = new int[4];

        int loop = 0;
        for(int change : changeArr ) {
            if (temp / change > 0) {
                changeCnt[loop] = temp / change;
                temp = temp % change;
            }

            loop = loop + 1;
        }

        return changeCnt[1];
    }
}
