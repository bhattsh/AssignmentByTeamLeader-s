
public class VowelInterchanger {

	public static void main(String[] args) {
		String input = "dialogue";
		String vowels = "aeiou";
		boolean leftFlag =false;
		boolean rightFlag = false;
		char [] inputAsArray= input.toCharArray();
		for(int i=0, j=inputAsArray.length-1; i!=j; )
		{
			//System.out.println(Character.toString(inputAsArray[i]));
			if(vowels.contains( Character.toString(inputAsArray[i]) )){
				leftFlag = true;
			}
			else i++;
			
			if(vowels.contains( Character.toString(inputAsArray[j]) )){
				rightFlag = true;
			}
			else j--;
			
			if(leftFlag == true && rightFlag == true) {
				char temp = inputAsArray[i];
				inputAsArray[i]=inputAsArray[j];
				inputAsArray[j]=temp;
				
				leftFlag = false;
				rightFlag = false;
				i++;
				j--;
			}
		}
		
		for(int i=0;i<inputAsArray.length;i++)
			System.out.print(inputAsArray[i]);
	}
}
