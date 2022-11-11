namespace shop
{
    class Banner
    {
        private double height;
        private double width;

        public Banner(double h, double w)
        {
            height = h;
            width = w;
        }

        public Banner() //: this(10, 20)
        {
            height = 10;
            width = 20;
        }

        public double Height
        {
            get { return height; }
            set { height = value; }
        }

        public double Width
        {
            get { return width; }
            set { width = value; }
        }

        public virtual double GetArea()
        {
            return height * width;
        }
    }

}

