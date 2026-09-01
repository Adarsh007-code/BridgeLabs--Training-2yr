import java.util.Scanner;

public class VotingEligibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter Age "+(i+1)+": ");
            age[i]=sc.nextInt();
        }
        System.out.println("Age\tCan Vote");
        for(int a:age){
            if(a>=18) System.out.println(a+"\tYes");
            else System.out.println(a+"\tNo");
        }
    }
}