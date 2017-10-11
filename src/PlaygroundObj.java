
public class PlaygroundObj {
	
	public PlaygroundObj() {
		System.out.println("Playground obj initialized!");
	}
	
	public static void NOTHING() {
		System.out.println("Poland Spring!!!!");
	}
	
	public static void seagrams() {
		System.out.println("mug");
	}
	
	public static void ECHO(String WordX, String WordY) {
		System.out.println("HATE : " + WordY + WordX);
		
	}
	
	public static int SUM(int x, int y) {
		return x+y;
		
	}
	
	public static String WithAPeriodAtTheEnd(String str) {
		return str + ".";
	}
	
	public static boolean IsGreaterThanFive(double num) {
		if (num>5) {
			return true;
		}else {
			return false;
		}
	}
	
	public static double PlusPoint5(int num) {
		return num + 0.5;
		
	}
	
	
}
