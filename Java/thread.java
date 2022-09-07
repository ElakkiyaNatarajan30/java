class Class A extends Thread
{
public void run()
{
System.out.println("Start Thread A...");
for (int i=1; i<=5; i++)
{
if(i==1) yield();
Sytem.out.println(From Thread A 1="=i);

}
Sytem.out.println("...Exit Thread A");
}
}
class Class B extends Thread 
{
public void run ()
{
System.out.println("Start Thread B...");
for(int j=1; j<=5; j++)
{
System.out.println
}
}
}
