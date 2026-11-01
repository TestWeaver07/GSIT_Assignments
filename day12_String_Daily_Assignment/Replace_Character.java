package day12_String_Daily_Assignment;

public class Replace_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "banana";
		String replacedString=" ";
		
		
		
		for (int i=0;i<str.length();i++) {
			
			
			char ch=str.charAt(i);
			
	
			if (ch == 'a') {
			    replacedString = replacedString + 'o';
			} else {
			    replacedString = replacedString + ch;
			}
			
		
					
	}
		System.out.println(replacedString);

}}