import java.util.Arrays;

public class AnagramChecker {

	public static void main(String []args){
		String first = "amitabh bachchan  123";
		String second = "bach123chan amitabh";
	
//removing whitespace
		first = first.replaceAll("\\s","");
		second = second.replaceAll("\\s","");

//converting string to array
		char [] firstArray = first.toCharArray();
		char [] secondArray = second.toCharArray();

//sorting arrays
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		//System.out.println(new String(firstArray) + "   "+ new String(secondArray));
		
//converting array to string first and then comparing		
		if(new String(firstArray).equalsIgnoreCase(new String(secondArray)))
			System.out.println(true);
		else
			System.out.println(false);
	}
	
}
