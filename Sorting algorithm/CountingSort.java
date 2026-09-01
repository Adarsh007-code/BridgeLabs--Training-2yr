import java.util.Scanner;
public class CountingSort{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int[] c=new int[19];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
c[a[i]]++;
}
for(int i=10;i<=18;i++)
while(c[i]-->0) System.out.print(i+" ");
}
}