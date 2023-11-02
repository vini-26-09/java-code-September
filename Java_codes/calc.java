import java.io.*;
import java.util.Scanner;
class calc
{
public static void main(String args[])
{
	int a,b,op;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the value of a and b");
	a = input.nextInt();
	b = input.nextInt();
	System.out.println("Press 1.Add 2.Sub 3.Mul 4.Div");
	op = input.nextInt();
	switch(op)
	{
		case 1: System.out.println("Sum is "+(a+b));
			break;
		case 2: System.out.println(a-b);
			break;
		case 3: System.out.println(a*b);
			break;
		case 4: System.out.println(a/b);
			break;
		default: System.out.println("Give valid operator");
			break;
	}
}
}