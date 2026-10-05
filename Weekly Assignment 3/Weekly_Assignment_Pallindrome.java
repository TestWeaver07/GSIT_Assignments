package day3;

public class Weekly_Assignment_Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1221;
		int pallindrome=0;
		int orignal=num;		
		for(;num>0;)
		{
			int lastdigit=num%10;
			pallindrome=pallindrome*10+lastdigit;
			num=num/10	;
			System.out.println(pallindrome);
		}
		System.out.println(orignal);
		if(orignal==pallindrome) {
			
			System.out.println("number is pallindrome ");
		}
		else {
			System.out.println("Not pallindrome");
		}
		
			
	}

}
