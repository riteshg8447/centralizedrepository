package package1;
// everything we will write in the Body(boundary)
public class student 
{   // {}means that is the boundary(body) of the class 
int a ;   // a is a variable and it will store int value

public void deepak()   // ()- indicates this is a method 
{ 
	System.out.println("welcome to all of you");

}
public static void main(String[] args) {
student abc = new student();   // third piller of java code 
abc.deepak();   // calling the deepak method 
abc.deepak();   // calling the deepak method  again
abc.a = 122;
System.out.println("welcome to all of everyone ");
}
}
