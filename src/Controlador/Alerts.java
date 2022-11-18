package Controlador;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Vicente, Jeremy.
 */
public class Alerts extends JPanel {

    String msg;

    public Alerts(String msg) {
        this.msg = msg;
    }

    public Alerts() {
    }
    

    public void green(JPanel alert, JLabel text) {
        alert.setVisible(false);
        alert.setVisible(true);
        alert.setBackground(new Color(2, 126, 22));
        text.setText(msg);
    }

    public void red(JPanel alert, JLabel text) {
        alert.setVisible(false);
        alert.setVisible(true);
        alert.setBackground(new Color(126, 2, 2));
        text.setText(msg);
    }

    public void yellow(JPanel alert, JLabel text) {
        alert.setVisible(false);
        alert.setVisible(true);
        alert.setBackground(new Color(255, 166, 0));
        text.setText(msg);
    }

    public void offAlert(JPanel alert, JLabel text) {
        alert.setVisible(false);
    }

}
