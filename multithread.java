class A implements Runnable
{
Thread thrd;
A(String name) {
thrd = new Thread(this, name);
thrd.start(); // start the thread
}
synchronized public void run()
{
try{
while(true)
{
Thread.sleep(1000);
System.out.println("good morning");
}
}
catch(Exception e)
{
System.out.println(thrd.getName() + " interrupted.");
}
}
}
class B implements Runnable
{
Thread thrd;
// Construct a new thread.
B(String name) {
thrd = new Thread(this, name);
thrd.start(); // start the thread
}
synchronized public void run()
{
try{
while(true){
Thread.sleep(2000);
System.out.println("hello");
}
}
catch(Exception e)
{
System.out.println(thrd.getName() + " interrupted.");
}
}
}
class C implements Runnable
{
Thread thrd;
// Construct a new thread.
C(String name) {
thrd = new Thread(this, name);
thrd.start(); // start the thread
}
synchronized public void run()
{
try{
while(true)
{
Thread.sleep(3000);
System.out.println("welcome");
}
}
catch(Exception e)
{
System.out.println(thrd.getName() + " interrupted.");
}
}
}
class ThreadDemo
{
public static void main(String args[]){
A t1=new A("thread1");
B t2=new B("thread2");
C t3=new C("thread3");
}
}
