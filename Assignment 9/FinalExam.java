/**
 * Class for storing Final Exam data that extends GradedActivity
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment9: CourseGrades
 * Date: 26/04/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */
public class FinalExam extends GradedActivity{
    final private int NO_OF_QUESTION = 50;

    /**
     * Constructor to set the score based on number of questions solved
     * @param int as number of questions done
     * @return none
     * @throws Nothing is implemented
     */
    public FinalExam(int que){
        // intiate super class
        super();

        // calculate score
        double score = 100/NO_OF_QUESTION * que;

        // set the score
        super.setScore(score);
    }
}
