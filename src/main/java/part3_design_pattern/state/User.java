package part3_design_pattern.state;

public class User {

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(Role role){
        this.role = role;
    }
}
