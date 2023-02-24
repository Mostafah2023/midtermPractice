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
        int total = scan.nextInt();
        System.out.println("how much did you get?");
        int mark = scan.nextInt();
        
        int grade = mark/total;
        System.out.println("your grade is " + grade + "%");
        
    }

}
