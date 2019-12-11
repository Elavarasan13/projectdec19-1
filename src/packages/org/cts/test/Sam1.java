package packages.org.cts.test;

import packages.org.test.ClassDetails;
import packages.org.test.StuDetails;

public class Sam1 {
	
	private void schDetails() {
		System.out.println("sch name is:st.joseph's");
	}
	private void schStudent() {
		System.out.println("sch students tatal=1000");
	}
public static void main (String[]args) {
	Sam1 a =new Sam1();
	Sam1 b =new Sam1();
	
	a.schDetails();
	b.schStudent();
	ClassDetails d=new ClassDetails();
	d.stuName();
	d.stuId();
	StuDetails r=new StuDetails();
	r.stuName();
}
}
