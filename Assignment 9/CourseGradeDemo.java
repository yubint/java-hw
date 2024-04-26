/**
 * Class for Demo of CourseGrade
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment9: CourseGrades
 * Date: 26/04/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */

import java.util.Scanner;


public class CourseGradeDemo {

    /**
     * main function 
     * @param String[] as args
     * @return none
     * @throws Nothing is implemented
     */
    public static void main(String[] args) {
        // declaring variables
        GradedActivity lab;
        PassFailExam aPassFailExam;
        GradedActivity essay;
        FinalExam aFinalExam;
        CourseGrades course;

        // declaring score variables
        double labScore = 0, essayScore = 0;
        int finalScore = 0, passFailScore = 0;

        // creating a keyboard
        Scanner keyboard = new Scanner(System.in);

        // Creating CourseGrade object
        course = new CourseGrades();

        // Input lab score
        do {
           System.out.println("Enter the Lab Score (0-100): "); 
           labScore = keyboard.nextDouble();
        } while (labScore > 100 || labScore < 0);

        // Creating lab object and setting Lab score
        lab = new GradedActivity(labScore);
        course.setLab(lab);

        // Input PassFailExam Questions Solved
        do {
            System.out.println("Enter the Number of Questions Solved in Pass/Fail Exam (0-10): ");
            passFailScore = keyboard.nextInt();
        } while (passFailScore > 10 || passFailScore < 0);

        // Creating PassFailExam object and setting passfailexam score
        aPassFailExam = new PassFailExam(passFailScore);
        course.setPassFailExam(aPassFailExam);

        // Input Essay Score
        do {
           System.out.println("Enter the Essay Score (0-100): "); 
           essayScore = keyboard.nextDouble();
        } while (essayScore > 100 || essayScore < 0);

        // Create essay object and set essay score
        essay = new GradedActivity(essayScore);
        course.setEssay(essay);

        // Input Final Exam question solved
        do {
           System.out.println("Enter the Number of Questions Solved in Final Exam (0-50): "); 
           finalScore = keyboard.nextInt();
        } while (finalScore > 50 || finalScore < 0);

        // Creating Final Exam object and setting Final Exam score
        aFinalExam = new FinalExam(finalScore);
        course.setFinalExam(aFinalExam);

        // Displaying course
        System.out.println(course);
    }
    
}
