package review.subscribe;

public class DeliveryMan {

    private int money = 0;
    private int payment = 10000;
    private Customer customer;

    public DeliveryMan(Customer customer){
        this.customer =customer;
    }


    public void claim(){

        money += customer.pay(payment);

        System.out.println("현재 받은 금액은 : " + this.money);
    }
}
