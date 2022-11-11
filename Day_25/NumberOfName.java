package Day_25;
import java.util.Scanner;

public class NumberOfName {
    public static void numOfCharacters(){
        Scanner input = new Scanner(System.in);

        System.out.print("Firstname : ");
        String firstName = input.nextLine();

        System.out.print("Lastname  : ");
        String lastName = input.nextLine();

        int numOfCharacters = firstName.length() + lastName.length();

        System.out.println("Number Of Characters = " + numOfCharacters);
    }
    public static void main(String[] args) {
        numOfCharacters();
    }

}