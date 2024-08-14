class Employee {
    int salary;
    String name;

    public static void main(String[] args) {
        Employee Avdhesh = new Employee();
        Avdhesh.setName("Avdhesh singh") ;
        System.out.println(Avdhesh.getName());

        Avdhesh.salary= 30000 ;
        System.out.println( Avdhesh.getSalary());


    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
