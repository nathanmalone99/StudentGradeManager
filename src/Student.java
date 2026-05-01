public class Student {

     private String name;
     private double grade;

     public Student(String name, double grade) {
         this.name = name;
         this.grade = grade;
     }

     public String getName() {
         return name;
     }

     public double getGrade() {
        return grade;
    }

     public String getLetterGrade() {
         if (grade >= 90) {
             return "A";
         }
         else if (grade >= 75) {
             return "B";
         }
         else if (grade >= 60) {
             return "C";
         }
         else if (grade >= 40) {
             return "D";
         }
         else {
             return "F";
         }
    }

    @Override
    public String toString() {
         return name + " | Grade: " + grade + " | :" + getLetterGrade();
    }
}
