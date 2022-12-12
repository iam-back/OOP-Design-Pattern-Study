package review.subscribe;

public class Customer {

    private Wallet wallet = new Wallet();

    public int pay(int payment){

        if(this.wallet==null)
            throw new WalletNotFoundException();

        if(this.wallet.getMoney()>=payment){
            return payment;
        }
        return -1;
    }

    public Customer(int money){
        this.wallet.setMoney(money);
    }

    public void checkMoney(){
        System.out.println("남은 예금은 : " + this.wallet.getMoney());
    }
}
