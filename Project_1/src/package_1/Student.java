package package_1;

public class Student {
int rollno;
int age;
public void display1()
{
	System.out.println("welcome to all of you");
}
public void display2()
{
	System.out.println("Automation is easy");
}
public static void main(String[] args) {
	Student Shreya=new Student();
	Shreya.rollno=12;
	Shreya.age=11;
	System.out.println("Roll no is" + Shreya.rollno);
	System.out.println("Age is" + Shreya.age);
Shreya.display1();
Shreya.display2();

}
}
