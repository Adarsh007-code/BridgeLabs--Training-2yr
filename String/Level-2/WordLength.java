import java.util.Scanner;

public class WordLength {
    public static String[] splitWords(String text){
        int count=1;
        for(int i=0;i<text.length();i++) if(text.charAt(i)==' ') count++;
        String[] words=new String[count];
        String temp=""; int j=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){ words[j++]=temp; temp=""; }
            else temp+=text.charAt(i);
        }
        words[j]=temp;
        return words;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text=sc.nextLine();
        String[] words=splitWords(text);
        System.out.println("Word\tLength");
        for(String w:words) System.out.println(w+"\t"+w.length());
    }
}