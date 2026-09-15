package abstractfactory;

public class main {
    public static void main(String[] args) {
        AbstractFactory factory = new SwampFactory();
        EnvironmentClient client = new EnvironmentClient(factory);
        client.show();
    }
}
