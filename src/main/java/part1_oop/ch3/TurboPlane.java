package part1_oop.ch3;

public class TurboPlane extends Plane implements Turbo{

    @Override
    public void boost() {
    }

    @Override
    public void fly() {
        System.out.println(TurboPlane.class.getName() + " :: fly mehtod");
    }
}
