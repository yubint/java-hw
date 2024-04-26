/**
 * Class for storing GradeActivity of setting and getting the score
 * 
 * Class: Spring - COSC-1437-82703
 * Assignment9: CourseGrades
 * Date: 26/04/2024
 * 
 * @author Amir Jung Basnet
 * @version 1.0.0
 *
 */
public class GradedActivity {
    private double score;
    
    /**
     * No args constructor
     * @param None
     */
    public GradedActivity(){
        this.score = 0;
    }

    /**
     * Constructor to set the score
     * @param double as score
     * @return none
     * @throws Nothing is implemented
     */
    public GradedActivity(double score){
        // set score
        this.setScore(score);
    }

    /**
     * Method to set the score to the value provided 
     * @param score as double
     * @return none
     */
    protected void setScore(double score){

        this.score = score;
    }

    /**
     * Method to retrieve score
     * @param none
     * @return double
     */
    public double getScore(){

        return this.score;
    }

    /**
     * Method to get the Grade
     * @param None
     * @return char Grade
     */
    public char getGrade(){
        char grade;

        // checking for grade
        if(this.score >= 90){
            grade = 'A';
        }
        else if(this.score >= 80){
            grade = 'B';
        }
        else if(this.score >= 70){
            grade = 'C';
        }
        else if(this.score >= 60){
            grade = 'D';
        }
        else if(this.score >= 50){
            grade = 'E';
        }
        else{
            grade = 'F';
        }

        return grade;
    }

}
