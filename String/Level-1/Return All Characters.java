import java.util.Scanner;
class ReturnAllCharacters{
    static char[] makeArray(String s){
        char[] a=new char[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i);
        return a;
    }
    static boolean same(char[] a,char[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i]) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(same(makeArray(s),s.toCharArray()));
    }
}