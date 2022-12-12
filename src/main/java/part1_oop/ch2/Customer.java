package part1_oop.ch2;

public class Customer {

    private Wallet wallet;

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    // 지불 가능한지를 Customer 가 확인
    public boolean isPayable(int payment){
        return this.wallet.getMoney()-payment>=0;
    }

    // PaperBoy 가 접근하지 못하고 내부적으로 Wallet 에서 돈을 꺼내도록 처리
    public void pay(int payment){
        this.wallet.subtractMoney(payment);
    }

    // 지갑이 없는 경우까지 처리한다면, 다음과 같다
    public int getPayment(int payment){
        if(this.wallet==null) throw new WalletNotFoundException();

        if(this.wallet.getMoney() >= payment){
            wallet.subtractMoney(payment);
            return payment;
        }

        throw new NotEnoughMoneyException();
    }
}
