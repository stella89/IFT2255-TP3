import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Splash extends JFrame {

    public Splash() {

        setSize(300, 200);
        setTitle("Splash screen TP3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
		size.height/2 - getHeight()/2);
    }

    public static void main(String[] args) {

        Splash cos = new Splash();
        cos.setVisible(true);

    }
}
