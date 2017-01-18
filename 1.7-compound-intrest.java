class compundintrest
{
	public static void main(String args[])
	{
		double a,p,r,n,ci;
		p=Double.parseDouble(args[0]);
		r=Double.parseDouble(args[1]);
		n=Double.parseDouble(args[2]);
		a=p+Math.pow((1+(r/100.0)),n);
		ci=a-p;
		System.out.println("amount="+a);
		System.out.println("compound interest="+ci);
		
	}
}