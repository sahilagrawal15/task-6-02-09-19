import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mode 1 For New Game, 2 For Resuming Previous One : ");
		int ch = sc.nextInt();
		System.out.println("Horizontal Move : ");
		int x = sc.nextInt();
		System.out.println("Vertical Move : ");
		int y = sc.nextInt();
		System.out.println("Diagonal Move : ");
		int z = sc.nextInt();
		//Game g = null;
	

		if (ch == 1) {
		//	g = new Game();
			transientz tz = new transientz();
			tz.moveH(x);
			tz.moveV(y);
			tz.moveD(z);
			tz.showPos();
			tz.showD();
			//tz = new transientz();
			FileOutputStream fos = new FileOutputStream("D:/gamedata.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(tz);
			oos.close();
			fos.close();
			System.out.println("Closing Game .............");
		} else {
			FileInputStream fis = new FileInputStream("D:/gamedata.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			//ObjectInputStream ois2 = new ObjectInputStream(fis);
			//g = (Game) ois.readObject();
			transientz tz = (transientz) ois.readObject();
			tz.moveH(x);
			tz.moveV(y);
			tz.moveD(z);
			tz.showPos();
			tz.showD();
			
		}

	//	g.moveH(x);
		//g.moveV(y);
		
		//g.showPos();
	

		System.out.println("Saving Game Instance ..................");

		

	}

}