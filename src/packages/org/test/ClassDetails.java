package packages.org.test;

public class ClassDetails {

	public void stuName() {
		System.out.println("student name is ram");
		
	}
	public void stuId() {
		System.out.println("student id is 110");
	}
	public static void main (String[]args){
		ClassDetails d=new ClassDetails();
		d.stuName();
		d.stuId();
		StuDetails f=new StuDetails();
		f.stuName();
	}
	
	
	
	
}
