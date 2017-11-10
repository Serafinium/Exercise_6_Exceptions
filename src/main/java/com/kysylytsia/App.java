package com.kysylytsia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        System.out.println("Please input int variable: ");

        for(int i=0; i<10; i++) {
            System.out.print(i+1 + " Next: ");

            try {
                App.readnumber(1, 100);
            } catch (NumberFormatException e) {
                System.out.println("This is String variable. Please input int");
                break;

            } catch (Exception e) {
                System.out.println("This variable isn't within the specified range");
                break;
            }
        }

    }



    public static int readnumber(int start, int end) throws NumberFormatException, Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x;

        try {
           x = Integer.parseInt( br.readLine() );
        } catch (IOException e) {
            throw new NumberFormatException("notIntegerVariableExeption");

        }

        if(x < start | x > end){
            throw new Exception(" notValidRangeOfNumbersExeption");
        }

        return x;

    }
}
