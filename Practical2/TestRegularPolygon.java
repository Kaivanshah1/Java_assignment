package Practical2;
public class TestRegularPolygon {
    public static void main(String[] args) {
        
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 12);
        RegularPolygon p3 = new RegularPolygon(25, 134, 7, 15);
        
        System.out.println("Polygon 1");
        p1.print();
        System.out.println("Polygon 2");
        p2.print();
        System.out.println("Polygon 3");
        p3.print();
        
    }
}
