package part3_design_pattern.strategy;

import java.util.List;

public class Context {

    public int calculate(boolean firstGuest, List<Item> items){
        int sum = 0;

        /*
        서로 다른 가격 정책이 존재하고,
        새로운 가격 정책이 추가될 때마다 메소드의 수정이 이루어진다.

        또 가격 정책의 추가 시,
        다른 메소드에서도 가격 정책을 사용할 경우, 변경이 필요하다.
         */
        for (Item item : items) {
            if(firstGuest){
                sum += (int) (item.getPrice() * 0.9);
            } else if(!item.isFresh()){
                sum += (int) (item.getPrice() * 0.8);
            } else
                sum += item.getPrice();
        }
        return sum;
    }


}
