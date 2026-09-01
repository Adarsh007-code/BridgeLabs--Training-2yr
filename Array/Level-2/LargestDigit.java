import java.util.Scanner;

class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] digit = new int[10];
        int index = 0;

        while (number > 0) {
            digit[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (digit[i] > largest) {
                second = largest;
                largest = digit[i];
            } else if (digit[i] > second && digit[i] != largest) {
                second = digit[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);

        sc.close();
    }
}