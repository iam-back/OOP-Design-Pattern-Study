package part1_oop.ch1;

public interface ScreenUI {

    /*
    show 는 menu 이벤트에 의해 동작하고,
    그리고 각각의 menu 에 대한 button 구현을 담당
     */
    void show();
    void handleButton1Click();
    void handleButton2Click();

}
