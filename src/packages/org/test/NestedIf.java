package packages.org.test;

public class NestedIf {
public static void main(String[] args) {
	int a=4;
	if(a==5) {
		System.out.println("prime number");
	}
	else if(a>=3) {
		System.out.println("a prime number");
	}
	else if(a==2) {
		System.out.println("even prime number");
	}
	else{
		System.out.println("not a prime number");
	}
}
}
