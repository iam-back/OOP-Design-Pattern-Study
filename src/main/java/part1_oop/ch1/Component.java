package part1_oop.ch1;

public class Component {

    private String id;
    private OnClickListener onClickListener;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public Component(String id) {
        this.id = id;
    }

    public Component(){};

}
