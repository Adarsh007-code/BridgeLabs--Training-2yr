import java.util.Scanner;

class LargestDigitAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = sc.next();

        int[] digit = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            digit[i] = number.charAt(i) - '0';
        }

        int largest = 0, second = 0;

        for (int i = 0; i < digit.length; i++) {
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