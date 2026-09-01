import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        boolean ok=true;
        int i=0,j=text.length()-1;
        while(i<j){
            if(text.charAt(i)!=text.charAt(j)){ok=false; break;}
            i++; j--;
        }
        System.out.println(ok?"Palindrome":"Not Palindrome");
    }
}