import java.util.Scanner;

public class TheDecisionMaker
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many choices are you considering?");
				int numberOfChoices = userInput.nextInt();
				String [] array = new String[numberOfChoices];
				Boolean counterIsLess = true; 
				int counter = 0; 
				do 
					{
						if (counter<array.length)
							{
								System.out.println("Input choice #" + (counter+1) + ".");
								String userChoice = userInput.nextLine(); 
								array[counter] = userChoice; 
								counter++;
							}
						else if (counter>array.length)
							{
								counterIsLess = false; 
							}
					}
				
				while(counterIsLess);
				System.out.println(array);
			}

	}

