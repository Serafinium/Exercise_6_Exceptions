package kysylytsia.com;

/**
 * Created by SERAFIM on 09.11.2017.
 */
enum Color {
    RED, GREEN, BLUE, WHITE, YELLOW
}

enum Type{
    ROSE, VIOLA, TULIP, LOTOS, CACTUS
}


public class Plants {
    int size;
    String  color;
    String type;


    public Plants(int size, String color, String type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Plants{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
