import java.util.*;
interface peacock1
{
public void display();
}
interface peacock2
{
public void display1();
}
class Test1 implements peacock1
{
public void display()
{
System.out.println("peacock1");
}

}
class Test
{
public static void main(String[] args)
{
Test1 v=new Test1();
v.display();
//v.display1();
}
}

