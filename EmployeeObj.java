package arrayOfObject;

import java.util.*;

public class EmployeeObj {
	
	private static int count = 0;
	private int empId;
	private String empName;
	
	public EmployeeObj(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		count++;
	}
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int empCount = 0;
		for(int i = 0; i < 5; i++)
		{
			empCount++;
			System.out.println("Enter details for Employee "+ empCount + ":");
			System.out.println("Employee ID : ");
			int empId = sc.nextInt();
			
			System.out.println("Employee Name : ");
			String empName = sc.next();
			
			EmployeeObj e = new EmployeeObj(empId,empName);
			System.out.println();
		}	
		
		System.out.println("total no of employee = " +EmployeeObj.getCount());
		
		sc.close();
	}

}
