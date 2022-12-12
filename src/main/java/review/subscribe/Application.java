package review.subscribe;

public class Application {

    public static void main(String[] args) {

        Customer customer = new Customer(100000);
        DeliveryMan deliveryMan = new DeliveryMan(customer);

        deliveryMan.claim();
        customer.checkMoney();


    }
}
