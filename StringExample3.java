class StringExample3 { 
    public static void main(String args[]) { 
    String s1 = "Hello"; 
    String s2 = "Hello"; 
    String s3 = "Goodbye"; 
    String s4 = "HELLO"; 
    System.out.println(s1 + " equals " + s2 +" " + s1.equals(s2)); 
    System.out.println(s1 + " equals " + s3 + " " +s1.equals(s3)); 
    System.out.println(s1 + " equals " + s4 + " " +s1.equals(s4)); 
    System.out.println(s2 + " equals " + s4 + " " +s1.equals(s3));
    System.out.println(s3 + " equals " + s4 + " " +s1.equals(s4));
    
    System.out.println(s1 + " equalsIgnoreCase " + s2 +" " + s1.equalsIgnoreCase(s2)); 
    System.out.println(s1 + " equals " + s3 + " " +s1.equalsIgnoreCase(s3)); 
    System.out.println(s1 + " equals " + s4 + " " +s1.equalsIgnoreCase(s4)); 
    System.out.println(s2 + " equalsIgnoreCase " + s4 + " " +s1.equalsIgnoreCase(s3));     
    System.out.println(s3 + " equalsIgnoreCase " + s4 + " " +s1.equalsIgnoreCase(s4));
    
    } 
}
