package Gradebooks;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGradebook {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or Enter to finish: ");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }
        } while(!newStudent.equals(""));
    }
}
