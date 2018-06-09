package Births;
import java.util.Scanner;

public class MultipleBirths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfBabies;
		System.out.println("Enter the number of babies ");
		Scanner keyboard = new Scanner(System.in);
		numberOfBabies = keyboard.nextInt();
		
		switch (numberOfBabies)
		{
		case 1:
			System.out.println("Congratulations!");
			break;
		case 2:
			System.out.println("Wow, Twins.");
			break;
		case 3:
			System.out.println("Wow, Triplets.");
			break;
		case 4:
		case 5:
			System.out.println("Unbelievible: ");
			System.out.println(numberOfBabies + " babies");
			break;
		default:
			System.out.println("I do not believe you.");
		}

	}

}
