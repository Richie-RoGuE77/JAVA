import java.util.*;
class Quad
{
public static void main(String args[])
{
int a,b,c,d,f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of a,b and c: ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=(b*b)-(4*a*c);
if(d==0)
{
System.out.println("Roots are real and equal");
f=1;
}
else if(d>0)
{
System.out.println("Roots are real and not equal");
f=1;
}
else
System.out.println("Roots are imaginary");
if(f==1)
{
float r1=(float)(-b+Math.sqrt(d))/(2*a);
float r2=(float)(-b-Math.sqrt(d))/(2*a);
System.out.println("Roots are: "+r1+" and "+r2);
}
}
}