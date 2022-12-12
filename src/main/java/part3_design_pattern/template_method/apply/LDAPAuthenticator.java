package part3_design_pattern.template_method.apply;

import part3_design_pattern.template_method.Auth;
import part3_design_pattern.template_method.LdapContext;

public class LDAPAuthenticator extends Authenticator{

    private LdapClient ldapClient;

    @Override
    protected Auth createAuth(String id) {
        LdapContext ldapContext = ldapClient.find(id);

        return new Auth(id, ldapContext.getAttribute("name"));
    }

    @Override
    protected boolean doAuthenticate(String id, String password) {
        return ldapClient.authenticate(id,password);
    }
}
