import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10)
                break;

            arr[index] = num;
            index++;
        }

        double sum = 0;

        System.out.println("Numbers are:");

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}