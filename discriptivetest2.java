import java.util.Scanner;

class Student {
    String name;
    String rollNo; 
    Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Marks extends Student {
    int m1, m2, m3; 
    Marks(String name, String rollNo, int m1, int m2, int m3) {
        super(name, rollNo);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void displaySum() {
        int sum = m1 + m2 + m3; 
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String rollNo = sc.nextLine();

        System.out.print("Enter marks for subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int m2 = sc.nextInt();
        
        System.out.print("Enter marks for subject 3: ");
        int m3 = sc.nextInt();

    
        Marks studentMarks = new Marks(name, rollNo, m1, m2, m3);
        
        System.out.println("\n--- Result ---");
        studentMarks.displaySum();

        sc.close();
    }
}