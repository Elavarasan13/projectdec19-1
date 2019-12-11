package packages.org.cts.test;

public class Cli implements Emp {

	@Override
	public void empId() {
		// TODO Auto-generated method stub
		System.out.println("emp id is 135");
		
	}

	@Override
	public void empName() {
		// TODO Auto-generated method stub
		System.out.println("emp name is raja");
		
	}
	public static void main(String[] args) {
		Cli c=new Cli();
		c.empId();
		c.empName();
			
		}
	}
	


