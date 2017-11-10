package kysylytsia.com;

/**
 * Created by SERAFIM on 09.11.2017.
 */
public class Controller {

    public static void auditArrayColor (Plants[] array) throws ColorException{
        for(int i=0; i<array.length; i++){

            try {
                Color.valueOf(array[i].color);
            } catch (IllegalArgumentException e){
                System.out.println("catch exention");
                throw new ColorException("Color not found");
            }
            System.out.println("Good! " + array[i]);
        }
    }


    public static void auditArrayType (Plants[] array) throws TypeException{
        for(int i=0; i<array.length; i++){

            try {
                Type.valueOf(array[i].type);
            } catch (IllegalArgumentException e){
                System.out.println("catch exention");
                throw new TypeException("Type not found");
            }
            System.out.println("Good! " + array[i]);
        }
    }

}
