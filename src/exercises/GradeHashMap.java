package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class GradeHashMap {
    public static void main(String[] args) {
        HashMap<UUID, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;
        UUID uniqueID;

        // Get student names and assign an integer id
        do {
            System.out.println("Enter your students (or ENTER to finish):");
            newStudent = in.nextLine();
            if (!newStudent.equals("")) {
                uniqueID = UUID.randomUUID();
                students.put(uniqueID, newStudent);
            }
        } while (!newStudent.equals(""));

        // Print students and unique ID
        System.out.println("\nStudents and uniqueID:");
        for (Map.Entry<UUID, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
