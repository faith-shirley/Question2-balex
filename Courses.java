/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author faith
 */
import java.util.Scanner;

public class Courses {
    String courseName;
    String courseID;
    int tuition;

    public Courses(String courseName, String courseID, int tuition) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.tuition = tuition;
    }

    public static void main(String[] args) {
        Courses[] courses = {
            new Courses("Software Engineering", "BSE", 900000),
            new Courses("Information Technology", "BIT", 750000),
            new Courses("Computer Science", "BCS", 800000),
            new Courses("Computer Engineering", "BCE", 950000)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CourseID:");
        String inputCourseID = scanner.nextLine();

        for (Courses course : courses) {
            if (course.courseID.equals(inputCourseID)) {
                System.out.println("Course Name: " + course.courseName);
                System.out.println("Course ID: " + course.courseID);
                System.out.println("Tuition: " + course.tuition);
                return;
            }
        }

        System.out.println("Wrong CourseID details");
    }
}
