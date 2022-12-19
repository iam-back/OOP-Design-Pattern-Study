package part3_design_pattern.state.apply;

import part3_design_pattern.state.User;

public class DocumentContext{

    private State state;
    private User user;

    public DocumentContext(User user, State state){
        this.user = user;
        this.state = state;
    }

    public void render() {
        this.state.render();
    }

    public void publish() {
        this.state.publish();
    }
}
