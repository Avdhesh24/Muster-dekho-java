class Rectangle {
    int length;
    int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int calculateArea() {
        return length * width;
    }
    int calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class ClassWithMethod {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 3);
        System.out.println("Area of rectangle: " + rect1.calculateArea());
        System.out.println("Perimeter of rectangle: " + rect1.calculatePerimeter());
    }
}
