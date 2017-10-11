public class LoopTest {
	private static int x;
	public static int y;

	public static void testMethod() {
		System.out.println("test method!");
	}
		public static void main(String [] args) {
			
			int n = IO.readInt();
			
			while (n<=0) {
				System.out.println("Enter positive Number");
				n = IO.readInt();
			}
			
			int sum = 0;
			
			for(int i=0; i<n; i++) {
				
				sum = sum+IO.readInt();
			}
			
			System.out.println(sum);
		}
}
