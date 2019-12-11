package packages.org.test;

public class Continue {
public static void main(String[]args) {
	for (int r=25;r>15;r--) {
		if(r==20) {
			continue;
		}
		System.out.println(r);
	}
	System.out.println("end");
}
}
