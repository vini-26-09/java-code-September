class Rectangl
{
	public int len;
	int br;
	void calcArea()
	{
		System.out.println(len*br);
	}

}

class ExeRec
{
	public static void main(String args[])
	{
		Rectangl obj = new Rectangl();
		obj.len = 5;
		obj.br = 10;
		obj.calcArea();
	}	
}