package emp_details_java;

public class employee {
	String name;
	int year ;
	double salary;
	String address;
	
	public employee(String name, int year, double salary, String address) {
		this.name = name;
		this.year  = year;
		this.salary = salary;
		this.address = address;
	}
	public void printInfo() {
		System.out.println(name+""+year +""+salary+""+address+""); 
	}

}
