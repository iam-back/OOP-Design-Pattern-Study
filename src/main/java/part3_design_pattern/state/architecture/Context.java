package part3_design_pattern.state.architecture;

public class Context {

    /*
    Context 는 구상 State 객체 중 하나에 대한 참조를 저장하고 모든 상태별 작업을 그곳에 위임합니다.
    Context 는 State interface 를 통해 State 객체와 통신하며,
     새로운 상태 객체를 전달하기 위한 setter를 노출합니다
     */
    private State state;

    public Context(State state){
        this.state = state;
    }



}
