package day12_String_Daily_Assignment;

import java.util.Iterator;

public class Longest_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java programming is interestingfullyfantastic";
		
		int maxlength=0;
		String longestWord = "";
		
		String[] words=str.split(" ");
		
		
		for (String word:words) {
			
			
			if(word.length()>maxlength) {
				
				maxlength=word.length();
				
				longestWord=word;
				
				
			}
			
			
				
			}
			
		System.out.println("longest word :"+longestWord+"  And length is : "+maxlength );
		}

	

}
