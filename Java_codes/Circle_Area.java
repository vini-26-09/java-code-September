import java.io.*;
class Circle_Area
{
public static void main(String args[])
{
	double pi=3.14,area;
	int radius;
	radius = Integer.parseInt(args[0]);
	area = pi * radius * radius;
	System.out.println(area);
}
}