package netbeans.healthyhearts;
import java.util.Scanner;
/**
 *
 * @author halfrikan
 */
public class HealthyHearts {

    public static void main(String[] args) {
        //goal is to ask user for their age, then output a suggested 
        //heart rate and target zone
        //maximum heart rate should be 220 minus user's age
        // target rate should be 50%-80%  of the max
        
        //initialize variables
        int age;
        int maxRate;
        double targetRate50;
        double targetRate80;
        
        //initialize scanner object and set it to recieve input from user
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please input your age: ");
        //Integer.parseInt is used to confirm that we are getting the correct
        //input from the user
        age = Integer.parseInt(inputReader.nextLine());
        
        //calculate the values needing the output
        maxRate = 220 - age;
        targetRate50 = 0.5 * maxRate;
        targetRate80 = 0.8 * maxRate;
        
        System.out.println("Thank you for your input.");
        System.out.println("Your age is: " + age);
        System.out.println("Your maximum heart rate is: " + maxRate);
        System.out.println("Your target rate is " + targetRate50 + " - " + targetRate80 + " beats per minute.");
        //caclulations can be done in the print statement, for ease of reading,
        //calcualtions were done seperately
        
    }
}
