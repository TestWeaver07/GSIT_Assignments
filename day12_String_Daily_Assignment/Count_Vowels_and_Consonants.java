package day12_String_Daily_Assignment;

public class Count_Vowels_and_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Programming";
		int vowel=0;
		int consonant=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				vowel++;
			}
			else {
				
				consonant++;
				
			}
		

		}
		System.out.println("vowel :" +vowel);
		System.out.println("consonant :" + consonant);
	}

}
