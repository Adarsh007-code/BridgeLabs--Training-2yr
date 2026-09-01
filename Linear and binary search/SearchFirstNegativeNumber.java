import java.util.Scanner;
public class SearchFirstNegativeNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),ans=-1;int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=sc.nextInt();
for(int i=0;i<n;i++) if(a[i]<0){ans=i;break;}
System.out.println(ans);
}
}