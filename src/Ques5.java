import java.io.*;
import java.util.Scanner;

public class Ques5 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter folder name ");
		String userfile = sc.next();

		File file = new File("D:/" + userfile);
		if (file.isDirectory()) {
			File[] listoffile = file.listFiles();
			File mergefile = new File("D:/file1.txt");
			FileWriter mergewriter = new FileWriter(mergefile);
			int i;
			for (i = 0; i < listoffile.length; i++) {
				FileReader fr = new FileReader(listoffile[i]);
				int ch;
				while ((ch = fr.read()) != -1) {
					mergewriter.write(ch);
				}
				fr.close();
			}
			mergewriter.close();
		}

		else {
			System.out.println("is not a valid folder name");
		}

	}
}