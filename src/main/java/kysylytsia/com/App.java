package kysylytsia.com;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {


        Plants plants1 = new Plants(45, "RED", "ROSE" );
        Plants plants2 = new Plants(23, "GREEN", "CACTUS");
        Plants plants3 = new Plants(5, "WHITE", "LOTOS");
        Plants plants4 = new Plants(23, "BLUE", "VIOLA");
        Plants plants5 = new Plants(23, "YELLOW123", "TULIP123");

        Plants array[] = new Plants[5];

        array[0] = plants1;
        array[1] = plants2;
        array[2] = plants3;
        array[3] = plants4;
        array[4] = plants5;

        System.out.println("Color check");
        try {
            Controller.auditArrayColor(array);
        } catch (ColorException e) {
            System.err.print(e.getMessage());
        }

        System.out.println();
        System.out.println("Type check");
        try {
            Controller.auditArrayType(array);
        }catch (TypeException e) {
            System.err.print(e.getMessage());
        }


    }
}
