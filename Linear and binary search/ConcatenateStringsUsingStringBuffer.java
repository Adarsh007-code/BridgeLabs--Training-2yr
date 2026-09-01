import java.util.Scanner;
public class ConcatenateStringsUsingStringBuffer{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); sc.nextLine();
StringBuffer sb=new StringBuffer();
for(int i=0;i<n;i++) sb.append(sc.nextLine());
System.out.println(sb);
}
}