public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hi";
		String s2="Hi";
		String s3="Hello";
		
		System.out.println(s1.equals(s2));   
		System.out.println(s1.equals(s3)); 
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		
		String s5="Welcome to java";  
		System.out.println(s5.substring(0,15));
		System.out.println(s5.substring(0,7)); 
		System.out.println(s5.substring(11,15)); 
		
		String s6="Welcome to java";  
	System.out.println(s6.replace('a','e')); 
	}

}
