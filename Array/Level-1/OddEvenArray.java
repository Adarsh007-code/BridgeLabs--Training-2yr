import java.util.Scanner;

class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Number");
            return;
        }

        int[] even = new int[number];
        int[] odd = new int[number];

        int e = 0, o = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");

        System.out.println();

        System.out.println("Even Numbers:");
        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");

        sc.close();
    }
}