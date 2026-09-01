import java.util.Scanner;
class CompareTwoStrings{
    static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println("User Method: "+compare(s1,s2));
        System.out.println("Built-in: "+s1.equals(s2));
    }
}