public class CompareStringBufferAndStringBuilder{
public static void main(String[] args){
long s=System.nanoTime();
StringBuilder a=new StringBuilder();
for(int i=0;i<100000;i++) a.append("hello");
long m=System.nanoTime();
StringBuffer b=new StringBuffer();
for(int i=0;i<100000;i++) b.append("hello");
long e=System.nanoTime();
System.out.println("StringBuilder: "+(m-s));
System.out.println("StringBuffer: "+(e-m));
}
}