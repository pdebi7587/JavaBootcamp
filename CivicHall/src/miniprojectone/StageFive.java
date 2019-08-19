package miniprojectone;
import java.util.Scanner;
public class StageFive {
// Global Variables
	static Scanner input = new Scanner(System.in);
	static int water = 400;
	static int milk = 540;
	static int coffeeBeans = 120;
	static int cups = 9;
	static int profit = 550;
	
	public static void main(String[] args) {

		boolean flag = true;

		remaining();

		while (flag) {
			System.out.println("Write action (buy, fill, take, remaining, exit):");
			
			String userInput = input.next().toLowerCase();

			if (userInput.equals("remaining")) {
				remaining();
			}

			else if (userInput.equals("buy")) {
				buy();
			}

			else if (userInput.equals("fill")) {
				fill();
			}

			else if (userInput.equals("take")) {
				take();
			}

			else if (userInput.equals("exit")) {
				flag = false;
				System.out.println("End of Program");
				break;
			}

		}

	}//end main method

	private static void buy() {

		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");

		int choice = input.nextInt();

		if (choice == 1) {
			int maxCupsWater = water / 250;
			int maxCupsCoffeeBeans = coffeeBeans / 16;
			int tempMaxCupsCoffee = Math.min(maxCupsWater, maxCupsCoffeeBeans);

			System.out.println("Enter amount of cups: ");

			int amountCups = input.nextInt();

			if (amountCups == tempMaxCupsCoffee) {
				System.out.println("Yes, I can make that amount of coffee");

				water -= amountCups*250;
				coffeeBeans -= amountCups*16;
				profit += amountCups*4;

			} else if (amountCups < tempMaxCupsCoffee) {

				int N = tempMaxCupsCoffee - amountCups;

				System.out.println("Yes, I can make that amount of coffee (and even " + N + " more than that)");

				water -= amountCups*250;
				coffeeBeans -= amountCups*16;
				profit += amountCups*4;

			} else {

				System.out.println("No, I can make only " + tempMaxCupsCoffee + " cup(s) of coffee");

			}

		}

		else if (choice == 2) {

			int maxCupsWater = water / 350;
			int maxCupsMilk = milk / 75;
			int maxCupsCoffeeBeans = coffeeBeans / 20;
			int tempMaxCupsCoffee = Math.min(maxCupsWater, maxCupsMilk);
			int maxCupsCoffee = Math.min(tempMaxCupsCoffee, maxCupsCoffeeBeans);

			System.out.println("Enter amount of cups: ");

			int amountCups = input.nextInt();

			if (amountCups == maxCupsCoffee) {

				System.out.println("Yes, I can make that amount of coffee");

				water -= amountCups*350;
				milk -= amountCups*75;
				coffeeBeans -= amountCups*20;
				profit += amountCups*7;

			} else if (amountCups < maxCupsCoffee) {

				int N = maxCupsCoffee - amountCups;

				System.out.println("Yes, I can make that amount of coffee (and even " + N + " more than that)");

				water -= amountCups*350;
				milk -= amountCups*75;
				coffeeBeans -= amountCups*20;
				profit += amountCups*7;

			} else {

				System.out.println("No, I can make only " + maxCupsCoffee + " cup(s) of coffee");

			}


		}

		else if (choice == 3) {

			int maxCupsWater = water / 200;
			int maxCupsMilk = milk / 100;
			int maxCupsCoffeeBeans = coffeeBeans / 12;
			int tempMaxCupsCoffee = Math.min(maxCupsWater, maxCupsMilk);
			int maxCupsCoffee = Math.min(tempMaxCupsCoffee, maxCupsCoffeeBeans);

			System.out.println("Enter number of cups: ");

			int amountCups = input.nextInt();

			if (amountCups == maxCupsCoffee) {

				System.out.println("Yes, I can make that amount of coffee");

				water -= amountCups*200;
				milk -= amountCups*100;
				coffeeBeans -= amountCups*12;
				profit += amountCups*6;

			} else if (amountCups < maxCupsCoffee) {

				int N = maxCupsCoffee - amountCups;

				System.out.println("Yes, I can make that amount of coffee (and even " + N + " more than that)");

				water -= amountCups*200;
				milk -= amountCups*100;
				coffeeBeans -= amountCups*12;
				profit += amountCups*6;

			} else {

				System.out.println("No, I can make only " + maxCupsCoffee + " cup(s) of coffee");

			}

		}

	}//end buy method

	private static void take() {

// TODO Auto-generated method stub

		System.out.println("I gave you " + profit);

		profit = 0;

	}//end take method

	private static void fill() {

		System.out.println("Enter how many ml of water you want to add: ");

		int addWater = input.nextInt();

		water += addWater;

		System.out.println("Enter how many ml of milk you want to add: ");

		int addMilk = input.nextInt();

		milk += addMilk;

		System.out.println("Enter how many grams of coffee beans you want to add: ");

		int addCoffeeBeans = input.nextInt();

		coffeeBeans += addCoffeeBeans;

		System.out.println("Enter how many disposable cups you want to add: ");

		int addCups = input.nextInt();

		cups += addCups;

	}//end fill method

	private static void remaining() {

		System.out.println("The coffee machine has: ");

		System.out.println(water + " ml of water");

		System.out.println(milk + " ml of milk");

		System.out.println(coffeeBeans + " g of coffee beans");

		System.out.println(cups + " cups");

		System.out.println("$" + profit + " of money");

	}//end remaining method

}//end StageFive class