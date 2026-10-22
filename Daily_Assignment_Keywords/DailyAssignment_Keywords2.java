package day10_Keywords;


class Company{
	
	final String COMPANY_NAME="Tech Solutions Pvt. Ltd.";
	final int MAX_EMPLOYEES= 100;
	

void displayMethod() {
	
	System.out.println(this.COMPANY_NAME +"  "+   this.MAX_EMPLOYEES);
	
}
}
public class DailyAssignment_Keywords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company company=new Company();
		company.displayMethod();
		company.COMPANY_NAME="Max";	
	}

}
