package midtermpractice;
import java.util.*;
/**
 * @Date: 2/23/2023
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
        System.out.println("your grade is " + grade.getLetterGrade(grade) + "%");
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
    
    public char getLetterGrade(Grade g){
     
        if(g.grade > 90){
            return 'A';
        }else if(g.grade > 80){
            return 'B';
        }else if(g.grade > 70){
            return 'C';
        }else if(g.grade > 60){
            return 'D';
        }else{
            return 'F';
        }
    }

}
