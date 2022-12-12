package part1_oop.ch1;

public interface OnClickListener {

    /*
     menu 클릭과 button 클릭에 대해 서로 다르게 동작하도록 구현
     공통된 점은 클릭하는 이벤트 밖에 없다.
     */
    void clicked(Component component);
}
