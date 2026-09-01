import java.util.Scanner;

public class ShortLongWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String[] words=sc.nextLine().split(" ");
        String shortest=words[0], longest=words[0];
        for(int i=1;i<words.length;i++){
            if(words[i].length()<shortest.length()) shortest=words[i];
            if(words[i].length()>longest.length()) longest=words[i];
        }
        System.out.println("Shortest = "+shortest);
        System.out.println("Longest = "+longest);
    }
}