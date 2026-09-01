import java.util.Scanner;
public class CharacterFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int[] f=new int[256];
        for(int i=0;i<text.length();i++) f[text.charAt(i)]++;
        for(int i=0;i<256;i++) if(f[i]>0) System.out.println((char)i+" : "+f[i]);
    }
}