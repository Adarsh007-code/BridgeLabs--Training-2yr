import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Phy\tChem\tMath\tTotal\tPer\tGrade");
        for(int i=0;i<n;i++){
            int phy=(int)(Math.random()*100);
            int chem=(int)(Math.random()*100);
            int math=(int)(Math.random()*100);
            int total=phy+chem+math;
            double per=total/3.0;
            String grade;
            if(per>=90) grade="A+";
            else if(per>=80) grade="A";
            else if(per>=70) grade="B";
            else if(per>=60) grade="C";
            else if(per>=50) grade="D";
            else grade="F";
            System.out.println(phy+"\t"+chem+"\t"+math+"\t"+total+"\t"+per+"\t"+grade);
        }
    }
}