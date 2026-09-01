import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Weight: ");
            weight[i] = sc.nextDouble();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double bmi = weight[i] / (height[i] * height[i]);

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            System.out.println(weight[i] + " " + height[i] + " " + bmi + " " + status);
        }

        sc.close();
    }
}