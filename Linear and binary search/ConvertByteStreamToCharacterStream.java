import java.io.*;
public class ConvertByteStreamToCharacterStream{
public static void main(String[] args)throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
String line;
while((line=br.readLine())!=null) System.out.println(line);
br.close();
}
}