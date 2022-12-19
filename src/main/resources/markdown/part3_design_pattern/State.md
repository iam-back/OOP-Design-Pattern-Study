# State

---

***상태가 여러 가지인 경우에 처해있는가:상태 패턴***

## 상태는 유한하다

> ***유한 상태 기계***
> 
> 모든 주어진 순간에 프로그램이 속해 있는 상태의 수는 유한하다. <br>
> 현재 어떤 상태에 있는지에 따라 프로그램은 수행되고, 상태 또한 달라질 수 있다. <br>
> 상태의 갯수가 많을수도 있다. 하지만 그 경우의 수는 언제나 유한할 것이다.

## Situation

Document(문서) 객체는 Draft(초안), Moderation(검토),Published(출판) 의 세 가지 상태를 갖는다.
Document 는 publish Operator 를 가지며, 각 상태에 따라 다르게 동작한다. 다음은 각 상태에서의 publish 동작

* Draft 에서는 Document 를 Moderation 상태로 변경함
* Moderation 상태에서 User 의 Role 이 ADMIN 이면, PUBLISH 로 변경. 아니면 상태 변경 불가
* Published 상태에서는 아무것도 하지 않음

이는 상태에 의존하는 행위를 추가할수록 그 단점이 명확해진다. 

## Workaround

상태 패턴은 객체의 상태를 interface 로 다루어 모든 상태에 대한 operator 를 구현하여 콘크리트 클래스로 만들어 해결한다. <br>
context 객체는 상태를 참조하고, 상태를 상속받는다.

* Document 의 경우, State 를 참조하고, 각 상태에 따른 행위를 State concrete class 에서 구현하여 호출





