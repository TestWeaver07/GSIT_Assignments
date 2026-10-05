
package day3;

public class Weekly_Assignment_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=987654;
		int count=0;
		
		for(;num>0;)
		{
			int digit=num%10;
			count++;
			num=num/10;
			
		}
		System.out.println(count);
	}

}
