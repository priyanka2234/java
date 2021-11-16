import java.util.*;
public class ArrayDiffEvenOdd 
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a[]=new int[10];
	
int Sum_Odd=0,Sum_Even=0,diff=0;
	System.out.println("Enter the elements of the array:");
	for(int i=0;i<a.length;i++)
	{
	a[i]=in.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	if(a[i]%2==0)
	Sum_Even=Sum_Even+a[i];
	else
	Sum_Odd=Sum_Odd+a[i];

	}

	diff=Sum_Odd-Sum_Even;

	System.out.println("The difference between odd and even numbers="+diff);

	in.close();
}
}
