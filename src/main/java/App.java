/**
 * Created by SERAFIM on 09.11.2017.
 */
public class App {
    public static void main(String[] args){
        
        double res = 0.0;

        try {
            res = App.div(1.7, 2.3);

            System.out.printf("%.2f", res); //Output from rounding to larger

        } catch (ArithmeticException e){
            System.err.println( e.getMessage() );

        }


    }

    public static double div(double a, double b) throws ArithmeticException{

        if (a == 0.0 | b == 0.0){
            throw new ArithmeticException("division by zero");
        }

        double res;

        res = a / b;

       return res;
    }




}
