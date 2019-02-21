import java.util.Arrays;

public class DuplicateCharacterFinder {

	public static void main(String []args){
		String input = "shubham";
		
		char [] inputArray = input.toCharArray();
		
		 Arrays.sort(inputArray);
		 
		 for(int i=0; i<inputArray.length-1;i++)
			 if(inputArray[i] == inputArray[i+1])
			 {
				 System.out.println(" String contains duplicate character");
				 break;
			 }
			 
	}
}
