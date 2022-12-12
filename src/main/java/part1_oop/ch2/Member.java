package part1_oop.ch2;

import java.util.Date;

public class Member {

    private Date expiryDate;
    private boolean male;
    private long DAY30 = 1000L * 60 * 60 * 24 * 30;

    public Date getExpiryDate(){
        return this.expiryDate;
    }

    public boolean isMale(){
        return male;
    }

    public int getExpiryDateToInt(){
        return expiryDate.getDate();
    }

    /*
    데이터 중심이 아닌 캡슐화를 통해 호출하게 되면,
    캡슐화된 기능을 사용하는 코드에는 영향이 없음
     */
    public boolean isExpired(){
        return expiryDate!=null&&expiryDate.getDate() < System.currentTimeMillis();
    }

    /*
     여성의 경우 30일이 지나도 expired 되지 않도록 요구사항 변경
     */
    public boolean isExpired2(){
        if(this.male){
            return this.expiryDate!=null&&
                    this.expiryDate.getDate() < System.currentTimeMillis();
        }
        return this.expiryDate!=null&&
                this.expiryDate.getDate() < System.currentTimeMillis() - DAY30;
    }

    /*
    하지만, 위의 두 예는 데미테르의 법칙에 위배되여 캡슐화에 어긋난다.
    expiryDate 가 메소드 체이닝으로 Date 의 메소드를 호출했기 때문이다.

    따라서, 데미테르의 법칙까지 적용시켜 캡슐화한다면, 다음과 같다
     */
    public boolean isExpired3(){
        if(this.male){
            return this.expiryDate!=null&&
                    getExpiryDateToInt() < System.currentTimeMillis();
        }
        return this.expiryDate!=null&&
                getExpiryDateToInt() < System.currentTimeMillis() - DAY30;
    }
}
