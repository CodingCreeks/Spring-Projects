
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cal1=calculateHighScorePosition(1000);
		displayHighScorePoisiton("a", cal1);
		
		int cal2=calculateHighScorePosition(500);
		displayHighScorePoisiton("b", cal2);
		
		int cal3=calculateHighScorePosition(100);
		displayHighScorePoisiton("c", cal3);
		
		int cal4=calculateHighScorePosition(10);
		displayHighScorePoisiton("d", cal4);
	}
	
	public static void displayHighScorePoisiton(String playername, int highScore){
		System.out.println(playername+" Managed to the position "+highScore+" on the High Score table");
	}
	
	public static int calculateHighScorePosition(int score){
		if(score>=1000)
			return 1;
		if(score>=500 && score<1000)
			return 2;
		if(score>=100 && score<500)
			return 3;
		else
		return 4;
	}
}
