import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            System.out.print("Weight(kg): "); data[i][0]=sc.nextDouble();
            System.out.print("Height(cm): "); data[i][1]=sc.nextDouble();
        }
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for(int i=0;i<10;i++){
            double h=data[i][1]/100.0;
            double bmi=data[i][0]/(h*h);
            String s=bmi<18.5?"Underweight":bmi<25?"Normal":bmi<30?"Overweight":"Obese";
            System.out.printf("%.0f\t%.0f\t%.1f\t%s\n",data[i][0],data[i][1],bmi,s);
        }
    }
}