import java.io.*;
import java.util.Scanner;

public class Ques4 {

	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter file name ");
		String userfile=sc.next();
		File file = new File("D:/file1.txt");
		
		FileReader fr = new FileReader(file);
		
		System.out.println("please enter total number of new file  ");
		
		
		int ch, part , fcontain,odd=0;
		part=sc.nextInt();
		int j = 1;
		FileWriter fw = null;
		if((int) file.length() %part!=0)
		{
			odd=1;
		}
		fcontain = (int) file.length() / part;
		for (int i = 1; i <= part; i++) {
			File file1 = new File("D:/test.txt");
			fw = new FileWriter(file1);
			while (j < fcontain * i)// (ch=fr.read())!=-1)
			{
				fw.write(fr.read());
				j++;
			}
			if(odd==1&&i==part)
			{
				fw.write(fr.read());
			}
			else
			fw.close();
		}

		fr.close();

		fw.close();
	}
}