
public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hi";
		String s2="Hi";
		String s3="Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3)); 
		System.out.println(s2.equals(s3));
		
		String s4 =" HI";
		System.out.println(s1.compareTo(s2));   
		System.out.println(s1.compareTo(s3)); 
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s4));
		System.out.println(s4.compareTo(s2));
	
	
	}

}
