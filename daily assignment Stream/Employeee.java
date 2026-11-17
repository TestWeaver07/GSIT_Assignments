package day18_StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Employeee {
	
	String name;
	double salary;
	
	Employeee(String name,double salary){
		
		this.name=name;
		this.salary=salary;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeee e1= new Employeee("rahul", 140000);
		Employeee e2= new Employeee("chetan", 30000);
		Employeee e3= new Employeee("karan", 60000);
		Employeee e4= new Employeee("sachin", 10000);
		
		ArrayList<Employeee>list=new ArrayList<Employeee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		List<Employeee>filteredEmployeees=list.stream().filter(s->s.salary>50000).toList();
		
		filteredEmployeees.stream().forEach(s1->System.out.println(s1.name + ":"+ s1.salary));
		

	}

}
