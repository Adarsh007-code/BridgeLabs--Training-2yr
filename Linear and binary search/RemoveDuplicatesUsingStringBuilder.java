import java.util.Scanner;
public class RemoveDuplicatesUsingStringBuilder{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuilder sb=new StringBuilder();
boolean[] v=new boolean[256];
for(int i=0;i<s.length();i++){
char c=s.charAt(i);
if(!v[c]){v[c]=true;sb.append(c);}
}
System.out.println(sb);
}
}