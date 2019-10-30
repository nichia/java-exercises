package exercises.school;

import java.util.HashMap;

public class Course {
    private static final int classSize = 30;
    private static int nextCourseId = 1;
    private String name;
    private final int courseId;
    private int maxSize;
    private HashMap<Student, Double> students = new HashMap<>();

    public Course(String name, int courseId, int maxSize) {
        this.name = name;
        this.courseId = courseId;
        this.maxSize = maxSize;
    }

    public Course(String name, int courseId) {
        this(name, courseId, classSize);
        nextCourseId++;
    }

    public Course(String name) {
        this(name, nextCourseId, classSize);
        nextCourseId++;
    }

    public void setStudents(Student aStudent) {
        student.put(aStudent, 0);
    }

    public HashMap<Student, Double> getStudents() {
        return students;
    }

    public void setStudentGrade(Student aStudent, double grade) {
        student.put(aStudent, grade);
    }

    public Array<Student, Double> getStudentGrade(Student aStudent) {
        return students.getValue(aStudent);
    }
}
