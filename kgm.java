import java.util.Scanner;
public class kgm
{
    public static void main(String[] args)
    {
        Scanner io = new Scanner(System.in);
        System.out.print("Radius= ");
        double radius = io.nextDouble();
        System.out.println("Perimeter is = "+ (2* Math.PI * radius));
        System.out.println("Area is = " + (Math.PI *radius * radius ));
    }
}
