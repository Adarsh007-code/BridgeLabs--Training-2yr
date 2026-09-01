import java.util.Scanner;

public class TrimString{
    public static String myTrim(String text){
        int start=0,end=text.length()-1;
        while(text.charAt(start)==' ') start++;
        while(text.charAt(end)==' ') end--;
        String result="";
        for(int i=start;i<=end;i++) result+=text.charAt(i);
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.println("Trimmed = "+myTrim(text));
        System.out.println("Built-in = "+text.trim());
    }
}