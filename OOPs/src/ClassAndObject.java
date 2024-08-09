class Car{
    String color;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Model: " +model);
        System.out.println("Color:" +color);
        System.out.println("Year:" +year);
    }

}
public class ClassAndObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "BMW";
        car1.year = 2024;

        Car car2 = new Car();
        car2.color = "Black";
        car2.model = "Thar";
        car2.year = 2023;

        System.out.println("Car 1 details: ");
        car1.displayDetails();

        System.out.println("car 2 details: ");
        car2.displayDetails();
    }

}
