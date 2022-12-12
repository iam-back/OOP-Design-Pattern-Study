package part1_oop.ch2;

public class Wallet {

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void subtractMoney(int debit){
        this.money-=debit;
    }

}
