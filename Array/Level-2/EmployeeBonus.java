import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            double bonus;
            if (years > 5)
                bonus = salary[i] * 5 / 100;
            else
                bonus = salary[i] * 2 / 100;

            System.out.println("Old Salary = " + salary[i]);
            System.out.println("Bonus = " + bonus);
            System.out.println("New Salary = " + (salary[i] + bonus));

            totalBonus += bonus;
        }

        System.out.println("Total Bonus = " + totalBonus);
        sc.close();
    }
}