static import com.google.guava.*;
{}
public class Tacograph{

    private Table table;


    public void store (long time, int pos, int speed){
            table.put(time, pos, speed);
    }
}