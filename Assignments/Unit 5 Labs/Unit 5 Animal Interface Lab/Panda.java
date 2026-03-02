public class Panda extends Animal implements Swimmable, Pettable {
    int foodlevel;
    double weight;

    Panda(int foodlevel, double weight) {
        super("Panda", "Carnivora", "Ursidae", "Ailuropoda", "A. melanoleuca", "bamboo forest");
        this.foodlevel = foodlevel;
        this.weight = weight;
    }

    Panda() {
        this(5, 225);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getFoodlevel() {
        return foodlevel;
    }

    public void setFoodlevel(int foodlevel) {
        this.foodlevel = foodlevel;
    }


    public String getFact(int index) {
        String[] facts = new String[] {"Pandas spend 16 hours a day just eating bamboo.",
                "Pandas poo 100 times a day.",
                "The reason we need so much bamboo is because it's not an efficent food source.",
                "Pandas have a thumb-like ligament to hold bamboo.",
                "Newborn pandas are only 3 - 5 ounces."};
        return facts[index];

    }

    public String getFact() {
        String[] facts = new String[] {"Pandas spend 16 hours a day just eating bamboo.",
                "Pandas poo 100 times a day.",
                "The reason we need so much bamboo is because it's not an efficent food source.",
                "Pandas have a thumb-like ligament to hold bamboo.",
                "Newborn pandas are only 3 - 5 ounces."};
        return facts[(int) (Math.random() * (5))];
    }

    public void makeSound() {
        System.out.println("Bleat!");
    }

    public void eat() {
        System.out.println("Crunch!");
    }

    public void move() {
        System.out.println("Wooosh");
    }

    public String getSoundDescription() {
        return "Pandas make a bleat!";
    }

    public String getEatDescription() {
        return "Pandas make loud, rhythmic chomping, crunching, and snapping sounds!";
    }

    public String getMoveDescription() {
        return "Pandas are generally quiet, but when moving they make low-pitched moaning or bleating sounds!";
    }


    public int getFriendlinessLevel() {
        return 6;
    }

    // returns how energetic the animal is on a scale from 1 to 10
    public int getEnergyLevel() {
        return 1;
    }

    public void greetHuman() {
        System.out.println("Pandas avoid humans, but act peacefully.");
    }

    public void bePetted() {
        System.out.println(
                "Pandas react with indifference, caution, or by simply focusing on food instead.");
    }


    public void playWithHuman() {
        System.out.println(
                "Pandas don't generally interact with humans, but when they do they roll around.");
    }


    public double getSwimSpeed() {
        return 16;
    }


    public double getPreferredDepth() {
        return 0;
    }


    public void enterWater() {
        System.out.println("They walk in.");
    }


    public void swim() {
        System.out.println("They paddle on the surface.");
    }

    public void exitWater() {
        System.out.println("They walk out.");
    }


    public String toString() {
        String output = "Hi, I'm a Panda";
        if (foodlevel < 3) {
            output += ". Right now I'm hungry";
        } else if (foodlevel < 7) {
            output += ". Right now I'm satisfied";
        } else {
            output += ". Right now I'm full";
        }
        output +=
                ". Fun Fact about pandas, we spend 16 hours a day just eating bamboo. As a result we poo 100 times a day. The reason we need so much bamboo is because it's not an efficent food source. Luckily, we have very few natural predators, so we didn't need to evolve. ";
        return output;
    }


    public void feed() {
        foodlevel++;
        if (foodlevel > 10) {
            System.out.println("Panda is too full! They can't eat anymore");
            foodlevel = 10;
        }
    }
}
