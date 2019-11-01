package exercises.school;

import java.util.HashMap;

public class Course {
    private static final int maxSize = 30;
    private static int nextCourseId = 1;
    private String name;
    private final int courseId;
    private int courseSize;
    private HashMap<Student, Double> students = new HashMap<>();

    public Course(String name, int courseId, int courseSize) {
        this.name = name;
        this.courseId = courseId;
        this.courseSize = courseSize;
    }

    public Course(String name, int courseId) {
        this(name, courseId, maxSize);
        nextCourseId++;
    }

    public Course(String name) {
        this(name, nextCourseId, maxSize);
        nextCourseId++;
    }

    public void setStudents(Student aStudent) {
        students.put(aStudent, 0.0);
    }

    public HashMap<Student, Double> getStudents() {
        return students;
    }

    public void setStudentGrade(Student aStudent, double grade) {
        students.put(aStudent, grade);
    }

//    public HashMap<Student, Double> getStudentGrade(Student aStudent) {
//        return students.getValue(aStudent);
//    }
}
