import java.io.*;
import java.util.Scanner;
class array_2
{
public static void main(String args[])
{
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number of students");
	int r = in.nextInt();
	System.out.println("Enter the number of quizzes");	
	int c = in.nextInt();	
	int sum = 0;
	float avg;
	int marks[][] = new int[r][c];
	System.out.println("Enter marks for "+r+" students");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{	
			System.out.println("Enter marks for "+(i+1)+" student for the week "+(j+1));
			marks[i][j]=in.nextInt();
		}
	}
	for(int i=0;i<r;i++)
	{
		sum = 0;
		for(int j=0;j<c;j++)
		{
			sum = sum+marks[i][j];
		}
		avg = (float)sum/c;
		System.out.println("avg of student "+(i+1)+" student "+avg);
	}
	for(int j=0;j<c;j++)
	{
		sum=0; 
		for(int i=0;i<r;i++)
		{
			sum = sum+marks[i][j];
		}
		System.out.println("sum of quiz "+(j+1)+" "+sum);
	}
}
}