package package1;

public class Assignment2 {
	public int addition(int a,int b)
	{
		int c = a+b;
		return c;
	}
public int subtraction(int a,int b)
{
	int c = a-b;
	return c;	
	}
public int multi(int a , int b)
{
	int c = a*b;
	return c ;
	
	}
public int division(int a , int b )
{
	int c = a/b;
	return c ;
	}
public static void main(String[] args) {
	Assignment2 Cal = new Assignment2();
	int z = Cal.addition(10,2);
	int z1 = Cal.addition(z,2);
	int z2 = Cal.subtraction(z1,2);
	int z3 = Cal.multi(z2,2);
	int result = Cal.division(z3,2);
	System.out.println(result);
 
}
}

