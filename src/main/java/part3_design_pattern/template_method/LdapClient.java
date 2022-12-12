package part3_design_pattern.template_method;

public interface LdapClient {
    
    User authenticate(String id, String password);
    LdapContext find(String id);
}
