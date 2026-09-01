import java.util.Scanner;

class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements:");

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();

        int[] one = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                one[index++] = arr[i][j];

        System.out.println("1D Array:");

        for (int i = 0; i < one.length; i++)
            System.out.print(one[i] + " ");

        sc.close();
    }
}