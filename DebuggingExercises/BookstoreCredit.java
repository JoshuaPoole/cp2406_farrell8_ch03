import java.util.Scanner;

/**
 * Created by jc313836 on 16/08/16.
 */
public class BookstoreCredit
{
    public static void main(String args[])
    {
        String studentName = "John Smith";
        double gradeAverage = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name");
        studentName = input.nextLine();
        System.out.print("Enter grade point average ");
        gradeAverage = input.nextDouble();
        outputMessage(studentName, gradeAverage);
    }
    public static void outputMessage(String studentName, double gradeAverage)
    {
        System.out.println(studentName + " - Bookstore credit = " + (gradeAverage * 10));
    }
}


