public class RecitationFourEx1B {

	public static void main(String [] args) {
		
		System.out.println("You were caught speeding, how fast were you going?");
		
		double speed = IO.readDouble();
		
		if (speed<=60) {
			
			System.out.println("You weren't going fast at all, you're good.");
		}
		else if (speed<=75) 
		{	
			System.out.println("Your fine is $100");
		}
		else if (speed<=90)
		{
			System.out.println("Your fine is $200");
		}
		else if(speed > 90)
		{
			System.out.println("Your fine is $500");
		}
	}
	
	
}
