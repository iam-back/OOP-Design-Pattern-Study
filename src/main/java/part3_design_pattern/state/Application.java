package part3_design_pattern.state;

public class Application {

    public static void main(String[] args) {

        User admin = new User(Role.ADMIN);
        User normal = new User(Role.NORMAL);

        Document document = new Document(admin,State.DRAFT);
        Document document2 = new Document(normal,State.MODERATION);

        document.publish();
        document2.publish();



    }
}
