package day3;

public class Weekly_Assignment_reverse {
	
	public static void main(String[]args)
	{
		int num=12345;
		int reverse=0;
		
		for(;num>0; )
		{
		
		 int lastdigit=num%10 ;
		 reverse=reverse*10+lastdigit;
		 num=num/10;
		 }
		System.out.println(reverse);	
		
	}

}
