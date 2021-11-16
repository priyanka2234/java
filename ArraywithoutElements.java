import java.util.Scanner;
class ArraywithoutElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cities[] = new String[5];
		
		for(int i=0;i<5;i=i+1) {
			System.out.println("Enter the city name ");
			cities[i] = scan.next();
		}
		
		//length is an array property. It is used to get the size of an array.
		
		for(int i=0;i<cities.length;i=i+1) {
			System.out.println(cities[i]);
		
		}
	}		
}
