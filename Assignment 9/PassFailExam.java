/**
 * Class for storing PassFailExam data that extends GradedActivity
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment9: CourseGrades
 * Date: 26/04/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */
public class PassFailExam extends GradedActivity{
    // setting no of questions
    final int NO_OF_QUESTION= 10;
    final int MINIMUM_PASSING_MARKS = 70;


    /**
     * Constructor to set the score based on number of questions solved
     * @param int as number of questions done
     * @return none
     * @throws Nothing is implemented
     */
    public PassFailExam(int que){
        super();

        // calculating score
        double score = 100.0 / NO_OF_QUESTION * que;

        // setting the score
        super.setScore(score);
    }

    /**
     * Override the getGrade method of GradedActivity class such that passing score is 70
     * @param none
     * @return char as Grade
     * @throws Nothing is implemented
     */
    @Override
    public char getGrade(){
        char grade;
        double score = getScore();

        // setting the grade with passing marks 70
        if(score >= MINIMUM_PASSING_MARKS){
            grade = 'P';
        }
        else{
            grade = 'F';
        }

        return grade;
    }
}
