import java.io.*;import java.util.Scanner;
public class CountWordOccurrenceUsingFileReader{
public static void main(String[] args)throws Exception{
Scanner sc=new Scanner(System.in);
String word=sc.next();
BufferedReader br=new BufferedReader(new FileReader("input.txt"));
String line;int c=0;
while((line=br.readLine())!=null){
String[] w=line.split(" ");
for(String x:w) if(x.equals(word)) c++;
}
br.close();
System.out.println(c);
}
}