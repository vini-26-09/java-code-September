class Static_Demo
{
	static int a=9;
	static String st = "Hello";
	String s;
	int b;
	void display()
	{
		a++;b++;
		System.out.println(a+" "+b);
		a=25;
	}
	static void show(Static_Demo ob)
	{
		System.out.println("value of a "+a);
		System.out.println("value of b "+ob.b);	
	}

}
class Main_Static_Demo
{
	public static void main(String arg[])
	{
		Static_Demo obj = new Static_Demo();
		Static_Demo ob2 = new Static_Demo();
		//obj.display();
		//ob2.display();
		ob2.b = 10;
		Static_Demo.show(obj);
		Static_Demo.show(ob2);
		Static_Demo.a = 20;
	}
	
}