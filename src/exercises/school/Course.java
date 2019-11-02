package exercises.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private static final int MAXSIZE = 30;
    private static int nextCourseId = 1;
    private String name;
    private final int courseId;
    private int courseSize;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name, int courseId, int courseSize) {
        this.name = name;
        this.courseId = courseId;
        this.courseSize = courseSize;
    }

    public Course(String name, int courseId) {
        this(name, courseId, MAXSIZE);
        nextCourseId++;
    }

    public Course(String name) {
        this(name, nextCourseId, MAXSIZE);
        nextCourseId++;
    }
    public void addStudent(Student student) {
        if (students.contains(student)) {
            return;
        }

        students.add(student);
    }

    public boolean removeStudent(Student student) {
        boolean removed = students.remove(student);
        return removed;
    }


    public String toString() {
        String courseStr = "=== Course: " + name + " ===\n";
        courseStr += "Course Id: " + courseId + " Class Size: " + courseSize + "\n";
        for (Student student : students) {
            courseStr += student + "\n";
        }
        return courseStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Course theCourse = (Course) o;
        return courseId == theCourse.courseId;
    }
}
