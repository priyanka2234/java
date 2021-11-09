import java.util.Scanner;
public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first three letters of the month:");
		String month = scan.next();
		switch(month)
		{
		case "jan","JAN":
			System.out.println("January");
			break;
		case "feb","FEB":
			System.out.println("February");
			break;
		case "mar","MAR":
			System.out.println("March");
			break;
		case "apr","APR":
			System.out.println("April");
			break;
		case "may","MAY":
			System.out.println("May");
			break;
		case "jun","JUN":
			System.out.println("June");
			break;
		case "jul","JUL":
			System.out.println("July");
			break;
		case "aug","AUG":
			System.out.println("August");
			break;
		case "sep","SEP":
			System.out.println("September");
			break;
		case "oct","OCT":
			System.out.println("October");
			break;
		case "nov","NOV":
			System.out.println("November");
			break;
		case "dec","DEC":
			System.out.println("December");
			break;
		default:
			System.out.println("Enter a valid month");
			
		}

	}

}
