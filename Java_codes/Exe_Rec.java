import java.util.Scanner;
class Rectangle
{
	//properties
	int len;
	int br;

	//Constructor - to initialize the properties
	//classname()
	//1. No-argument Constructor
	//2. Parameterized Constructor
	//3. Default Constructor


	Rectangle()  //No-argument constructor
	{
		len =100;
		br = 20;

	}

	Rectangle(int l)
	{
		len = l;	
		br = 30;
	}

	//parameterized Constructor
	Rectangle(int l, int b)
	{
		len = l;
		br = b;
	}

	//methods
	//returntype methodname(set_of_arguments)
	//method definition
	void calcArea1(int l,int b)
	{
		System.out.println(l*b);
	}

	int calcArea() 
	{
		int area;
		area = len*br;
		//System.out.println("Area is "+area+" m^2 units");
		return area;
	}
	void calcPerimeter()
	{
		int peri;
		peri = 2 * (len+br);
		System.out.println("Perimeter is "+peri);
	}
}
class Exe_Rec
{
public static void main(String args[])
{
	
	//create object for the class
	Rectangle obj = new Rectangle(); // will call the no-argument constructor
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the length and breadth");
	int p = in.nextInt();
	int q = in.nextInt();
	
	Rectangle ob2 = new Rectangle(p,q);// will call the parameterized constructor

	System.out.println("First Object");
	System.out.println(obj.len+" "+obj.br);

	System.out.println("Second Object");
	System.out.println(ob2.len+" "+ob2.br);	
	

}
}




