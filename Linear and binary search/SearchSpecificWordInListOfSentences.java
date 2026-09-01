import java.util.Scanner;
public class SearchSpecificWordInListOfSentences{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); sc.nextLine();
String[] s=new String[n];
for(int i=0;i<n;i++) s[i]=sc.nextLine();
String w=sc.nextLine();
String ans="Not Found";
for(String x:s) if(x.contains(w)){ans=x;break;}
System.out.println(ans);
}
}