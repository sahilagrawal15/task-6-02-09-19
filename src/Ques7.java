import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class Ques7 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream input1 = new FileInputStream("d:/file2.txt");
		FileInputStream input2 = new FileInputStream("d:/file1.txt");
		

		SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

		int j;    
		   while((j=sequenceInputStream.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   sequenceInputStream.close();    
		   input1.close();    
		   input2.close();  
	}

}
