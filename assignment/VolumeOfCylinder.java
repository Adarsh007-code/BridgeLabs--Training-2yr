import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double volume = Math.PI * (radius * radius) * height;
        System.out.println("Volume of cylinder is: " + volume);
    }
}