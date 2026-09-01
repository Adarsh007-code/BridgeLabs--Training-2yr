import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            double per = (p + c + m) / 3.0;

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