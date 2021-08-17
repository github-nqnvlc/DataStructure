import java.util.Scanner;

public class Hello {
	public static void PTb1(int a, int b) {
		double x;
		if (a == 0)
			if (b == 0)
				System.out.print("PT: " + a + "x +" + b + "= 0 co VSN");
			else
				System.out.print("PT: " + a + "x +" + b + "= 0  VN");
		else {
			x = (double) -b / a;
			System.out.print("PT: " + a + "x +" + b + "= 0 co 1 nghiem");
			System.out.print("\nx = " + x);

		}

	}

	public static void PTb2(int x, int y, int z) {
		if (x == 0)
			PTb1(y, z);
		else {

			double d = y * y - 4 * x * z;
			if (d < 0)
				System.out.print("PT: " + x + "x2 +" + y + "x +" + z + " = 0  VN");
			else if (d == 0) {
				double xx = -y / (2 * x);
				System.out.print("PT: " + x + "x2 +" + y + "x +" + z + " = 0  co 1 nghiem N");
				System.out.println("\nx1 = x2 = " + x);
			} else {
				double x1 = (-y - Math.sqrt(d)) / (2 * x);
				double x2 = (-y + Math.sqrt(d)) / (2 * x);
				System.out.print("PT: " + x + "x2 +" + y + "x +" + z + " = 0  co 2 nghiem N");
				System.out.printf("\nx1 = %.1f ", x1);
				System.out.printf("\nx2 =  %.1f", x2);

			}
		}
	}
	
	public static void TT(double r, int h)
	{
		double v = 3.14*r*r*h;
		System.out.printf("\nThe tich hinh tru tron");
		System.out.printf("\nxban kinh %.1f, chieu cao %d = %.1f", r,h,v);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap a:");
		int a = sc.nextInt();
		System.out.print("NHap b:");
		int b = sc.nextInt();
		PTb1(a, b);
		
		System.out.print("\nNhap a:");
		int x = sc.nextInt();
		System.out.print("NHap b:");
		int y = sc.nextInt();
		System.out.print("NHap c:");
		int z = sc.nextInt();
		PTb2(x, y, z);

		System.out.print("\nNhap r:");
		int r = sc.nextInt();
		System.out.print("NHap h:");
		int h = sc.nextInt();
		TT(r,h);
		
	}

}