
public class RightTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter side 1");
		double x = IO.readDouble();
		
		System.out.println("Enter side 2");
		double y = IO.readDouble();
		
		System.out.println("Enter side 3");
		double z = IO.readDouble();
		
		if( x<=0 || y<=0 || z<=0 || z>= x+y || y>= x+z || x>= y+z) {
			
			System.out.println("Error, not a triangle.");
			return;
		}
		
		if (x>y &&x>z) {
			//x is the potential hyp.
			
			if (x*x == y*y + z*z) {
			// it is a right triangle AND x is the hyp.
				System.out.println("Firt side is hyp. of Right Triangle");
			} else {
				System.out.println("Not a right triangle!!!! :((");
			}
		} else if (y>x && y>z) {
			if (y*y == x*x + z*z) {
				// it is a right triangle AND x is the hyp.
					System.out.println("Second side is hyp. of Right Triangle");
				} else {
					System.out.println("Not a right triangle!!!! :((");
				}
		} else {
			//either z is the biggest, or all the same size or, 2 are te same size.
			if (Math.abs(z*z - (x*x + y*y)) < 0.000000000001) {
				System.out.println("Third side is the hyp. of Right Triangle");
			}else {
				System.out.println("Not a right Triangle!!!! :(((");
			}
		}
	}
}
