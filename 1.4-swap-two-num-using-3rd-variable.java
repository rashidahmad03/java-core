class swap
{
	public static void main(String args[])
	{
		int a,b,t;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.print("\n before swapping:");
		System.out.print(a+" "+b);
		t=a;
		a=b;
		b=t;
		System.out.print("\n after swapping:");
		System.out.print(a+" "+b);
	}
}