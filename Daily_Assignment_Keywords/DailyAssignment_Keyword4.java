package day10_Keywords;

final class SecurityPolicy{
	
	void displayPolicy() {
		
		System.out.println("Security policy displayed");
		
	}
	
}

class AdminPolicy extends SecurityPolicy{
	
	
}

public class DailyAssignment_Keyword4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecurityPolicy add= new SecurityPolicy();
		add.displayPolicy();
							
	}

}
