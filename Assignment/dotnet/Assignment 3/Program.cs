using shop;
using System;
class BannerTest
{
    public static double bannerPrice(Banner b, int copies)
    {
        double rate = copies < 5 ? 10 : 12;
        return rate * copies * b.GetArea();
    }

    public static void Main(string[] args)
    {

        // int height = int.Parse(args[0]);
        // int width = int.Parse(args[1]);

        Console.Write("Enter Height : ");
        double height = double.Parse(Console.ReadLine());

        Console.Write("Enter width : ");
        double width = double.Parse(Console.ReadLine());

        Banner b = new Banner(height, width);
        double area = b.GetArea();
        Console.WriteLine("Area of Simple Banner : " + area);

        Console.Write("Enter Radius Of Curved Banner : ");
        float radius = float.Parse(Console.ReadLine());

        CurvedBanner cb = new CurvedBanner(height, width, radius);

        Console.Write("Enter No of Copies Of Banner : ");
        int copies = Convert.ToInt32(Console.ReadLine());

        double price = bannerPrice(b, copies);
        Console.Write("Total Price Of Banner = " + price);
    }
}
