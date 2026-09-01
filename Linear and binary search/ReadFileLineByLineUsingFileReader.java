import java.io.*;
public class ReadFileLineByLineUsingFileReader{
public static void main(String[] args)throws Exception{
BufferedReader br=new BufferedReader(new FileReader("input.txt"));
String line;
while((line=br.readLine())!=null) System.out.println(line);
br.close();
}
}