public class Player {
    private int health;
    private String name;


    public Player(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public Player(String name) {
        this(name, 1000);
    }

    public Player() {
        this("Jim", 10000);
    }

    // overloaing, same method name diff parameters
    public void eat(Food food) {
        System.out.println(name + " ate food.");
        health += food.getQuality();
        System.out.println(name + " has " + health + " hp.");
    }

    public void eat(Rock rock) {
        System.out.println(name + " ate rocks. Youch");
        health -= 100;
        System.out.println(name + " has " + health + " hp.");
    }

    public static void main(String[] args) {
        Player player = new Player("Matthew", 100);
        Food sushi = new Food("sushi", 20);
        player.eat(sushi);

        Food pizza = new Food("pizza", 10);
        player.eat(pizza);
    }
}


