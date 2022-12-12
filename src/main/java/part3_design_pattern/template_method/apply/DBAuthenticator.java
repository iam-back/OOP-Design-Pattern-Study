package part3_design_pattern.template_method.apply;

import part3_design_pattern.template_method.Auth;

public class DBAuthenticator extends Authenticator{

    @Override
    protected Auth createAuth(String id) {
        return null;
    }

    @Override
    protected boolean doAuthenticate(String id, String password) {
        return false;
    }
}
