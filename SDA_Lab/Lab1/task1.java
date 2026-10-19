package Lab1;

import java.util.*;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        float semester;
        double cgpa;

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter semester: ");
        semester = sc.nextFloat();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}
