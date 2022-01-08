import java.util.Scanner;

/**
 * Name: Jeffano John
 * Date: Saturday Nov. 13th 2021
 * Student #: 251230759
 * Description: Uses for-loop to output the numbers from this interval, but if the number is
 * divisible by 3, the program should output Fizz instead of number, if the number is divisible by 5, it
 * will output Buzz, and if it is divisible both by 3 and by 5, it will output FizzBuzz
 */

public class FizzBuzz {
    public static void main(String[] args) {

        //Initializing a scanner class
        Scanner scanner = new Scanner(System.in);

        //Asking the user to enter two values and read the two values
        System.out.println("Enter two values.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //Uses the for loop to go through A and B Values
        for (int i = a; i <= b; i++){
            //Checks if the value is divisible by both 3 and 5 and prints FizzBuzz
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }
            //Checks if the value is divisible by 5 and prints Buzz
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            //Checks if the value is divisible by 3 and prints Fizz
            else if ((i % 3 == 0)){
                System.out.println("Fizz");
            }
            //If none of the other cases work, then it prints the actual value
            else {
                System.out.println(i);
            }
        }
    }
}
