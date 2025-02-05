//Yoonhong Min
//

import java.util.Scanner;

public class ymin4
{
	public static void main(String[] args)
	{
		int x = 0;

		System.out.println("Choose an option");
		System.out.println("Option 1");
		System.out.println("Option 2");
		System.out.println("Option 3");
		System.out.println("Option 4");

		Scanner userinput = new Scanner(System.in);
		x = userinput.nextInt();

		System.out.println("you chose option " +x);
	}
}
