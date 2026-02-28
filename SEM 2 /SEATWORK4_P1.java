public class  SEATWORK4_P1 {
    public int calculateArea(int side) {
        return side * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    
    public static void main(String[] args) {
         Seatwork4a calc = new Seatwork4a ();

        int squareArea = calc.calculateArea(5);
        double rectangleArea = calc.calculateArea(4.0, 6.0);

        System.out.println("Square area: " + squareArea);
        System.out.println("Rectangle area: " + rectangleArea); 
    }
}
