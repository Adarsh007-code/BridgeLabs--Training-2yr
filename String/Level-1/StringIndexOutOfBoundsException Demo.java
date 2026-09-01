import java.util.Scanner;
class StringIndexOutOfBoundsExceptionDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}