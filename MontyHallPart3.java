import java.util.Scanner;
	import java.util.Random;
	
	/**
	 * 
	 * @author Akul Patel
	 * Monty Hall
	 *
	 */
	public class MontyHallPart3 
	{
	
		public static void main(String[] args) 
		{
			Random rand = new Random();
			Scanner scan = new Scanner(System.in);
	
			System.out.print("How many rounds of the game should be simulated: ");
			int numberOfRounds = scan.nextInt();
	
			while(numberOfRounds < 10 || numberOfRounds > 10000)
			{
				System.out.print("Must enter between 10 and 10000: ");
				numberOfRounds = scan.nextInt();
			}
	
			scan.nextLine();
			System.out.print("Should the player switch or stay? ");
			String awnser = scan.nextLine();
			awnser = awnser.toLowerCase();
	
			while(!awnser.equals("switch") && !awnser.equals("stay"))
			{
				System.out.print("Must either enter \"switch\" or \"stay\" ");
				awnser = scan.nextLine();
				awnser = awnser.toLowerCase();
			}
	
			int wins = 0;
	
			for(int i = 0; i <= numberOfRounds; i++)
			{
	
				int winningDoor = rand.nextInt(3) + 1;
	
				int pickedDoor = rand.nextInt(3) + 1;
	
				if(awnser.equals("switch"))
				{
					if(winningDoor == 1)
					{
						if(pickedDoor == 1)
						{
							pickedDoor = 3;
						}
						else if(pickedDoor == 2)
						{
							pickedDoor = 1;
						}
						else
						{
							pickedDoor = 1;
						}
					}
					else if(winningDoor == 2)
					{
						if(pickedDoor == 1)
						{
							pickedDoor = 2;
						}
						else if(pickedDoor == 2)
						{
							pickedDoor = 1;
						}
						else
						{
							pickedDoor = 2;
						}
					}
					else
					{
						if(pickedDoor == 1)
						{
							pickedDoor = 3;
						}
						else if(pickedDoor == 2)
						{
							pickedDoor = 3;
						}
						else
						{
							pickedDoor = 2;
						}
					}
				}
	
				if(winningDoor == pickedDoor)
				{
					wins++;
				}
			}
	
			double winPercentage = (double) wins / numberOfRounds * 100;
	
			System.out.print("The player won " + wins + "/" + numberOfRounds + " (" + winPercentage + "%)!");
	
		}
	
	}
