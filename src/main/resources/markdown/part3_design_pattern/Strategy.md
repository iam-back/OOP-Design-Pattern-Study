# Strategy

---

***자주 추가되는/조건이 분기되는 기능인가 : 전략 패턴을 고려할 것***

## Situation

* 서로 다른 계산 정책들이 한 코드에 섞어 있음
* 가격 정책은 추가될 가능성이 있음

## Context 와 Strategy 의 분리

### Strategy

* 추가되는 기능을 인터페이스로 추상화하여 세부 조건에 따라 특정 콘크리트 클래스를 주입
### Context

* Strategy 의 Operation 을 사용하는 객체
* Strategy 객체를 직접 생성하여 Message 를 보냄

***즉, 전략 패턴이란 특정 Context 에서 알고리즘(Strategy) 를 분리하는 설계 방법***

## Context 가 Strategy 의 상세 구현을 아는 것이 문제인가?

* Strategy 의 콘크리트 클래스와 Context 의 코드가 쌍을 이루기 때문에 윶 보수 문제가 발생할 가능성이 줄어듦
* 즉, 기능에 대응하는 콘크리트 클래스는 같이 추가, 삭제되고 변경은 되지 않음을 의미 (OCP 를 따름)
* 전략패턴을 통해 얻을 수 있는 이점은 Context 의 변경 없이 새로운 전략을 추가/삭제할 수 있다는 점, 그리고 이로 인한 변경은 전파되지 않는다는 점이다

## Lambda 와 Strategy

* Lambda 표현식을 사용한다면, Strategy 의 구현체를 사용하지 않고도 더 간결하게 표현할 수 있음
* 단, 이 경우 Strategy 는 람다 표현식이 될 하나의 메소드만 갖는 Functional Interface 이어야한다는 제약이 존재(default 와 static 에는 갯수 제약 없음, 쓰긴 쓰는 지 의문)
