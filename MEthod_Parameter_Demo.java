class Method_Parameter
{
	int a,b;
	void display(int a_value)
	{
		System.out.println(a);
		a_value = 20;
		System.out.println(a_value);
	}
	void display1(Method_Parameter o)
	{
		o = new Method_Parameter();
		System.out.println(o.a);
		a = 65;
		b = 20;
		System.out.println(o.a);			
	}
	void setA(int a)
	{
		this.a = a;
		System.out.println(a);
	}
}
class MEthod_Parameter_Demo
{
	public static void main(String a[])
	{
		int val;
		val = 10;
		Method_Parameter obj = new Method_Parameter();
		//obj.a = 45;
		//obj.display1(obj);
		
		//Method_Parameter b1 = obj;
		//System.out.println(obj.b);
		obj.setA(50);
		System.out.println(obj.a);
	}
}