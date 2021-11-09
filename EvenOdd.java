import java.util.Scanner;
 class EvenOdd {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		  System.out.println("Enter a number:");
		  int num =scan.nextInt();
		  switch(num%2)
		  {
		  case 0:
			  System.out.println("It is a Even Number");
			  break;
		  case 1:
			  System.out.println("It is a Odd Number");
			  
		  }
			}

}
