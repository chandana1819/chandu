public class Area {
    void area(int l, int b) {
        System.out.println("Area of Rectangle = " + (l * b));
    }
    void area(double base, double height) {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
    public static void main(String[] args) {
        Area a = new Area();
        a.area(5, 4);       
        a.area(6.0, 3.0);    
    }
}

