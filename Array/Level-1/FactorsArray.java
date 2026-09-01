import java.util.Scanner;

class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] factor = new int[number];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor[index] = i;
                index++;
            }
        }

        System.out.println("Factors are:");

        for (int i = 0; i < index; i++)
            System.out.print(factor[i] + " ");

        sc.close();
    }
}