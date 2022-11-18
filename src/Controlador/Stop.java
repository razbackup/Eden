package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Vicente
 */
public abstract class Stop implements Runnable {
    public Stop(int millis) {
        Timer t = new Timer(millis, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Stop.this.run();
                } catch (Exception ex) {System.out.println( ex.getMessage());}
            }
        });t.setRepeats(false);
        t.start();
    }
}
