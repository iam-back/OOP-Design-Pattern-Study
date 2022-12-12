package part3_design_pattern.strategy;

public class Item {

    private int price;
    private boolean state;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isFresh(){
        return state;
    }
}
