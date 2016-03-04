import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by deepdoradla on 04/03/2016.
 */
public class Fizz {
    public static void main(String args[]){
        int number = 0;
     //This program will print 100 fizz buzz numbers
        //Request for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of fizz numbers to be printed : ");

        try{
            number = scanner.nextInt();
            Integer.valueOf(number);
        } catch (Exception e)
        {
            System.out.print("Oops exception here");
            e.getMessage();
        }


        for(int i=1; i<=number; i++)
        {
            if(i%3 == 0 && i%5 != 0)
            {
                System.out.print("Fizz, ");
            }else if(i%5 == 0 && i%3 != 0)
            {
                System.out.print("Buzz, ");
            }else if(i%3 == 0 && i%5 ==0)
            {
                System.out.print("Fizz Buzz, ");
            }else
                System.out.print(i+", ");
        }
    }
}
