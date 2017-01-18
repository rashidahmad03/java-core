class Swapwithout3
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.print("\n Before Swapping:");
		System.out.print(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\n after swapping:");
		System.out.print(a+" "+b);
	}
}