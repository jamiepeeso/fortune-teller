import java.util.Scanner;

public class ProjectOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("What is your age?");
		int age = input.nextInt();

		System.out.println("What is your birth month as a number?");
		int birthMonth = input.nextInt();
		input.nextLine();// If you need the computer to accept a string after an int you need to make a
							// second line for the int to consume... don't ask me why.

		System.out.println("If you had to pick one color from ROYBGIV what would it be?");
		String favRainbow = input.nextLine();

		if (favRainbow.equalsIgnoreCase("red") || favRainbow.equalsIgnoreCase("orange")
				|| favRainbow.equalsIgnoreCase("yellow") || favRainbow.equalsIgnoreCase("blue")
				|| favRainbow.equalsIgnoreCase("green") || favRainbow.equalsIgnoreCase("indego")
				|| favRainbow.equalsIgnoreCase("violet")) {
		}

		else {
			System.out.println("ROYBGIV... What is this sourcery?! To find out type 'Help'.");
			favRainbow.equalsIgnoreCase("HeLp");

			System.out.println(
					"ROYBGIV is a mnemonic for Red, Orange, Yellow, Blue, Green, Indigo, and Violet. Now... CHOSE!!!");
		}
		// there is a double click needed when you dont ask for help... help.

		System.out.println("How many siblings do you have?");
		int numOSibs = input.nextInt();

		input.close();

		int yearsTil;

		if (age % 2 == 0) {
			yearsTil = 100;
		}

		else {
			yearsTil = 10;
		}

		String location = null;

		if (numOSibs == 0) {
			location = ("Paris, France");
		}

		else if (numOSibs == 1) {
			location = ("Waterville, Maine");
		}

		else if (numOSibs == 2) {
			location = ("Honolulu, Hawaii");
		}

		else if (numOSibs > 3) {
			location = ("Tokyo, Japan");
		}

		else if (numOSibs < 0) {
			location = ("Kabul, Afghanistan");
		}

		String car = "";

		if (favRainbow.equalsIgnoreCase("red")) {
			car = "a beatup Pento";
		} else if (favRainbow.equalsIgnoreCase("orange")) {
			car = "wax wings";
		} else if (favRainbow.equalsIgnoreCase("yellow")) {
			car = "the Bat Mobile";
		} else if (favRainbow.equalsIgnoreCase("blue")) {
			car = "sharknado";
		} else if (favRainbow.equalsIgnoreCase("green")) {
			car = "a Delorean time maching; fully loaded with teh latest Mr. Fusion";
		} else if (favRainbow.equalsIgnoreCase("indego")) {
			car = "the Millennium Falcon";
		} else if (favRainbow.equalsIgnoreCase("violet")) {
			car = "Jeep Wrangler";
		}

		String money;

		if (birthMonth >= 1 && birthMonth <= 4) {
			money = ("25,853,876.01");
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			money = ("46,948.76");
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			money = ("832,678.91");
		} else {
			money = ("0.00");
		}

		System.out.println(firstName + (" ") + lastName + " will retire in " + yearsTil + " years with $" + money
				+ " in the bank, a vacation home in " + location + ", and travel by " + car + ".");
	}
}