import java.util.Scanner;

/**
 * Created by jc313836 on 16/08/16.
 */
public class Insurance {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year of birth");
        int birthYear = input.nextInt();
        System.out.print("Enter current year ");
        int currentYear = input.nextInt();
        outputMessage(birthYear, currentYear);
    }
    public static void outputMessage(int birthYear, int currentYear)
    {
        System.out.println(" Your current Insurance is = " + ((Math.floor((currentYear - birthYear)/10)+15)) * 20);
    }
}
