import advertisment.Banner;
import java.util.Scanner;
class BannerTest
   {

		public static double bannerPrice(Banner B ,int copies)
	{
		
		double rate = copies < 5 ? 10 :12;
		return rate * copies * B.getArea();
	}


	public static void main(String[] args)
	{

		Scanner s= new Scanner(System.in);

		System.out.printf("Enter width of Banner= ");
		double w =s.nextDouble();
		System.out.printf("Enter hight of Banner= ");
		double h =s.nextDouble();
		
		Banner B = new Banner(w,h);
		System.out.printf("Area of Banner = %f%n", B.getArea());
		
		System.out.printf("Enter Radius of Cureved Banner= ");
		double r =s.nextDouble();
		
		var D	= new advertisment.CurvedBanner(w,h,r);
		
		System.out.printf("Area of Curved Banner = %f%n", D.getArea());
	
		System.out.printf("Enter No of Coppies Banner= ");
		int copies =s.nextInt();
	
		System.out.printf("Total Price = %f%n",bannerPrice(B , copies));
	}
}

