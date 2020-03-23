/*
 * cam nikolasevic
 * 03/23/20
 * this program prompts the user to enter in the names of 5 friends and then
 * outputs the names of the 2nd. 3rd, and 4th to the console
*/
package remixingarrays;
import java.util.Scanner;
public class RemixingArrays2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        // array called friends that holds 5 strings
        String [ ] friends = new String [5];
        
        // loop repeats user input to store friend names 5 times
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyboard.nextLine();
        }
        
        // outputs the 2nd, 3rd, and 4th indices of the friends array
        System.out.println("The second, third, and fourth names listed were:");
        System.out.println("Second: " + friends[1] + "\nThird: " + friends[2] +
                            "\nFourth: " + friends[3]); 
    }
}
