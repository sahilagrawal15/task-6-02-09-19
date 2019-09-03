import java.io.File;
import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of first file");
		String s1=scan.nextLine().trim();
		System.out.println("Enter the name of second file");
		String s2=scan.nextLine().trim();
		
		File f1=new File(s1);
		File f2=new File(s2);
		
		if(f1.exists()) {
			if(f1.isFile())
			{
				if(f2.exists())
				{
						boolean flag=f1.renameTo(f2);
						System.out.println(flag);
						System.out.println("Success");
					
					
				}
				else
					System.out.println("File2 does not exists");
			}
			else
			System.out.println("File1 is not a file");
			
		}
		else
		System.out.println("File1 does not exists");
		
		
		
		
		
		
		
		
		
	}

}
