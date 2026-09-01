import java.util.Scanner;
class CreateSubstring{
    static String makeSub(String s,int start,int end){
        String ans="";
        for(int i=start;i<end;i++) ans+=s.charAt(i);
        return ans;
    }
    static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String a=makeSub(s,start,end);
        String b=s.substring(start,end);
        System.out.println(a);
        System.out.println(b);
        System.out.println(compare(a,b));
    }
}