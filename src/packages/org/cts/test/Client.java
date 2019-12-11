package packages.org.cts.test;

public class Client extends Employee1{

	@Override
	public void empId() {
		// TODO Auto-generated method stub
		System.out.println("Employee id is 123");
	}
	public void clientId() {
		System.out.println("client id is 345");
	}
	public static void main(String[] args) {
		Client c=new Client();
		c.empName();
		c.empId();
		c.clientId();
	}
	

}
