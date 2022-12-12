package part0_syntax.overloading;

public class Overloading {

    public void get(){
        System.out.println("Empty Invoked");
    }

    public void get(int number, String name){
        System.out.println(number + name + ":: int, String Invoked");
    }

    public void get(String name, int number){
        System.out.println(name + number + ":: String, int Invoked");

    }

    public static void main(String[] args) {

        Overloading overloading = new Overloading();

        overloading.get();
        overloading.get(1,"back");
        overloading.get("back",2);
    }
}
