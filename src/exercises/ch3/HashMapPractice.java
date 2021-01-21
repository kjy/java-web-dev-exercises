package exercises.ch3;

import java.util.Scanner;

import java.util.HashMap;

import java.util.Map;

public class HashMapPractice {
    public static void main (String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudentId = input.nextInt();

            if (!newStudentId.equals(-1)) {
                System.out.print("Student Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentId, newStudentName);

            }

        } while(!newStudentId.equals(-1));

        // Print class roster
        System.out.println("\nClass roster:");
        //double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey()  + " " +  student.getValue());
            //sum += student.getValue();
        }

        //double avg = sum / students.size();
        //System.out.println("Average grade: " + avg);
    }
}
