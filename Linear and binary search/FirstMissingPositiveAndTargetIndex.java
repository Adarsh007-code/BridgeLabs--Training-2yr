import java.util.*;
public class FirstMissingPositiveAndTargetIndex{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=sc.nextInt();
int target=sc.nextInt();
boolean[] v=new boolean[n+2];
for(int x:a) if(x>0&&x<=n+1) v[x]=true;
int miss=1; while(v[miss]) miss++;
Arrays.sort(a);
int l=0,h=n-1,ans=-1;
while(l<=h){
int m=(l+h)/2;
if(a[m]==target){ans=m;break;}
if(a[m]<target) l=m+1; else h=m-1;
}
System.out.println(miss);
System.out.println(ans);
}
}