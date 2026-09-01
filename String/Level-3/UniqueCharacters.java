import java.util.Scanner;
public class UniqueCharacters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.print("Unique: ");
        for(int i=0;i<text.length();i++){
            int c=0;
            for(int j=0;j<text.length();j++) if(text.charAt(i)==text.charAt(j)) c++;
            if(c==1) System.out.print(text.charAt(i)+" ");
        }
    }
}