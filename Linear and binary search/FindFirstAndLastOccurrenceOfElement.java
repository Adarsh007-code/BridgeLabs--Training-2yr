import java.util.Scanner;
public class FindFirstAndLastOccurrenceOfElement{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=sc.nextInt();
int t=sc.nextInt(),f=-1,l=-1;
for(int i=0;i<n;i++) if(a[i]==t){f=i;break;}
for(int i=n-1;i>=0;i--) if(a[i]==t){l=i;break;}
System.out.println(f+" "+l);
}
}