import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		String line=null;
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.println("Enter file name for deleting");
		File file=new File("D:/"+scan.next()+ ".txt");
		FileReader fis=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fis);
		 while((line = bufferedReader.readLine()) != null)
         {
             System.out.println("Contents of file are"+line);
         }
         
         
         bufferedReader.close();
         boolean b=file.delete();
         System.out.println(b);
         System.out.println("File Deleted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Success");
		
	}

}
