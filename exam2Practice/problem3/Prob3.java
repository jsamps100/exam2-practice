package problem3;

public class Prob3 {

	public static void main(String[] args) {
		
		String str = reverseWords("Hello World Again");
		System.out.println(str);
	}
	
	public static String reverseWords(String str) {
		String newStr = "";
		String word = "";
		int wordCount = 1;
		int wordsIndex = 0;
		int index = 0;
		
		for(index=0;index<str.length();index++) {
			if (str.charAt(index) == ' ') {
				wordCount = wordCount + 1;
			}
		}
			
		String[] words = new String[wordCount];
		
		for(index=0;index<str.length();index++) {
			if (str.charAt(index) != ' ')  {
				word = word + str.charAt(index);
			}else{
				words[wordsIndex] = word;
				word = "";
				wordsIndex = wordsIndex +1;
			}
		}
		
		words[wordsIndex] = word;
		wordsIndex = words.length - 1;
		 
		while (wordsIndex != -1) {
			if (wordsIndex > 0) {
				newStr = newStr + words[wordsIndex] + " ";
				wordsIndex = wordsIndex - 1;
			}else {
				newStr = newStr + words[wordsIndex];
				wordsIndex = wordsIndex - 1;
			}
		}
		return newStr;
	}
}

