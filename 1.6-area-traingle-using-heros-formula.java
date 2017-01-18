class areatraingle
{
public static void main(String args[])
{
double area,a,b,c,s;
a=Double.parseDouble(args [0]);
b=Double.parseDouble(args [1]);
c=Double.parseDouble(args [2]);
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area of traingle is::::"+area);
}
}