package part3_design_pattern.strategy.apply;

import part3_design_pattern.strategy.Item;

public class VIPGuestDiscountStrategy implements DiscountStrategy{

    @Override
    public int getDiscountPrice(Item item) {
        return 0;
    }
}
