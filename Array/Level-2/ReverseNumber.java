import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = sc.next();

        char[] arr = number.toCharArray();

        System.out.print("Reverse = ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}