class Student {
    int Rollno;
    String name;
    int marks;
}

public class EnhanceForLoop {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.Rollno = 1;
        s1.name = "Avdhesh";
        s1.marks = 90;

        Student s2 = new Student();
        s2.Rollno = 2;
        s2.name = "Tanmay";
        s2.marks = 91;

        Student s3 = new Student();
        s3.Rollno = 3;
        s3.name = "Akash";
        s3.marks = 89;

        Student s4 = new Student();
        s4.Rollno = 4;
        s4.name = "Khilesh";
        s4.marks = 79;

        Student s5 = new Student();
        s5.Rollno = 5;
        s5.name = "Sagar";
        s5.marks = 80;

        Student students[] = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}
