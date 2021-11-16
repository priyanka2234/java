import java.util.Scanner;
public class ArrayDescendingOrder
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = 10,temp=0;
	        int arr[] = new int[n];
	        	
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }
	        
	        //Bubble Sort
	    
	          	for (int i = 0; i < arr.length; i++) {     
	                    for (int j = i+1; j < arr.length; j++) {     
	                       if(arr[i] > arr[j]) {    
	                           temp = arr[i];    
	                           arr[i] = arr[j];    
	                           arr[j] = temp;    
	                       }     
	                    }     
	                }    
	         
	     System.out.println("Elements in ascending order are:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");

	}

}
}
