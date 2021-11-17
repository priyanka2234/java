import java.util.Scanner;
public class ArrayAlphabetic
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cities[] = new String[5];
		
		for(int i=0;i<5;i=i+1) {
			System.out.println("Enter the city name ");
			cities[i] = scan.next();
		}
			//System.out.println("The list of cities are: " +cities[i]);
			
		
		
		 String temp;
	        for (int i = 0; i < 5; i++) {
	            for (int j = i + 1; j < 5; j++) {
	                
	                // to compare one string with other strings
	                if (cities[i].compareTo(cities[j]) > 0) {
	                    // swapping
	                    temp = cities[i];
	                    cities[i] = cities[j];
	                    cities[j] = temp;
	                }
	            }
	        }
	        System.out.println("The Cities in alphabetical order are: ");
	            for (int i = 0; i < 5; i++) {
	                System.out.println(cities[i]);
	    	}
	}		
}

