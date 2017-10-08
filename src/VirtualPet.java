
public class VirtualPet {

	public int hunger;
	public int thirst;
	public int tiredness;

	public VirtualPet(int hunger, int thirst, int tiredness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.tiredness = tiredness;
	}

	public void feed(int food) {
		hunger -= food;
		tiredness += food;
		thirst += food;
	}

	public void sleep(int bed) {
		tiredness -= bed;
		hunger += bed;
		thirst += bed;
	}

	public void drink(int water) {
		hunger += water;
		tiredness += water;
		thirst -= water;
	}

	public void tick(int time) {
		hunger += time;
		tiredness += time;
		thirst += time;
	}

}
