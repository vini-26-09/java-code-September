import java.io.*;
import java.util.Scanner;
class Loop1
{
public static void main(String args[])
{	
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int fact = 1;
	for(int i=1;i<=n;i=i+1)
	{
		fact = fact*i;	
	}
	System.out.println(fact);
}
}