
public class transientz extends Game{
	
private int zPos;
	
	
	public void moveD(int pts){
		zPos=zPos+pts;
	}
	
	public void showD() {
		System.out.println("Current Diagonal Position"+zPos);
	}

}
