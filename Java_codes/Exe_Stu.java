/*
create a student class with name, id and marks of 5 subjects as properties and 
contains methods for calculating the total marks of student, average marks of 
the student.
Write input and output methods for getting input from the user and 
printing the results
*/
import java.util.Scanner;
class Student
{
	String name;
	int id;
	int marks[];

	void input()
	{
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the name");
		name = in.nextLine();
		System.out.println("Enter the id");
		id = in.nextInt();
		System.out.println("Enter the marks");
		marks = new int[5];
		for(int i=0;i<5;i++)
			marks[i] = in.nextInt();
	}
	void display(int m[])
	{
		marks = new int[m.length];
		for(int i=0;i<m.length;i++)
			marks[i] = m[i];
		for(int i=0;i<m.length;i++)
			System.out.println(marks[i]);		
	}

	void output()
	{
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
		System.out.println("Marks are ");	
		for(int i =0;i<5;i++)
			System.out.print(marks[i]+" ");
		System.out.println("Total marks are "+totalmarks());
		System.out.println("Average marks is "+averagemarks());

	}
	int totalmarks()
	{
		int sum = 0;
		for(int i=0;i<5;i++)
			sum+=marks[i];
		return sum;
	}

	int averagemarks()
	{
		int avg=totalmarks()/5;
		return avg;
	}
}

class Exe_Stu
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		//st.input();
		//st.output();
		int m1[] = new int[5];
		for(int i = 0;i<5;i++)
			m1[i] = sc.nextInt();	
		st.display(m1);  
		
	}

}