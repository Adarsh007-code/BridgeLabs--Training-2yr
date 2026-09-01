import java.util.Scanner;
public class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()){System.out.println("Not Anagram"); return;}
        int[] f=new int[256];
        for(int i=0;i<a.length();i++){f[a.charAt(i)]++; f[b.charAt(i)]--;}
        for(int i=0;i<256;i++) if(f[i]!=0){System.out.println("Not Anagram"); return;}
        System.out.println("Anagram");
    }
}