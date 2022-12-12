package part1_oop.ch2;

public class Application {

    public static void main(String[] args) {

        Member member = new Member();

        /*
         절차지향적 코드
         데이터 중심으로 작성하게 되면, 캡슐화를 깨뜨리게 된다
         */
        if(member.getExpiryDate()!=null){
            /*
             만료 여부를 데이터를 직접 가져와서 처리
             만료 여부를 요구하는 다른 코드 작성 시 다시 구현해야 함
             */
        }

        /*
        Tell, Don't Ask - 데이터를 요청하지 않고, 기능을 제공할 것
         */
        if(member.isExpired()){
            /*
            만료 여부를 객체에게 Message 를 보내 처리
            캡슐화되어 재사용 가능하며, 내부 변경에 유연함을 가져갈 수 있음
             */
        }

    }
}
