import java.util.Scanner;
public class OddNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minimum limit:");
		int x=scan.nextInt();
		System.out.println("Enter the maximum limit:");
		int n = scan.nextInt();
		if(x%2==0)
		{
			x=x+1;
		}
		while(x<n)
		{
			System.out.println(x);
			x=x+2;
		}

	}

}
