//To print Hello World n times
import java.io.*;
import java.util.Scanner;
class Loops_Ex
{
public static void main(String args[])
{
	int i;
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	for(i=0;i<n;i++)
	{
		System.out.println("Hello World");
	}
}
}