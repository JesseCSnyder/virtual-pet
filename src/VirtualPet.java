
public class VirtualPet {

	public int hunger;
	public int anger;
	public int tiredness;

	public VirtualPet(int hunger, int anger, int tiredness) {
		this.hunger = hunger;
		this.anger = anger;
		this.tiredness = tiredness;
	}

	public void feed(int tacoBowl) {
		hunger -= tacoBowl;
		tiredness += tacoBowl;
		anger -= tacoBowl;
	}

	public void sleep(int couch) {
		tiredness -= couch;
		hunger += couch;
		anger -= couch;
	}

	public void tweet(int somethingOffensive) {
		hunger += somethingOffensive;
		tiredness += somethingOffensive;
		anger -= somethingOffensive;
	}

	public void tick(int time) {
		hunger += time;
		tiredness += time;
		anger += time + 5;
	}

	public void watchNews(int foxChannel) {
		anger += foxChannel;
	}
}
