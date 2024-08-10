/*Problem Statemet:
Create a Java class called Student with the following details as
variables within it. (i) USN (ii) Name (iii) Branch (iv) Phone Write a
Java program to create n-Student objects and print the USN, Name,
Branch, and Phone of these objects with suitable headings.
*/

import java.util.Scanner;

public class Student {
    private String usn, name, branch, phone;

    public Student(String usn, String name, String branch, String phone) {
        super();
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student [USN = " + usn + ", NAME = " + name + ", BRANCH = "
                + branch + ", PHONE NUMBER = " + phone + "]";
    }

    public static void main(String args[]) {
        int i;
        String usn, branch, name, phone;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int n = s.nextInt();
        Student[] students = new Student[n + 1];
        for (i = 1; i <= n; i++) {
            System.out.println("Enter student " + i + " details\n");
            System.out.println("Give Student Details USN, Name, Branch, Phone Number");
            usn = s.next();
            name = s.next();
            branch = s.next();
            phone = s.next();
            students[i] = new Student(usn, name, branch, phone);
        }
        System.out.println("DATABASE:");
        for (i = 1; i <= n; i++) {
            System.out.println(students[i]);
        }
    }
}
