package emp_details_java;

public class employee1 {
	public static void main(String args[]) {
		employee e1 = new employee("Robert",1994,50000,"64C-wallstreat");
		employee e2 = new employee("Sam",2000,50000,"68D-wallstreat");
		employee e3 = new employee("John",1999,50000,"26B-wallstreat");
		
		e1.printInfo();
		e2.printInfo();
		e3.printInfo();
	}

}
