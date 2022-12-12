package part0_syntax.overloading;

public class Number implements Numerable{

    private int num;

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int getNum() {
        return this.num;
    }
}
