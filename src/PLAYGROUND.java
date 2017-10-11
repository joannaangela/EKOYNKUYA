

public class PLAYGROUND {

	public static void main(String[] args) {
		
		System.out.println("Say something!");
		String userString = IO.readString();
		System.out.println("What about a number?");
		int userInteger = IO.readInt();
		
		System.out.println("Adding '0.5' .....");
		
		double userIntegerValue = PlaygroundObj.PlusPoint5(userInteger);
		System.out.println(userIntegerValue);
		
		boolean GreaterThanFive = PlaygroundObj.IsGreaterThanFive(userIntegerValue);
		if (GreaterThanFive) {
			System.out.println(userString);
		}else {
		String LessThanFive = PlaygroundObj.WithAPeriodAtTheEnd(userString);
			System.out.println(LessThanFive);
		}
		
		
	}
}
