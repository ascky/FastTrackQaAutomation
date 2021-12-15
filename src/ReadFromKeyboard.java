import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int getInt(){
        int x = 0;
        boolean condition = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a new integer! ");
                x = scan.nextInt();
                condition = true;
            } catch (InputMismatchException e) {
                System.err.println("Incorrect value entered.");
            }
        } while (!condition);
        return x;
    }
}
