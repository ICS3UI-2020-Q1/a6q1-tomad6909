import java.util.Scanner;
/**
 * This program asks the user how many heights they want to enter in cm, the average of those heights will be determined and then all heights above average will be outputed to the console
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how many heights they would like to enter
    System.out.println("How many heights would you like to enter");
    int numHeights = input.nextInt();

    // create an array
    int[] heights = new int[numHeights];

    // ask the user to enter heights on seperate lines
    System.out.println("Please enter the heights on separate lines");
    for(int i = 0; i < numHeights; i++){
      heights[i] = input.nextInt();
    }
    // create a variable to store the sum
    int sum = 0;

    // create a for loop to add to the sum
    for(int i = 0; i < heights.length; i++){
      sum = sum + heights[i];
    }

    // determine the average
    int average = sum / numHeights;

    // let the user know the average
    System.out.println("The average height is " + average + " cm");

    // tell the user the heights above average
    System.out.println("The heights above average are");

    // create for to determine which heights are above average
    for(int i = 0; i < heights.length; i++){
      if(heights[i] > average){
        System.out.println(heights[i]);
      } else{
        
      }
    
    }
    

    


    


    
  }
}
