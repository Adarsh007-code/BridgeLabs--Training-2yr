import java.io.*;
public class ReadUserInputAndWriteToFile{
public static void main(String[] args)throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
FileWriter fw=new FileWriter("output.txt");
String s;
while(!(s=br.readLine()).equals("exit")) fw.write(s+"\n");
fw.close();
}
}