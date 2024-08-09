public class Main{
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.FirstName ="Avdhesh";
        p1.LastName = "Singh";
        p1.Age = 24;

        Person p2 = new Person();
        p2.FirstName ="Avi";
        p2.LastName = "Singh";
        p2.Age = 24;

        System.out.println(p1.FirstName + " " +p1.LastName);
        System.out.println(p1.Age);
        System.out.println(p2.FirstName + " " +p2.LastName);
        System.out.println(p2.Age);


    }
}
  class Person {
    String FirstName;
    String LastName;
    int Age;
  }