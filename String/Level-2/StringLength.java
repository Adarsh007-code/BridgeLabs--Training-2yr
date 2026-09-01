import java.util.Scanner;

public class StringLength {
    public static int findLength(String s) {
        int count=0;
        for(char ch:s.toCharArray()) count++;
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.next();
        System.out.println("Length = "+findLength(s));
        System.out.println("Built-in Length = "+s.length());
    }
}