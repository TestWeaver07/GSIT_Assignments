package day10_Keywords;

class Employee{
	
	final void calculateBonus() {
		
		System.out.println("Hello");
		
	}
	
	
}

class Manager extends Employee{
	
	void calculateBonus() {
		
		System.out.println("Bye");
		
	}
	
}

public class DailyAssignment_Keywords3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee= new Employee();
		employee.calculateBonus();

	}

}
