import java.util.Scanner;

public class TheDecisionMaker
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many choices are you considering?");
				int numberOfChoices = userInput.nextInt();
				String [] choices = new String[numberOfChoices];
				for (int i = 0; i<choices.length; i++);
					{
					System.out.println("Input each choice one by one, followed by pressing the enter key after you input each choice.");
					String specificChoices = userInput.nextLine(); 
					System.out.println(specificChoices); 
					}
			}

	}

