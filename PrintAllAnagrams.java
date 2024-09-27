//package unit1Recursion;

/**
 * This code use will take a given
 * char list and return all 
 * possible anagrams of that char list
 * 
 * 2024/09/26
 * 
 * @author Thomas Murzaku
 **/
 
public class PrintAllAnagrams {
    
    /**
     * Entry point of code
     * 
     * @param args Unused
     **/
     
	public static void main(String[] args) {
		
		char[] letters = {'c', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
		printAllAnagrams("", letters);//Calling method with appropriate test arguments
	}
	
	/**
	 * This method uses recursive
	 * backtracking and a nested 
	 * for loop to traverse and
	 * create and output a different
	 * combination of chars each time
	 * 
	 * @param String wordSoFar
	 * @param char[] lettersRemaining
	 **/
	
	public static void printAllAnagrams(String wordSoFar, char[] lettersRemaining) {
		if (lettersRemaining.length == 0) {//Base case if there are no letters remaining, display word formed
			
			System.out.println(wordSoFar);
			
		}
		else {
			
			for (int i = 0; i < lettersRemaining.length; i++) {//Traversing through the original char[] of letters remaining
				
				char[] lettersRemaining2 = new char[lettersRemaining.length-1];//Creating new char[] one element smaller than original char[]
				
				int k = 0;//Counter to keep track of how many chars placed(Used to avoid Index out of bounds error)
				
				for (int j = 0; j < lettersRemaining.length; j++) {//Traversing through second char[] and filling it with everything except the element at i
					
					if (j != i) {
						lettersRemaining2[k] = lettersRemaining[j];
						k++;
					}
				}
				String wordSoFar2 = wordSoFar + lettersRemaining[i];//Storing new combination
				printAllAnagrams(wordSoFar2, lettersRemaining2);//Recursive call with word formed so far and the remaining char[]
			}
		}
	}
}