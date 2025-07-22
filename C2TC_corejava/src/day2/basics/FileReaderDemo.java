package day2.basics;
import java.io.*;
import java.net.*;
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		URL resource=FileReaderDemo.class.getResource("new.txt");
		if (resource==null) {
			System.err.println("File Not Found");
			return;
		}
		File file=new File(resource.getFile());
		FileReader fileReader=new FileReader(file);
		BufferedReader reader=new BufferedReader(fileReader);
		String line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
			}
}
