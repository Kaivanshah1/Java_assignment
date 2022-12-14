package Practical2;

    public class RegularPolygon {
        private int n = 3;
        private double side = 1;
        private double x = 0;
        private double y = 0;
    
        RegularPolygon() {}
    
        RegularPolygon(int n, double side){
            this.n = n;
            this.side = side;
        }
    
        RegularPolygon(int n, double side, double x, double y){
            this(n, side);
            this.x = x;
            this.y = y;
        }
    
        public void setN(int n) {
            this.n = n;
        }
    
        public void setSide(double side) {
            this.side = side;
        }
    
        public void setX(double x) {
            this.x = x;
        }
    
        public void setY(double y) {
            this.y = y;
        }
    
        public int getN() {
            return n;
        }
    
        public double getSide() {
            return side;
        }
    
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
    
        public double getPerimeter(){
            return n*side;
        }
    
        public double getArea(){
            double area = (n*side*side)/(4*Math.tan(3.14/n));
            return area;
        }
        public void print() {
            System.out.println("No. of sides : " + n);
            System.out.println("Length of sides : " + side);
            System.out.println("Perimeter of Polygon : " + getPerimeter());
            System.out.println("Area of Polygon : " + getArea());
            System.out.println();
        }
    
    }
    