import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet widgy = new VirtualPet(-3, -3, -3);
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Widgy's World!\n");
		String choice;
		int food = 5;
		int bed = 5;
		int water = 5;
		int time = 3;

		do {
			widgy.tick(time);
			if (widgy.thirst >= 200) {
				System.out.println("Widgy is too thirsty to play!");
				break;
			}
			if (widgy.hunger >= 200) {
				System.out.println("Widgy is too hungry to play!");
				break;
			}
			if (widgy.tiredness >= 200) {
				System.out.println("Widgy is taking the day off to rest!");
				break;
			}
			System.out.println("Widgy's current state:");
			System.out.println("Thirst level = " + widgy.thirst + "\n" + "Hunger level = " + widgy.hunger + "\n"
					+ "Tiredness level = " + widgy.tiredness + "\n");
			System.out.println("Choose an option:");
			System.out.println("Press 1 to feed Widgy.");
			System.out.println("Press 2 to put Widgy to bed.");
			System.out.println("Press 3 to water Widgy.");
			System.out.println("Press 4 to quit.");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("You have fed Widgy!");
				widgy.feed(food);
			} else if (choice.equals("2")) {
				System.out.println("Shhh...Widgy is sleeping.");
				widgy.sleep(bed);
			} else if (choice.equals("3")) {
				System.out.println("You have watered Widgy!");
				widgy.drink(water);
			} else if (choice.equals("4")) {
				System.out.println("Goodbye!");
				break;
			}

		} while (!choice.equals("4"));

		input.close();

	}

}
