public class Cat {// lower cased P
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;


	// 2-Parameter Constructor
	public Cat(String name, String breed) {
		this.name = name; // added this
		this.breed = breed;
		this.isHungry = true;
		livesRemaining = 9;
	} // 2nd parameter

	public String getName() {
		return name; // string not void
	}

	public void setName(String name) {
		this.name = name;
	}

	// added getter and setter for breed
	public String getBreed() {
		return breed; // string not void
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean getIsHungry() { // capitalized for correct naming
		return isHungry; // boolean not void
	}

	public void setIsHungry(boolean input) {
		isHungry = input; // boolean not void
	}

	public int getLivesRemaining() {
		return livesRemaining; // string not void
	}

	public void setLivesRemaining(int input) {
		livesRemaining = input;
	}



	public void feed() {
		this.isHungry = false; // no return
	}

	public boolean equals(Cat other) {
		return name.equals(other.name) && this.breed.equals(other.breed)
				&& this.livesRemaining <= other.livesRemaining; // = -> <=
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
	}
}
