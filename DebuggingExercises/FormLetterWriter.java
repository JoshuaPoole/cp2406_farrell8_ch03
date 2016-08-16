import java.util.Scanner;

/**
 * Created by jc313836 on 16/08/16.
 */
public class FormLetterWriter {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fName = input.nextLine();
        System.out.print("Enter Last name: ");
        String lName = input.nextLine();

        if(fName.length() < 2) {
            displaySalutation(lName);
        }
        else {
            displaySalutation(fName, lName);
        }
    }

    public static void displaySalutation(String lname)
    {
        System.out.println("Dear Mr. or Ms. " + lname);
        System.out.println("Thank you for your recent order");
    }

    public static void displaySalutation(String fname, String lname)
    {

        System.out.println("Dear " + fname +" "+ lname);
        System.out.println("Thank you for your recent order");
    }
}
