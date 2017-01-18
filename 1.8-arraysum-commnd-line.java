class arraysum
{
	public static void main(String args[])
	{
		int s=0,length;
		length=args.length;
		for(int i=0;i<length;i++)
		{
		int x=Integer.parseInt(args[i]);
		s=s+x;
	
	}
System.out.println("sum of command line arraysum:="+s);
	}

}