import java.util.Scanner;

class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double per = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            String grade;

            if (per >= 90)
                grade = "A";
            else if (per >= 75)
                grade = "B";
            else if (per >= 50)
                grade = "C";
            else
                grade = "F";

            System.out.println("Percentage = " + per);
            System.out.println("Grade = " + grade);
        }

        sc.close();
    }
}