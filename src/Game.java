import java.io.Serializable;


public class Game implements Serializable {
	private int xPos;
	private int yPos;
	
	
	public void moveH(int pts){
		xPos=xPos+pts;
	}
	public void moveV(int pts){
		yPos=yPos+pts;
	}
	public void showPos(){
		System.out.println("CURRENT POS : "+xPos+","+yPos);
	}
	
	
}