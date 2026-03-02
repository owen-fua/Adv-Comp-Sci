public class Panda extends Animal {
    String name;
    int foodlevel;
    double weight;

    Panda(String name, int foodlevel) {
        this.name = name;
        this.foodlevel = foodlevel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    Panda() {
        this("Justin", 5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getFoodlevel() {
        return foodlevel;
    }

    public void setFoodlevel(int foodlevel) {
        this.foodlevel = foodlevel;
    }

    public String toString() {
        String output = "Hi, I'm a Panda named " + name;
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
            System.out.println(name + " is too full! They can't eat anymore");
            foodlevel = 10;
        }
    }
}
