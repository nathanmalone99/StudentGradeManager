import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;


        do {
            System.out.println("=== Student Grade Manager ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Class Average");
            System.out.println("4. View Highest Grade");
            System.out.println("5. View Lowest Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter grade: ");
                    try {
                        double grade = scanner.nextDouble();
                        if (grade < 0 || grade > 100) {
                            System.out.println("Grade must be between 0 and 100!");
                            break;
                        }
                        Student newStudent = new Student(name, grade);
                        manager.addStudent(newStudent);
                        System.out.println("Student added!");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid grade! Student not added.");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    manager.printAllStudents();
                    break;
                case 3:
                    System.out.printf("Class Average: %.2f%n", manager.getClassAverage());
                    break;
                case 4:
                    System.out.println("Highest: " + manager.getHighestGrade());
                    break;
                case 5:
                    System.out.println("Lowest: " + manager.getLowestGrade());
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            } scanner.close();
        } while (choice != 6);
    }
}
