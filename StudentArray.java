package arrayOfObject;

import java.util.*;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] rollNos = new int[5];
		String[] names = new String[5];
		int[] marks = new int[5];
		
		int count = 0;
		do {
			System.out.println("Enter details for Student " + (count + 1) + ":");
			System.out.print("rollNo : ");
			rollNos[count] = sc.nextInt();
			
			System.out.print("name : ");
			names[count] = sc.next();
			
			System.out.print("mark : ");
			marks[count] = sc.nextInt();
			
			sc.nextLine();	//consume new line
			
			count++;
			
			System.out.println();
		}while(count < 5);
		
		System.out.println("Student details : ");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("RollNo : "+rollNos[i]);
			System.out.println("Name : "+names[i]);
			System.out.println("Mark : "+marks[i]);
		}
		sc.close();
	}

}
