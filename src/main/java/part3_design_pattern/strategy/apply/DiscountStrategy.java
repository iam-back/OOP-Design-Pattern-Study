package part3_design_pattern.strategy.apply;

import part3_design_pattern.strategy.Item;

public interface DiscountStrategy {

    int getDiscountPrice(Item item);

}
