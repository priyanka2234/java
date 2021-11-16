import java.util.Scanner;
class ArraywithoutElements2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		//Creating an empty array.
		int marks[] = new int[6];
		int i = 0;
		do {
			System.out.println("Enter first subject marks   ");
			marks[i] = scan.nextInt();
			i=i+1;	
		}while(i<6);
		
		int sum = 0;
		int x = 0;
		
		//printing elements from the array and calculating the total
		do {
			System.out.println(marks[x]);
			sum = sum + marks[x];
			x = x + 1;
		}while(x<6);
		
		System.out.println("Total marks are "+sum);
		float avg = sum / (1.0f * x);
		System.out.println("The average marks are "+avg);
	}
}

