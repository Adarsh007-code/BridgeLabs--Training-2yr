import java.util.Scanner;
class ArrayIndexOutOfBoundsExceptionDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] names=new String[n];
        for(int i=0;i<n;i++) names[i]=sc.next();
        try{
            System.out.println(names[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}