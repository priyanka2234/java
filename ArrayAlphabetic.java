public class ArrayAlphabetic
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 // storing input in variable
        int n = 4;
        
        // create string array called names
        String cities[]
            = { "Hyderabad", "Mumbai", "Chennai", "kerala","Kolkata" };
        String temp;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < n; j++) {
                
                // to compare one string with other strings
                if (cities[i].compareTo(cities[j]) > 0) {
                    // swapping
                    temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }
        
        // print output array
        System.out.println(
            "The Cities in alphabetical order are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(cities[i]);
	}

}
}