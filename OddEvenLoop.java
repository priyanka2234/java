import java.util.Scanner;
public class OddEvenLoop {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minimum value:");
		int x = scan.nextInt();
		System.out.println("Enter the maximum value:");
		int n = scan.nextInt();
		if(x%2==0)
		{
			x=x+1;
		}
		do {
			System.out.println(x);
			x=x+2;
		}while(x<n);
	}

}
