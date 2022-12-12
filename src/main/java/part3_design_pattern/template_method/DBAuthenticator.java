package part3_design_pattern.template_method;

public class DBAuthenticator {

    private UserRepository userRepository;

    public DBAuthenticator(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Auth authenticate(String id, String password){
        User user = userRepository.selectById(id);
        boolean auth = user.isPasswordEqual(password);

        if(!auth){
            throw createException();
        }

        return new Auth(id,user.getName());
    }

    private AuthException createException(){
        return new AuthException();
    }
}
