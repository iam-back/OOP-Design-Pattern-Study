package part3_design_pattern.template_method;

public class LDAPAuthenticator {

    private LdapClient ldapClient;

    public LDAPAuthenticator(LdapClient ldapClient){
        this.ldapClient = ldapClient;
    }

    public Auth authenticate(String id, String password){
        User user = ldapClient.authenticate(id,password);
        boolean auth = user.isPasswordEqual(password);

        if(!auth){
            throw createException();
        }
        LdapContext ldapContext = ldapClient.find(id);

        return new Auth(id, ldapContext.getAttribute("name"));
    }

    private AuthException createException(){
        return new AuthException();
    }

}
