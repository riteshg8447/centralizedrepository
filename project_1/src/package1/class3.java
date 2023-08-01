package package1;

public class class3 {
	public int sum(int a , int b)
	{
		int c;
		c= a+b;
		System.out.println("Result is"+c);
		return c;
	
	}
	public int sub(int a1,int a2)
	{
		int c1;
		c1 = a1-a2;
		System.out.println("Result is"+c1);
		return c1;
	}
	public void multi(int x, int y)
	{
		int z;
		z = x*y;
		System.out.println("Final result is " +z);
	}
	public static void main(String[] args) {
		class3 obj = new class3();
		int sumresult = obj.sum(15,2);
		int subresult = obj.sub(15,2);
		obj.multi(sumresult, subresult);
		
	}
}
