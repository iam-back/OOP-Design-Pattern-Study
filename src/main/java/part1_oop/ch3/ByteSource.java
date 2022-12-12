package part1_oop.ch3;

public interface ByteSource {

    /*
    요구사항이 추가될 때마다 읽어오는 데이터에 대해 조건을 걸 수 없다.
    이럴 땐, 읽어오는 행위를 추상화시켜 구현을 참조하도록 한다.
     */
    byte[] read();
}
