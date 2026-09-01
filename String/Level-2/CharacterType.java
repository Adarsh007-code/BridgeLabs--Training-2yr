import java.util.Scanner;

public class CharacterType{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine().toLowerCase();
        System.out.println("Character\tType");
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    System.out.println(ch+"\t\tVowel");
                else System.out.println(ch+"\t\tConsonant");
            }else System.out.println(ch+"\t\tNot Letter");
        }
    }
}