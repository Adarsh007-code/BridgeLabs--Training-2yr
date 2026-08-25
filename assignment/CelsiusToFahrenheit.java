import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        int celsius = sc.nextInt();

        double fahrenheit = (celsius * 9.0/5.0) + 32;
        System.out.println("Fahrenheit temperature: " + fahrenheit);
    }
}