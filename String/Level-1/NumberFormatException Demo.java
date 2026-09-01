import java.util.Scanner;
class NumberFormatExceptionDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        try{
            System.out.println(Integer.parseInt(text));
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }
    }
}