package part3_design_pattern.strategy.apply;

import part3_design_pattern.strategy.Item;

public class FirstGuestDiscountStrategy implements DiscountStrategy{

    /*
    전략 콘크리트 클래스
     */

    @Override
    public int getDiscountPrice(Item item) {
        return (int)(item.getPrice() * 0.9);
    }
}
