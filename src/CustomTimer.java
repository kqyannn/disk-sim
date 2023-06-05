import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CustomTimer extends Timer{
    public int count;

    public CustomTimer(int delay, ActionListener listener){
        super(delay, listener);
    }

    public void setCount(int cnt){
        count = cnt;
    }

    public int getCount() {
        return count;
    }
}