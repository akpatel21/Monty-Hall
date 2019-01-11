import java.util.Scanner;
	import java.util.Random;
	
	/**
	 * 
	 * @author Akul Patel
	 * Monty Hall
	 *
	 */
	public class MontyHallPart1 
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
	
			System.out.println("The car was behind door #" + winningDoor + "!");
			System.out.print("You picked door #" + pickedDoor + ".");
		}
	
	}
