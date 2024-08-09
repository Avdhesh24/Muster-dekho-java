 class Bike {
     String color;
     String model;
     int year;
     int maxSpeed;

     Bike(String model,String color,int year,int maxSpeed) {
         this.model = model;
         this.color = color;
         this.year = year;
         this.maxSpeed = maxSpeed;
     }

     void displayDetails() {
             System.out.println("Model:" + model);
             System.out.println("Color:" + color);
             System.out.println("Year:" + year);
             System.out.println("MaxSpeed:" +maxSpeed );
         }

   }
   public class ClassWithConstructor {
       public static void main(String[] args) {
           Bike bike1 = new Bike("Bmw", "Red", 2024, 200);
           Bike bike2 = new Bike("Pulser", "Black", 2024, 150);

           System.out.println("Bike 1 details");
           bike1.displayDetails();
           System.out.println("Bike 2 details");
           bike2.displayDetails();
       }
   }