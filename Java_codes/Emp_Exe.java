import java.util.Scanner;
class Employee{
	String name;
	int emp_id;
	int basic_sal;
	void input()
	{	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name");
		name = in.nextLine();
		System.out.println("Enter the id");
		emp_id = in.nextInt();
		System.out.println("Enter the basic_sal");
		basic_sal = in.nextInt();	
	} 

	float computeSal()
	{
		float gross_sal;
		gross_sal = (float)(basic_sal + 0.18 * basic_sal+0.5*basic_sal-0.12*basic_sal);
		return gross_sal;
	}

	void output()
	{
		System.out.println("Details are");
		System.out.println(name);
		System.out.println(emp_id);
		System.out.println(basic_sal);
		System.out.println(computeSal());
	
	}
}

class Emp_Exe
{
	public static void main(String args[])
	{
	Employee e = new Employee();
	e.input();
	e.output();
	}

}