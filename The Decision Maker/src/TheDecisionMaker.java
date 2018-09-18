import java.util.Arrays;
import java.util.Scanner;

public class TheDecisionMaker
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many choices are you considering?");
				int numberOfChoices = userInput.nextInt();
				String [] array = new String[numberOfChoices];
				
				for (int i = 0; i<array.length; i++)
					{
						System.out.println("Input choice #" + (i+1) + ".");
						Scanner userChoice = new Scanner(System.in);
						String actualChoice = userChoice.nextLine(); 
						array[i] = actualChoice; 
					}
			
				int generatedChoice = (int)(Math.random()*array.length);
				System.out.println("You should choose " + (array[generatedChoice]) + ".");
			}
		
	}

