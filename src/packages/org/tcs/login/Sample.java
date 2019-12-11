package packages.org.tcs.login;

public class Sample{
	public void studentDetails(int Id) {
		System.out.println("student Id id"+Id); 
	}
	public void studentDetails(String name) {
		System.out.println("student name is"+name);
	}
	public void studentDetails(int rollno,char sec,String standard) {
		System.out.println("student roll no is"+rollno+"\n"+"section"+sec+"\t"+"std"+standard);
		
	}
	public void studentDetails(String address,long phno) {
		System.out.println("address"+address);
		System.out.println("phone number is"+phno);
	}
	public static void main(String[]args) {
		Sample s=new Sample();
		s.studentDetails(256);
		s.studentDetails("elaa");
		s.studentDetails(25, 'A', "10th std");
		s.studentDetails("chennai", 9445894431l);
	}

}
