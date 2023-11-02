import java.util.Scanner;
class Student_A
{
private int rollno;
int getRollno()
{
return rollno;
}
//Method Declaration
void setRollno(int r)
{
rollno = r;
r = 50;
}
}
class Acc_Mut_Demo
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int ro = sc.nextInt();
	Student_A obj = new Student_A();
	obj.setRollno(10);
	//System.out.println(obj.getRollno());
	Student_A ob1 = new Student_A();
	ob1.setRollno(ro);
	System.out.println(ro);
	//System.out.println(ob1.getRollno());
}
}