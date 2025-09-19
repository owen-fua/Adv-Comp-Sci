public class ScopeDemo {
    private String world = "world"; // instance variable are global

    public static void main(String[] args) {

    }

    public String method2() {
        var hello = "Hello";
        String goodbye = "";
        if (true) {
            goodbye = "Goodbye";
        }

        System.out.println(goodbye);
        return hello;

    }

    public String Method1() {
        return method2() + world;
    }

}
