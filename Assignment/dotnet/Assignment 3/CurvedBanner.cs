namespace shop
{
    class CurvedBanner : Banner
    {
        private float radius;

        public CurvedBanner(double h, double w, float r) : base(h, w)
        {
            radius = r;
        }

        public float Radius
        {
            get { return radius; }
            set { radius = value; }
        }

        public override double GetArea()
        {
            return base.Height * base.Width - 0.86f * radius * radius;
        }
    }

}

