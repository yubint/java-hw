/**
 * Class for storing the scores of Lab activity, pass/fail exam, essay and final exam
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment9: CourseGrades
 * Date: 26/04/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */
public class CourseGrades {
    private GradedActivity[] grades;
    private final int NO_OF_TESTS = 4;
    
    /**
     * Constructor to set the array
     * @param None
     * @return none
     * @throws Nothing is implemented
     */
    public CourseGrades(){
        grades = new GradedActivity[NO_OF_TESTS];
    }

    /**
     * set the element 0 to the Lab (GradeActivity object)
     * @param GradeActivity as lab
     * @return none
     * @throws Nothing is implemented
     */
    public void setLab(GradedActivity lab){
        this.grades[0] = lab;
    }

    /**
     * set the element 1 to the PassFailExam Object
     * @param PassFailExam as aPassFailExam
     * @return none
     * @throws Nothing is implemented
     */
    public void setPassFailExam(PassFailExam aPassFailExam){
        this.grades[1] = aPassFailExam;
    }

    /**
     * set the element 2 to the Essay (GradeActivity object)
     * @param GradeActivity as essay
     * @return none
     * @throws Nothing is implemented
     */
    public void setEssay(GradedActivity essay){
        this.grades[2] = essay;
    }

    /**
     * set the element 3 to the FinalExam object
     * @param FinalExam as aFinalExam
     * @return none
     * @throws Nothing is implemented
     */
    public void setFinalExam(FinalExam aFinalExam){
        this.grades[3] = aFinalExam;
    }

    public String toString(){
        String string = "";

        // string for Test Name 
        String[] tests = new String[] {"Lab Activity", "Pass/Fail Exam", "Esssay", "Final Exam"};
        
        // setting the String
        for(int i= 0; i < grades.length; i++){

            // append the Test Name
            string += tests[i];

            // append the Scores
            string += String.format("\nScore: %s \nGrade: %s\n\n", grades[i].getScore(), grades[i].getGrade());

        }

        return string;
    }
}
