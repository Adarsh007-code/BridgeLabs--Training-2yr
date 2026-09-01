import java.util.Scanner;
public class FirstNonRepeatingCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        for(int i=0;i<text.length();i++){
            int c=0;
            for(int j=0;j<text.length();j++) if(text.charAt(i)==text.charAt(j)) c++;
            if(c==1){System.out.println(text.charAt(i)); return;}
        }
        System.out.println("No unique character");
    }
}