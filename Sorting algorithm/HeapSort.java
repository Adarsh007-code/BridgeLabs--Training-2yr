import java.util.Scanner;
public class HeapSort{
public static void heapify(int[] a,int n,int i){
int largest=i,l=2*i+1,r=2*i+2;
if(l<n&&a[l]>a[largest]) largest=l;
if(r<n&&a[r]>a[largest]) largest=r;
if(largest!=i){
int t=a[i]; a[i]=a[largest]; a[largest]=t;
heapify(a,n,largest);
}}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=sc.nextInt();
for(int i=n/2-1;i>=0;i--) heapify(a,n,i);
for(int i=n-1;i>0;i--){
int t=a[0]; a[0]=a[i]; a[i]=t;
heapify(a,i,0);
}
for(int i=0;i<n;i++) System.out.print(a[i]+" ");
}
}