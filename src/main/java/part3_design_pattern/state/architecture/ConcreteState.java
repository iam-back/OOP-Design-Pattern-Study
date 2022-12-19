package part3_design_pattern.state.architecture;

public class ConcreteState implements State{

    /*
    Concrete State 들은 상태별 메서드들에 대한 자체적인 구현을 제공합니다.
    여러 상태에서 유사한 코드의 중복을 피하기 위하여
    어떤 공통 행동을 캡슐화하는 중간 추상 클래스들을 제공할 수 있습니다.

    State 객체들은 Context 객체에 대한 역참조를 저장할 수 있습니다.
    이 참조를 통해 State 는 Context 객체에서 모든 필요한 정보를 가져올 수 있고
    상태 천이(Transition)를 시작할 수 있습니다.
     */

    private Context context;

    @Override
    public void doPost() {

    }

    @Override
    public void doGet() {

    }
}
