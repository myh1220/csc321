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

		System.out.println("You chose option " +x+ " as your favorite season.");
	}
}
