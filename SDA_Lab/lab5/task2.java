package lab5;

public class task2 {
    class Student {
        private String name;
        private int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        void displayStudent() {
            System.out.println("Student: " + name);
            System.out.println("Marks: " + marks);
        }
    }

    class StudentService {

        StudentDAO sd = new StudentDAO();
        EmailService e = new EmailService();

        void give_all(Student s) {
            s.displayStudent();
            sd.calculateGrade(s);
            sd.saveToDatabase(s);
            e.sendEmail(s);
        }
    }

    class StudentDAO {
        void calculateGrade(Student s) {
            System.out.println("Grade calculated for student: " + s.name);
        }

        void saveToDatabase(Student s) {
            System.out.println("Student " + s.name + " saved to database.");
        }
    }

    class EmailService {
        void sendEmail(Student s) {
            System.out.println("Result email sent to student: " + s.name);
        }
    }

    public void main(String[] argv) {

        StudentService s = new StudentService();
        Student ss = new Student("Ali", 5);

        s.give_all(ss);
    }
}