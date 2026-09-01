import java.util.Scanner;
public class SearchTargetValueIn2DSortedMatrix{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt(),c=sc.nextInt();
int[][] a=new int[r][c];
for(int i=0;i<r;i++) for(int j=0;j<c;j++) a[i][j]=sc.nextInt();
int t=sc.nextInt(),l=0,h=r*c-1;
while(l<=h){
int m=(l+h)/2,x=a[m/c][m%c];
if(x==t){System.out.println(true);return;}
if(x<t) l=m+1; else h=m-1;
}
System.out.println(false);
}
}