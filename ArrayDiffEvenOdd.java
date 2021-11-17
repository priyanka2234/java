import java.util.Scanner;
public class ArrayDiffEvenOdd 
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int num[]=new int[10];
int even=0,odd=0,i=0;
for(i=0;i<10;i++)
{
	System.out.println("Enter the number");
	num[i]=scan.nextInt();
	if(num[i]%2==0)
	{
		even=even+num[i];
		
	}
	else
	{
		odd=odd+num[i];
	}
}
System.out.println("Sum of Even numbers is: " + even);
System.out.println("Sum of Odd numbers is:  " +odd);
int diff=even-odd;
System.out.println("Difference betwwen even and odd numbers is:" +diff);

	
}
}
