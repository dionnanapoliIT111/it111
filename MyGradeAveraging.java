import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MyGradeAveraging {

    public static void main(String[] args) {

        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        while (counter <= 5) {

            System.out.println("Please enter your " + counter + " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } //close loop

        String message;
        char letterGrade;

        counter -= 1;

        average = total / counter;

        System.out.println("You have earned an average grade of " + average + " after providing us with 5 grades");

        if (average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid work!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying necessary";
        } else if (average >= 60 && average < 70) {
            letterGrade = 'D';
            message = "Squeaking by!";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade";

        }

        System.out.println("You have earned the following grade of " +letterGrade+ ", and here is the message: " +message);

    }

}





