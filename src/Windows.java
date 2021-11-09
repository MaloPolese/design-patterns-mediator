
import java.awt.Dimension;

import javax.swing.JFrame;

import invoker.Pane;

public class Windows extends JFrame {

    public Windows(int width, int height) {
        this.setSize(new Dimension(width, height));
        this.setContentPane(new Pane());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
