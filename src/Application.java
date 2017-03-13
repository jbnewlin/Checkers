import javax.swing.*;
import java.awt.*;

/**
 * Created by jnew23 on 3/13/17.
 */
public class Application extends JFrame {

    public Application() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }
        });
    }

    private void initUI() {
        add(new Board());

        setSize(250, 250);

        setTitle("Checkers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
