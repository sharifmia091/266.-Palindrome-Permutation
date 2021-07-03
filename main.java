import java.util.Scanner;
public class palindromePermutation266 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("input the String: ");
		String inputStr = input.nextLine();
		if(palindromePermutation( inputStr))
			System.out.println("it is palandrome");
		else
			System.out.println("it is not a palandrome");
			
	}
	
	
	public static boolean palindromePermutation(String str) {
		if (str==null)
			return false;
		
		BitSet bs = new BitSet(264);
		
		for(char word:str.toCharArray()) {
			bs.flip(word);
		}
		if (bs.cardinality()<=1)
			return true;
		return false;
		
	}

}
