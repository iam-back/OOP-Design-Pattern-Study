package part1_oop.ch3;

public class Application {

    public static void main(String[] args) {

        TurboPlane turboPlane = new TurboPlane();
        Plane plane;
        Turbo turbo;

        plane = turboPlane;
        turbo = turboPlane;

        plane.fly();
        turboPlane.fly();

    }
}
