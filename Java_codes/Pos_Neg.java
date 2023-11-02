import java.io.*;
class Pos_Neg
{
public static void main(String ar[])
{	
	int a = Integer.parseInt(ar[0]);
	if(a==0)
		System.out.println(a+" is zero");
	else if(a>0)
		System.out.println(a+" is positive");
	else
		System.out.println(a+" is negative");

}
}