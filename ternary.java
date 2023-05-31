package operator_java;

public class ternary {
	public static void main(String args[]) {
		int a=50, b=100, c=80, max;
		max = (a>b) ? (a>c ? a:c) : (b>c ? b:c);
		System.out.println(max);
	}

}
