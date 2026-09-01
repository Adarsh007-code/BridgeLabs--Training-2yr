import java.util.Scanner;
import java.time.*;
public class Calendar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int year=sc.nextInt();
        LocalDate d=LocalDate.of(year,month,1);
        int days=d.lengthOfMonth();
        int first=d.getDayOfWeek().getValue()%7;
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<first;i++) System.out.print("    ");
        for(int i=1;i<=days;i++){
            System.out.printf("%3d ",i);
            if((i+first)%7==0) System.out.println();
        }
    }
}