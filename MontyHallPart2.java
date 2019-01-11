import java.util.Scanner;
	import java.util.Random;
	
	/**
	 * 
	 * @author Akul Patel
	 * Monty Hall
	 *
	 */
	public class MontyHallPart2 
	{
	
		public static void main(String[] args) 
		{
			Random rand = new Random();
			Scanner scan = new Scanner(System.in);
	
			int winningDoor = rand.nextInt(3) + 1;
	
			System.out.print("Which door would you like to pick: ");
			String strPickedDoor = scan.nextLine();
	
			while(!strPickedDoor.equals("1") && !strPickedDoor.equals("2") && !strPickedDoor.equals("3"))
			{
				System.out.print("Please pick either 1, 2, or 3: ");
				strPickedDoor = scan.nextLine();
			}
	
			int pickedDoor = Integer.parseInt(strPickedDoor);
	
			if(winningDoor == 1)
			{
				if(pickedDoor == 1)
				{
					System.out.println("There is a goat behind door #2");
				}
				else if(pickedDoor == 2)
				{
					System.out.println("There is a goat behind door #3");
				}
				else
				{
					System.out.println("There is a goat behind door #2");
				}
			}
			else if(winningDoor == 2)
			{
				if(pickedDoor == 1)
				{
					System.out.println("There is a goat behind door #3");
				}
				else if(pickedDoor == 2)
				{
					System.out.println("There is a goat behind door #3");
				}
				else
				{
					System.out.println("There is a goat behind door #1");
				}
			}
			else
			{
				if(pickedDoor == 1)
				{
					System.out.println("There is a goat behind door #2");
				}
				else if(pickedDoor == 2)
				{
					System.out.println("There is a goat behind door #1");
				}
				else
				{
					System.out.println("There is a goat behind door #1");
				}
			}
	
			System.out.print("Would you like to change your pick? ");
			String awnser = scan.nextLine();
			awnser = awnser.toLowerCase();
	
			while(!awnser.equals("yes") && !awnser.equals("no"))
			{
				System.out.print("Please pick a yes or no answer: ");
				awnser = scan.nextLine();
				awnser = awnser.toLowerCase();
			}
	
			if(awnser.equals("yes"))
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
	
			System.out.println("The car was behind door #" + winningDoor + "!");
	
			if(winningDoor == pickedDoor)
			{
				System.out.println("You won!");
			}
			else
			{
				System.out.println("You lost.");
			}
	
		}
	
	}
