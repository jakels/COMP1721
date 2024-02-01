import java.util.Scanner; // Package

public class Main // If a class is public then the name of the class must match the name of the file
{
    public static void main(String[] args)
    {
        System.out.print("Distance in miles : ");

        Scanner input = new Scanner(System.in);
        double distance = input.nextDouble();

        System.out.printf("Distance in km : %.1f km", (distance*1.60934)); // Format string using .printf, similar to c
    }
}