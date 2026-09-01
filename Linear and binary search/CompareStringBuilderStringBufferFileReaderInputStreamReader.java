import java.io.*;
public class CompareStringBuilderStringBufferFileReaderInputStreamReader{
public static void main(String[] args)throws Exception{
StringBuilder sb=new StringBuilder();
StringBuffer sf=new StringBuffer();
for(int i=0;i<100000;i++){sb.append("hello");sf.append("hello");}
BufferedReader br=new BufferedReader(new FileReader("input.txt"));
int words=0;String line;
while((line=br.readLine())!=null) words+=line.split(" ").length;
br.close();
System.out.println(words);
}
}