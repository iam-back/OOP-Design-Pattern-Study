package part3_design_pattern.template_method.apply;

import part3_design_pattern.template_method.Auth;

public abstract class Authenticator {

    /*
    반복될 수 있는 절차는 구현하고, 변경될 수 있는 세부 구현에 대해서는 추상화하여 상속하도록 함
     */

    /*
    인증 절차는 반복될 수 있음

    세부적으로 변경될 수 있는 구현은 abstract 로 구현하여 호출
     */
    public Auth authenticate(String id, String password){

        if(!doAuthenticate(id,password))
            throw createException();

        return createAuth(id);

    }

    protected abstract Auth createAuth(String id);

    protected abstract boolean doAuthenticate(String id, String password);

    private RuntimeException createException(){
        return new RuntimeException();
    }
}
