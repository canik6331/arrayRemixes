/*
 * cam nikolasevic
 * 03/23/20
 * this program prompts the user to enter in 20 integers, then adds them
 * together and outputs the sum to the console
 */
package remixingarrays;
import java.util.Scanner;


public class RemixingArrays {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        // stores 20 elements in the array
        int [ ] numbers = new int [20];
        int total = 0;
        
        System.out.println("Enter twenty integers and they will be added together:");
        // stores a user input value for 20 loop repetitions starting with index
        // position at "i"
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyboard.nextInt();
        }
        
        // adds each element of the array for 20 loop repetitions starting with
        // index at point "i"
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        // outputs the sum of all the input numbers to the console
        System.out.println("The sum of those numbers is:\n" + total);
    }
    
}
