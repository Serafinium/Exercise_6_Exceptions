package kysylytsia.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        int area = App.squareRectangle(App.readFromKeyboard(), App.readFromKeyboard());

        System.out.println("Area:  " + area);

    }


    public static int readFromKeyboard(){

        int x = 0;

        System.out.println("Input variable please: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            x = Integer.parseInt(br.readLine());

        } catch (Exception e) {
            System.out.println("Input integer please: ");
            return App.readFromKeyboard();
        }

        return  x;
    }


    public static int squareRectangle(int a, int b) throws ArithmeticException{

        if (a == 0 || b == 0){
            System.out.println("The lengths of the side of the rectangle cannot be zero.");
            System.out.println("Try again.");
            new ArithmeticException("Zero Variable");
        }
            return a*b;

    }
}
