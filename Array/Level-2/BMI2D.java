import java.util.Scanner;

class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter persons: ");
        int n = sc.nextInt();

        double[][] person = new double[n][3];

        for (int i = 0; i < n; i++) {
            System.out.print("Weight: ");
            person[i][0] = sc.nextDouble();

            System.out.print("Height: ");
            person[i][1] = sc.nextDouble();

            person[i][2] = person[i][0] / (person[i][1] * person[i][1]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(person[i][0] + " " + person[i][1] + " " + person[i][2]);
        }

        sc.close();
    }
}