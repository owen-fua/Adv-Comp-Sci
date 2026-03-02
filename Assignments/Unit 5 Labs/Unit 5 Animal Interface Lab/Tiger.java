public class Tiger extends Animal implements Predator, Swimmable {
    double weight;
    int foodlevel;

    Tiger(int foodlevel, double weight) {
        super("Tiger", "Carnivora", "Felidae", "Panthera", "P. tigris", "forest");
        this.foodlevel = foodlevel;
        this.weight = weight;
    }

    Tiger() {
        this(5, 440);
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
        String[] facts = new String[] {"Tiger urine has the same chemical as popcorn",
                "Tigers are the world's largest wild cats.",
                "No two tigers have the same stripe pattern..",
                "Tigers have the largest canines of any cat",
                "Their roar is 25 times louder than a lawnmower, can be heard over 3 kilometers away, and scare prey."};
        return facts[index];

    }

    public String getFact() {
        String[] facts = new String[] {"Tiger urine has the same chemical as popcorn",
                "Tigers are the world's largest wild cats.",
                "No two tigers have the same stripe pattern..",
                "Tigers have the largest canines of any cat",
                "Their roar is 25 times louder than a lawnmower, can be heard over 3 kilometers away, and scare prey."};
        return facts[(int) (Math.random() * (5))];
    }

    public void makeSound() {
        System.out.println("Roar!");
    }

    public void eat() {
        System.out.println("Growl!");
    }

    public void move() {
        System.out.println("Wooosh");
    }

    public String getSoundDescription() {
        return "Tigers make growls, roars, moans and chuffles. ";
    }

    public String getEatDescription() {
        return "Tigers make a soft, rhythmic puffing sound known as chuffing when eating!";
    }

    public String getMoveDescription() {
        return "Tigers are generally quiet, but when moving they make moans, grunts, and chuffles.";
    }


    public double getSwimSpeed() {
        return 7.5;
    }

    // returns the typical depth the animal swims at in meters
    public double getPreferredDepth() {
        return 0;
    }

    public void enterWater() {
        System.out.println("They walk in or run if chasing prey.");
    }

    public void swim() {
        System.out.println("They paddle on the surface, they're paws are slightly webbed.");
    }

    // prints out how the animal leaves the water
    public void exitWater() {
        System.out.println("They walk out.");
    }


    public String getPrimaryPrey() {
        return "deer and wild boar";
    }

    // returns the typical size of prey in kilograms
    public double getAveragePreyMass() {
        return 95;
    }

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal stalks its prey
    public void stalkPrey() {
        System.out.println("Tigers use a stalk-and-ambush approach.");
    }

    // prints out how the animal attacks its prey
    public void attackPrey() {
        System.out.println(
                "Tigers dispatch with a powerful blow from the paw, subdue by leaping on their back, biting the neck to break it, or crushing the throat/trachea for suffocation.");
    }

    // prints out how the animal eats its prey
    public void eatPrey() {
        System.out.println("Tigers eat with their mouth using their powerful teeth");
    }

    public String toString() {
        String output = "Hi, I'm a Tiger";
        if (foodlevel < 3) {
            output += ". Right now I'm hungry";
        } else if (foodlevel < 7) {
            output += ". Right now I'm satisfied";
        } else {
            output += ". Right now I'm full";
        }
        output += ". I weigh " + weight + " pounds";
        output +=
                ". Fun Fact about tigers, if you are in the jungle and suddenly smell buttered popcorn, you might be in a tiger's territory. Their urine contains a chemical compound called 2-AP, which is the same compound that gives popcorn its distinctive aroma.";
        return output;
    }

    public void feed() {
        foodlevel++;
        if (foodlevel > 10) {
            System.out.println("Tiger is too full! They can't eat anymore");
            foodlevel = 10;
        }
    }

}
