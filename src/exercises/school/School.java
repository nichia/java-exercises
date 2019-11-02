package exercises.school;

public class School {
    public static void main(String[] args) {
        // add Students
        Student janeSmith = new Student("Jane Smith");
        Student jackJohnson = new Student("Jack Johnson");
        Student abbyScott = new Student("Abby Scott");
        Student benL = new Student("Ben L.");

        benL.setName("Ben Lawson");

        // add student's grade
        janeSmith.addGrade(25, 18.9);
        jackJohnson.addGrade(25, 18.0);
        jackJohnson.addGrade(25, 15.0);
        jackJohnson.addGrade(25, 15.0);
        jackJohnson.addGrade(25, 15.0);
        abbyScott.addGrade(25, 13.0);
        abbyScott.addGrade(25, 23.0);
        benL.addGrade(25, 19.0);
        benL.addGrade(25, 15.0);
        benL.addGrade(25, 20.0);

        // add Course
        Course worldHistory = new Course("World History");

        // add course students
        worldHistory.addStudent(janeSmith);
        worldHistory.addStudent(jackJohnson);
        worldHistory.addStudent(abbyScott);
        worldHistory.addStudent(benL);

        // remove course students
        worldHistory.removeStudent(janeSmith);

        // print Student
        System.out.println(janeSmith);
        System.out.println(jackJohnson);
        System.out.println(abbyScott);
        System.out.println(benL);

        // print Course
        System.out.println(worldHistory);
    }
}
