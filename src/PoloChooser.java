import java.util.Random;
import java.util.Scanner;

public class PoloChooser 
{
	public static void main(String[] args) 
	{
		String[] myArray = {"Navy Blue", "Light Blue", "Grey", "Yellow"};
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Here are the polo you can wear.");
		
		
		for(String polo : myArray)
		{
			System.out.println(polo);
		}
		
		Random r = new Random();
		int randomNumber=r.nextInt(myArray.length);
        System.out.println("You are going to wear " + myArray[randomNumber] + ".");
	}
}
