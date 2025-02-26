//Yoonhong Min
//

import java.util.Scanner;

public class ymin4
{
	public static void main(String[] args)
	{
		int x = 0;

		System.out.println("Pick your favorite season.");
		System.out.println("Option 1: Spring");
		System.out.println("Option 2: Summer");
		System.out.println("Option 3: Fall");
		System.out.println("Option 4: Winter");

		Scanner userinput = new Scanner(System.in);
		x = userinput.nextInt();

		if (x == 1)
		{
			System.out.println("You chose Spring as your favorite season.");
		}
		else if (x == 2)
		{
			System.out.println("You chose Summer as your favorite season.");
		}
		else if (x == 3)
		{
			System.out.println("You chose Fall as your favorite season.");
		}
		else if (x == 4)
		{
			System.out.println("You chose Winter as your favorite season.");
		}
		else
		{
			System.out.println("Invalid choice. Choose between 1, 2, 3, and 4");
		}
	}
}
