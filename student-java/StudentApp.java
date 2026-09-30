import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      STUDENT MANAGEMENT");
        System.out.println("================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n---------- STUDENT DETAILS ----------");

        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Marks        : " + marks);

        if (marks >= 90) {
            System.out.println("Grade        : A+");
        } else if (marks >= 80) {
            System.out.println("Grade        : A");
        } else if (marks >= 70) {
            System.out.println("Grade        : B");
        } else if (marks >= 60) {
            System.out.println("Grade        : C");
        } else if (marks >= 50) {
            System.out.println("Grade        : D");
        } else {
            System.out.println("Grade        : Fail");
        }

        System.out.println("-------------------------------------");
        System.out.println("Application completed successfully!");

        sc.close();
    }
}