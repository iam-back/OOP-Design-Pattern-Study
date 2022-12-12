package part1_oop.ch3;

public class FlowControllerTest {

    /*
    Interface 를 바라보고 프로그램을 작성해게 되면, 특정 콘크리트 클래스가 완성되지 않아도
    Mock 객체를 주입함으로써 테스트 가능하다.

    아래와 같이 직접 Mock 객체를 만들기보다는 Mockito 를 통해 주입하는 방식을 많이 사용한다.
     */
    public void testProcess(){
        ByteSource mockByteSource = new MockByteSource();

        FlowControllerWithDI flowControllerWithDI = new FlowControllerWithDI(mockByteSource);

        flowControllerWithDI.process();
    }
}
