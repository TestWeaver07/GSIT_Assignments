package day3;

public class ClassProgrramme_ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1634;
		int orignal=num;
		int noOfDigit=0;
		
		int armstrong=0;
		
		
		for(;num>0;) {
			
			noOfDigit++;
			num=num/10;
		}
		num=orignal;
		for (;num>0;)
		{
			int lastDigit=num%10;
			int multiply=1;
			for(int i=1;i<=noOfDigit;i++)
			{
				multiply=multiply*lastDigit;
			}
				armstrong=armstrong+multiply;
				num=num/10;;
						
		}
			System.out.println("armstrong result"+armstrong);
			if (orignal == armstrong) {
	            System.out.println("Armstrong number");
	        } else {
	            System.out.println("Not Armstrong number");
	        }
		}}