import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ques2 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("D:/file3.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("D:/file4.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { 
				fw.write(s); 
				fw.flush();
			}
			br.close();
			fw.close();
                        
			System.out.println("file copied");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

}}
