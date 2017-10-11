public class RecitationFour {

	public static void main(String [] args) {
		
		System.out.println("How old are you?");
		
		double age = IO.readDouble();
		
		if (age>=18) {
			
			System.out.println("You are able to vote!");
		}else {
			
			System.out.println("I'm sorry, you aren't able to vote.");
		}
		
	}
}
