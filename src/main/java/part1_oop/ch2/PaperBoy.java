package part1_oop.ch2;

public class PaperBoy {

    private int money = 0;

    /*
    이 메소드는 고객에게 비용을 지불하도록 하는 기능
    잘보면 신문배달부가 고객의 지갑에 직접 손대고 있음

    이는 데미테르의 규칙에 위배됨 (Customer 의 데이터가 가진 메소드에 접근)
     */
    public void notCapsuledProcess(){
        int payment = 10000;

        Customer customer = new Customer();

        Wallet wallet = customer.getWallet();

        if(wallet.getMoney() >= payment){
            wallet.subtractMoney(payment);
        } else {
            // 지갑에 돈이 없다면, 다음에 청구
        }
    }

    public void enCapsuledProcess(){
        int payment = 10000;

        Customer customer = new Customer();

        if(customer.isPayable(payment)){
            customer.pay(payment);
            this.money+=payment;
        }
    }

    // 지갑이 없는 경우도 처리하게 됨
    public void enCapsuledProcess2(){

        int payment = 10000;
        Customer customer = new Customer();

        try{
            int paidAmount = customer.getPayment(payment);
        } catch(NotEnoughMoneyException | WalletNotFoundException e){
            e.printStackTrace();;
        }

    }


}
