package student_java;

import java.util.Scanner;

public class grade {
	public static void main(String args[]) {
		int a,b,c,d, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks of subject a");
		a=sc.nextInt();
		System.out.println("enter marks of subject b");
		b=sc.nextInt();
		System.out.println("enter marks of subject c");
		c=sc.nextInt();
		System.out.println("enter marks of subject d");
		d=sc.nextInt();
		
		sum = a+b+c+d;{
		System.out.println("total marks="+sum);}
		
		int avg = sum/4;{
		System.out.println("average marks="+avg);}
		
		
		if(avg>=90) {
			System.out.println("Grade A");
		}
		else if(avg>=80 && avg<=90) {
			System.out.println("Grade B");
		}
		else if(avg>=70 && avg<=80) {
			System.out.println("Grade C");
		}
		else if(avg>=60 && avg<=70) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("FAIL");
		}	
		   
		
	}

}
