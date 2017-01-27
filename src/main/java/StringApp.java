import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

/**
 * Created by RyanHarper on 1/27/17.
 */
public class StringApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = "Hello beautiful world!";
        String reverseMessage = StringUtils.reverse("Hello beautiful world!");
        System.out.println(reverseMessage);


        System.out.println("Enter Something:");
        String userInput = scan.nextLine();
        System.out.println("You Entered: " + userInput);

        boolean inputIsNumeric = StringUtils.isNumeric(userInput);
        if (inputIsNumeric) {
            System.out.println(userInput + " is a number");
        } else {
            System.out.println(userInput + " is not a number");
        }

        String flippedString = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + flippedString);

        String reverseString = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverseString);

    }
}
