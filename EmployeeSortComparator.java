

import java.util.*;
class Employee1
{
	private int empId,salary;
	private String name;
	public Employee1(int empId,String name,int salary) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", name=" + name + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class EmpIdCompare implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2) 
	{
		return  e1.getEmpId() - e2.getEmpId();
	}
}

class NameCompare implements Comparator<Employee1> 
{
    @Override
    public int compare(Employee1 e1, Employee1 e2) 
    {
        return e1.getName().compareTo(e2.getName());
    }
}
class SalaryCompare implements Comparator<Employee1> 
{
    @Override
    public int compare(Employee1 e1, Employee1 e2) 
    {
        return e1.getSalary() - e2.getSalary();
    }
}
public class EmployeeSortComparator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Employee1> empList = new ArrayList<Employee1>();
		empList.add(new Employee1(1,"vandit",50000));
		empList.add(new Employee1(2,"shubham",60000));
		empList.add(new Employee1(3,"raj",55000));
		empList.add(new Employee1(4,"krish",75000));
		empList.add(new Employee1(5,"bhavya",45000));
		
		System.out.println("-----------------------");
        System.out.println("Unsorted List:");
        System.out.println("-----------------------");
        for (Employee1 emp : empList) 
        {
            System.out.println(emp);
        }
        System.out.println("-----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting option:");
        System.out.println("1. Sort by empId");
        System.out.println("2. Sort by name");
        System.out.println("3. Sort by salary");
        int choice = scanner.nextInt();
        scanner.close();
        
        switch (choice) 
        {
        	case 1:
        		Collections.sort(empList, new EmpIdCompare());
        		System.out.println("-----------Sorted : empId------------");
        		break;
        	case 2:
        		Collections.sort(empList, new NameCompare());
        		System.out.println("-----------Sorted : name------------");
        		break;
        	case 3:
        		Collections.sort(empList, new SalaryCompare());
        		System.out.println("-----------Sorted : salary------------");
        		break;
        	default:
        		System.out.println("Invalid choice so Sorting by empId:");
        		Collections.sort(empList, new EmpIdCompare());
        		System.out.println("-----------Sorted : empId------------");
        		break;
        }
        
        for (Employee1 emp : empList) 
        {
            System.out.println(emp);
        }

	}

}