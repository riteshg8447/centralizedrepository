package package1;

public class Assignment3 {
	public int addition(int a, int b)
	{
		int c= a+b;
		return c;
		
	}
public int subtraction(int a , int b)
{
	int c = a-b;
	return c;
	
	}
public int multi(int a , int b)
{
	int c = a*b;
	return c ;
	
	}
public int division(int a , int b)
{
int c = a/b;
return c;

}
public static void main(String[] args) {
Assignment3 cal = new Assignment3();
int z = cal.division(10,2);
int z1 = cal.subtraction(z, 2);
int z2 = cal.addition(z1,2);
int z3 = cal.subtraction(z2,2);
int result = cal.multi(z3,2);
System.out.println(result);
	
}
}
