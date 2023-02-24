package midtermpractice;
import java.util.*;
/**
 *
 * @author Mostafa Hussain
 */
public class Midterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter your grade: ");
        //int grade = scan.nextInt();
        System.out.println("how much was the test out of?");
        double total = scan.nextDouble();
        System.out.println("how much did you get?");
        double mark = scan.nextDouble();
        Grade grade = new Grade(100,78);
        grade.setGrade(total, mark);
        System.out.println("your grade is " + grade.getGrade() + "%");
    }
}
    
class Grade{
    public double grade;
    Grade(){
        grade = 0;
    }
    Grade(double t, double m){
        this.grade = (m/t)*100;
    }

    public void setGrade(double t, double m) {
        this.grade = (m/t)*100;
    }

    public double getGrade() {
        return grade;
    }

}
