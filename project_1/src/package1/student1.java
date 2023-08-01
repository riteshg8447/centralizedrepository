package package1;

public class student1 {
	int age = 35;
	int rollno = 10011;
	public void display1()
	{
		System.out.println("Automation is very easy");
	}
public void display2()
{
	System.out.println("Welcome to all of you ");
	}
public static void main(String[] args) {
	student1 s = new student1();
	System.out.println("age is =" +s.age);
	System.out.println("rollno is=" +s.rollno);
	s.display1();
	s.display2();
}
}
