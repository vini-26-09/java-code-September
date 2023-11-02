/*Syntax:
declaration:
datatype variable_name[];
Allocate memory:
datatype variable_name[] = new datatype[size_of_array];

Accessing the elements of array:
To access the array elements, we need to use index
variable_name[index]
index value always starts with 0.
*/

import java.io.*;
import java.util.Scanner;
class array
{
public static void main(String args[])
{
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number of students");
	int n = in.nextInt();	
	int sum = 0;
	float avg;
	int marks[] = new int[n];
	System.out.println("Enter marks for "+n+" students");
	for(int i=0;i<n;i++)
	{		
	marks[i] = in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	sum = sum + marks[i];		
	System.out.println(marks[i]);
	}
	avg = (float)sum / n;
	System.out.println("Sum is "+sum);
	System.out.println("avg is "+avg);
}
}