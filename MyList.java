/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MyList {
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    // Add a new student
    public void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        if (isDuplicateId(id)) {
            System.out.println("Student ID already exists.");
            return;
        }
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Student Year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Student Score: ");
       float score = Float.parseFloat(scanner.nextLine());

        students.add(new Student(id, name, score, address, year));
        System.out.println("Student added successfully!");
    }

    // Edit an existing student
    public void editStudent() {
        System.out.print("Enter Student ID to edit: ");
        String id = scanner.nextLine();

        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        student.setNameStudent(name);

        System.out.print("Enter new score: ");
        float score = Float.parseFloat(scanner.nextLine());
        student.setScoreStudent(score);

        System.out.println("Student updated successfully.");
    }

    // Delete a student
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();

        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Sort students by score
    public void sortStudents() {
        students.sort(Comparator.comparingDouble(Student::getScoreStudent).reversed());
        System.out.println("Students sorted by score.");
        displayStudents();
    }

    // Search for a student by ID
    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();

        Student student = findStudentById(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Helper methods
    private Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getIdStudent().equals(id)) {
                return student;
            }
        }
        return null;
    }

    private boolean isDuplicateId(String id) {
        return findStudentById(id) != null;
    }
}
