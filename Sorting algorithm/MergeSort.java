import java.util.Scanner;
public class MergeSort{
public static void sort(int[] a,int l,int r){
if(l<r){
int m=(l+r)/2;
sort(a,l,m);
sort(a,m+1,r);
int[] t=new int[r-l+1];
int i=l,j=m+1,k=0;
while(i<=m&&j<=r){
if(a[i]<=a[j]) t[k++]=a[i++];
else t[k++]=a[j++];
}
while(i<=m) t[k++]=a[i++];
while(j<=r) t[k++]=a[j++];
for(i=l,k=0;i<=r;i++,k++) a[i]=t[k];
}}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=sc.nextInt();
sort(a,0,n-1);
for(int i=0;i<n;i++) System.out.print(a[i]+" ");
}
}