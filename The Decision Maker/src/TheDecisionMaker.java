import java.util.Scanner;

public class TheDecisionMaker
	{

		public static void main(String[] args)
			{
				Scanner userInput1 = new Scanner(System.in);
				System.out.println("How many choices are you considering?");
				int numberOfChoices = userInput1.nextInt();
				String [] choices = new String[numberOfChoices];
				for (int i = 0; i<choices.length-1; i++);
					{
					System.out.println("Input each choice one by one, followed by pressing the enter key after you input each choice.");
					Scanner userInput2 = new Scanner(System.in);
					String specificChoices = userInput2.nextLine(); 
					choices[i]=specificChoices; 
					}
			}

	}

