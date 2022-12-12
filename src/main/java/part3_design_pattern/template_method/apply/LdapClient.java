package part3_design_pattern.template_method.apply;

import part3_design_pattern.template_method.LdapContext;

public class LdapClient {

    public boolean authenticate(String id, String password){
        return true;
    }

    public LdapContext find(String id){
        return new LdapContext();
    }
}
