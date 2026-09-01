import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = sc.next();

        int[] freq = new int[10];

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            freq[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " = " + freq[i]);
        }

        sc.close();
    }
}