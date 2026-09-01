import java.util.Scanner;

public class VowelCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine().toLowerCase();
        int v=0,c=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
                else c++;
            }
        }
        System.out.println("Vowels = "+v);
        System.out.println("Consonants = "+c);
    }
}