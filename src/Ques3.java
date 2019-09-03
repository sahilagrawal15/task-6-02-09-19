import java.io.*;
import java.util.Scanner;

public class Ques3 {
public static void main(String[]args) throws Exception
{
	File file=new File("D:/cities.txt");
	BufferedWriter bf=new BufferedWriter(new FileWriter("D:/cities.txt",true));
	Scanner sc= new Scanner(System.in);
	System.out.println("enter cities name");
	
	bf.write(sc.nextLine());
	
	System.out.println(file.length());
bf.close();

}
}