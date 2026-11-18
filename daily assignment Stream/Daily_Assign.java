package day18_StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Daily_Assign {
	String name;
	double salary;
	
	Daily_Assign(String name,double salary){
		
		this.name=name;
		this.salary=salary;
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daily_Assign e1= new Daily_Assign("Rahul", 140000);
		Daily_Assign e2= new Daily_Assign("AMit", 30000);
		Daily_Assign e3= new Daily_Assign("Priya", 60000);
		
		
		ArrayList<Daily_Assign>list=new ArrayList<Daily_Assign>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Ascending Salary");
		list.stream().sorted(Comparator.comparing(Daily_Assign::getSalary)).forEach(s->System.out.println(s.salary));
		
		System.out.println("Descending***************");
		list.stream().sorted(Comparator.comparing(Daily_Assign::getSalary).reversed()).forEach(s->System.out.println(s.salary));
		
		
		System.out.println("Total Salary");
		double sumvalue=list.stream().map(Daily_Assign::getSalary).mapToDouble(Double::doubleValue).sum();
		System.out.println(sumvalue);

	}

}
