package exercises.school;

public class Student {
    private static final int CREDITS_PER_GRADE = 20;

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0.0);
    }

    public Student(String name) {
        this(name, nextStudentId, 0, 0);
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void addGrade(int courseCredits, double grade) {
        double currQualityScore = gpa * numberOfCredits;
        double totalQualityScore = currQualityScore + (courseCredits * grade);

        numberOfCredits += courseCredits;
        gpa = (totalQualityScore / numberOfCredits);
    }

    public String getGradeLevel() {
        if (numberOfCredits >= 90) {
            return "senior";
        } else if (numberOfCredits >= 60) {
            return "junior";
        } else if (numberOfCredits >= 30) {
            return "sophomore";
        } else {
            return "freshman";
        }
    }

    public String toString() {
        String studentStr = studentId + " " + name + " Grade: " + getGradeLevel() + " Number of Credits: " + numberOfCredits + " gpa: " + gpa ;

        return studentStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student theStudent = (Student) o;
        return studentId == theStudent.studentId;
    }

}

