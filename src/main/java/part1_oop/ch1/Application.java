package part1_oop.ch1;

public class Application {

    private final Menu menu1 = new Menu("menu1");
    private final Menu menu2 = new Menu("menu2");
    private final Menu menu3 = new Menu("menu3");

    private final Button button1 = new Button("button1");
    private final Button button2 = new Button("button2");

    private ScreenUI currentScreen = null;

    private final OnClickListener menuListener = new OnClickListener(){
        @Override
        public void clicked(Component component) {
            if(component.getId().equals("menu1")){
                currentScreen = new Menu1ScreenUI();
            } else if(component.getId().equals("menu2")){
                currentScreen = new Menu2ScreenUI();
            } else if(component.getId().equals("menu3")){
                currentScreen = new Menu3ScreenUI();
            }
            currentScreen.show();
        }
    };

    private final OnClickListener buttonListener = new OnClickListener() {
        @Override
        public void clicked(Component component) {

            if(currentScreen == null){
                return;
            }

            if(component.getId().equals("button1")){
                currentScreen.handleButton1Click();
            } else if(component.getId().equals("button2")){
                currentScreen.handleButton2Click();
            }

        }
    };

    public Application(){
        // 초기화 시 OnClickListener 의존 주입
        menu1.setOnClickListener(menuListener);
        menu2.setOnClickListener(menuListener);
        menu3.setOnClickListener(menuListener);
        button1.setOnClickListener(buttonListener);
        button2.setOnClickListener(buttonListener);
    }

    public static void main(String[] args) {

        Application application = new Application();




    }

}
