package lab.part1;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		
		String personPlay=null;// User's play -- "R", "P", or "S"
		String computerPlay=null;// Computer's play -- "R", "P", or "S"
		int computerInt;//computer's play
		
		Scanner scan =new Scanner(System.in);
		Random generator = new Random();
		
		//Get player's play -- note that this is stored as a string
		while (true) {
		System.out.println("Enter your play in uppercase(Rock -- R, Paper -- P, Scissors -- S)");
		personPlay=scan.nextLine();
		
		if(personPlay.equals("R")||personPlay.equals("P")||personPlay.equals("S")) {
			break;
		}
		System.out.println("Enter valid play...\n");
		}
		scan.close();
		
		//Generate computer's play(0,1,2)
		computerInt = generator.nextInt(4);
		
		//Translate computer's randomly generated play to string
		switch(computerInt) {
		case 0:
			computerPlay = "R";
			break;
		case 1:
			computerPlay = "P";
			break;
		case 2:
			computerPlay = "S";
			break;
		default:
			break;
		}
		
		//Print computer's play
		System.out.println("Computer's play: "+computerPlay);
		
		if(personPlay.equals(computerPlay))
			System.out.println("It's a tie!");
		else if(personPlay.equals("R")) {
			if(computerPlay.equals("S"))
				System.out.println("Rock crushes scissors. You win!!");
			else
				System.out.println("Paper covers rock. You lose!!");
		}
		else if(personPlay.equals("S")) {
			if(computerPlay.equals("R"))
				System.out.println("Rock crushes scissors. You lose!!");
			else
				System.out.println("Scissors cuts paper. You win!!");
		}
		else {
			if(computerPlay.equals("R"))
				System.out.println("Paper covers rock. You win!!");
			else
				System.out.println("Scissors cuts paper. You lose!!");
		}
	}
}
