import java.util.Scanner;
public class CharacterFrequencyUsingUniqueCharacters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        for(int i=0;i<text.length();i++){
            boolean seen=false;
            for(int j=0;j<i;j++) if(text.charAt(i)==text.charAt(j)) seen=true;
            if(!seen){
                int c=0;
                for(int k=0;k<text.length();k++) if(text.charAt(i)==text.charAt(k)) c++;
                System.out.println(text.charAt(i)+" : "+c);
            }
        }
    }
}