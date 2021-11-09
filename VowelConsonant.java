import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any character");
		ch=scan.next().charAt(0);
		switch(ch)
		{
		case 'a','A':
			System.out.println("It is a vowel");
			break;
		case 'e','E':
			System.out.println("It is a vowel");
			break;
		case 'i','I':
			System.out.println("It is a vowel");
			break;
		case 'o','O':
			System.out.println("It is a vowel");
			break;
		case 'u','U':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("It is a consonant");
		}
		}
}

