import java.io.PrintWriter;

public class Ques3b {

	public static void main(String[] args) throws Exception{
		
		PrintWriter pw2=new PrintWriter("d:/IOtxtfiles/test3.txt");
		pw2.append(pw1,0,10);
		pw2.print("Pune");
		pw2.print("Indore");
		pw2.print("Bhopal");
		pw2.print("Nainital");
		
		pw2.close();
	}

}
