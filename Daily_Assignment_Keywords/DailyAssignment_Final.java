package day10_Keywords;


class EmployeeJ {
	
	int employeeId;
	String employeeName;
	double salary;
	
	
	EmployeeJ(int employeeId,String employeeName,double salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	void displayDetails()
	{
		System.out.println(this.employeeId+":"+this.employeeName+":"+this.salary+":");
	}

	
	
}

public class DailyAssignment_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeJ employee=new EmployeeJ(100,"James", 2000);
		EmployeeJ employee2=new EmployeeJ(101,"Ramesh", 10000);
		
		employee.displayDetails();
		employee2.displayDetails();
	}
}
