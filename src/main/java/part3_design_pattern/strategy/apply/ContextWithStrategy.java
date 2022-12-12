package part3_design_pattern.strategy.apply;

import part3_design_pattern.strategy.Item;

import java.util.List;

public class ContextWithStrategy {

    private DiscountStrategy discountStrategy;
    private List<Item> items;

    public ContextWithStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public int calculate(List<Item> items){

        int sum = 0;

        /*
        Context 에 따른 Strategy 를 호출하도록 함
         */
        for(Item item : items){
            sum += discountStrategy.getDiscountPrice(item);
        }

        return sum;
    }

    /*
    특정 기능 및 조건에 따라 Strategy 콘크리트 클래스를 생성하도록 구현

    Strategies

    1) 첫 번째 손님인가
    2) VIP 손님인가
    3) 일반 손님인가
     */
    public void onFirstGuestButtonClick(){
        discountStrategy = new FirstGuestDiscountStrategy();
    }

    public void onNormalGuestButtonClick(){
        discountStrategy = new NormalGuestDiscountStrategy();
    }

    public void onVIPGuestButtonClick(){
        discountStrategy = new VIPGuestDiscountStrategy();
    }

    /*
    몇 번째 손님의 Item 인지에 따라 Strategy 가 바뀜
     */
    public void onCalculationButtonClick(){
        ContextWithStrategy calculator = new ContextWithStrategy(discountStrategy);

        int price = calculator.calculate(items);
    }


}
