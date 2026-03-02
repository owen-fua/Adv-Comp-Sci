public class Tiger extends Animal{
    String name;
    double weight;
    int foodlevel;

    Tiger(String name, int foodlevel, double weight) {
        this.name = name;
        this.foodlevel = foodlevel;
        this.weight = weight;
    }

    Tiger() {
        this("Ryan", 9, 463);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String toString() {
        String output = "Hi, I'm a Tiger named " + name;
        if (foodlevel < 3) {
            output += ". Right now I'm hungry";
        } else if (foodlevel < 7 ) {
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
            System.out.println(name + " is too full! They can't eat anymore");
            foodlevel = 10;
        }
    }

}
