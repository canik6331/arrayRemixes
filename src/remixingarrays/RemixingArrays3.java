
package remixingarrays;
import java.util.Scanner;

public class RemixingArrays3 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner (System.in);
        
        // stores several doubles as values of the marks array
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
        // declares total as 0 and initializes average
        double total=0;
        double average;
        
        System.out.println("These are the marks:");
        // prints each of the marks stored in the marks array 
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        // adds the value of each mark to the total
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        // calculates the average of the marks
        average = total/9;
        
        // rounds the average to the nearest tenth
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        // prints the average to the console
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
