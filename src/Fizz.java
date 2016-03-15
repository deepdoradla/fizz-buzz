import java.io.DataInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by deepdoradla on 04/03/2016.
 */
public class Fizz {


    public String checkFizzBuzz(int i)
    {
        String result = "";
        if(i%3 == 0 && i%5 != 0)
            result = "Fizz";
        else if(i%5 == 0 && i%3 != 0)
            result = "Buzz";
        else if(i%3 == 0 && i%5 ==0)
            result = "Fizz Buzz";

        System.out.print(result + ", ");
        return result;
    }


    public static void main(String args[]){
        int number = 0;
     //This program will print 100 fizz buzz numbers
        //Request for input
        Scanner scanner = new Scanner(System.in);
        DataInputStream inputStream = new DataInputStream(System.in);

        System.out.print("Enter the number of fizz numbers to be printed : ");

        try{

            number = scanner.nextInt();

        } catch (Exception e)
        {
            System.out.print("Oops exception here");

        }

        Fizz fizz = new Fizz();

        for(int i=1; i<=number; i++)
        {
            fizz.checkFizzBuzz(i);
        }
    }


}
