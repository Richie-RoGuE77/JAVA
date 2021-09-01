import java.io.*;
import java.util.*;
class OverLoadDemo
{
void test()
{
System.out.println("no parameters");
}
void test(int a)
{
System.out.println("a :"+a);
}
void test(int a,int b)
{
System.out.println("a and b :" +a+ "" +b);
}
double test(double a)
{
return a*a;
}
}

class Test
{
public static void main(String args[])throws IOException
{
int ch;
String s;
double result;
DataInputStream d=new DataInputStream(System.in);
OverLoadDemo od=new OverLoadDemo();
do
{
System.out.println("\n1.Call method with no parameters\n2.call method with one integer parameter");
System.out.println("\n3.Call method with two integers parameters\n4.call method with double parameter");
System.out.println("\n5.Exit");
s=d.readLine();
ch=Integer.parseInt(s);
switch(ch)
{
case 1:od.test();break;
case 2:od.test(10);break;
case 3:od.test(10,20);break;
case 4:result=od.test(11.2345);
System.out.println("Result= " +result);
break;
case 5:System.exit(0);break;
default:System.out.println("Invalid Choice\n Enter Choice 1-5");
}
}
while(ch!=5);
}
}