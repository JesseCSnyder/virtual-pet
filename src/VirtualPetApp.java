import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet trumpy;
		trumpy = new VirtualPet(45, 45, 45);
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to trumpy's world!");
		String choice;
		int tacoBowl = 10;
		int couch = 10;
		int somethingOffensive = 10;
		int time = 5;
		do {
			trumpy.tick(time);
			System.out.println("Trumpy's current state:");
			System.out.println("Anger level - " +trumpy.anger + " Hunger level - "	 
			+ trumpy.hunger + " Tiredness level - "+ trumpy.tiredness + ".");
			System.out.println("Choose an option:");
			System.out.println("Press 1 to feed trumpy.");
			System.out.println("Press 2 to put trumpy to bed.");
			System.out.println("Press 3 to let trumpy Tweet.");
			System.out.println("Press 4 to quit.");
			choice = input.nextLine();
			
			if (choice.equals("1")) {
				System.out.println("You have fed trumpy!");
				trumpy.feed(tacoBowl);
			} else if (choice.equals("2")) {
				System.out.println("Shhh...trumpy is sleeping.");
				trumpy.sleep(couch);
			} else if (choice.equals("3")) {
				System.out.println("Uh oh, trumpy is tweeting!");
				trumpy.tweet(somethingOffensive);
			} else if (choice.equals("4")) {
				System.out.println("Goodbye and covfefe!");
				break;
			}
		} while (!choice.equals("4"));
		
		
	}

}
