import java.util.Scanner;
class ArraySumandAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Creating an empty array.
		int num[] = new int[10];
		int i = 0;
		do {
			System.out.println("Enter the number: ");
			num[i] = scan.nextInt();
			i=i+1;	
		}while(i<10);
		
		int sum = 0;
		int x = 0;
		
		//printing elements from the array and calculating the total
		do {
			System.out.println(num[x]);
			sum = sum + num[x];
			x = x + 1;
		}while(x<10);
		
		System.out.println("Sum of all numbers is: "+sum);
		float avg = sum / (1.0f * x);
		System.out.println("The average  is:"+avg);
	}
}
