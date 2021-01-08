import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);
    }
}
