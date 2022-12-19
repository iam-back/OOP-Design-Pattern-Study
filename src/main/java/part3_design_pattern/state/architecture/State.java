package part3_design_pattern.state.architecture;

public interface State {

     /*
     State interface 는 State 별 메서드들을 선언합니다.
     이러한 메서드들은 모든 Concrete State 에서 유효해야 합니다.
     왜냐하면 결코 호출될 일 없는 쓸모없는 메서드들이 일부 상태 내에 존재하는 것은
     원하지 않을 것이기 때문입니다.
      */

     void doPost();
     void doGet();

}
