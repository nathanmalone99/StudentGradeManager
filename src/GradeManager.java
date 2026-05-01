import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public double getClassAverage()  {
        double sum = 0;

        for (Student student : students) {
            sum += student.getGrade();
        }
        double gradeTotal = sum / students.size();
        return  gradeTotal;
    } //— returns a double

    public Student getHighestGrade() {
        Student studentHighest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() > studentHighest.getGrade()) {
                studentHighest = student;
            }
        }
        return studentHighest;
    } //— returns a Student

    public Student getLowestGrade() {
        Student studentLowest = students.get(0);
        for (Student student : students) {
            if (student.getGrade() < studentLowest.getGrade()) {
                studentLowest = student;
            }
        }
        return studentLowest;
    } //— returns a Student
}


