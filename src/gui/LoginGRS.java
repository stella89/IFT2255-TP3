import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class LoginGRS extends JFrame {

    public LoginGRS() {

        setTitle("Login: Gestion de Requêtes de Support (GRS)");

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("Fichier");
        file.setMnemonic(KeyEvent.VK_F);

        JMenu help = new JMenu("Aide");
        
        JMenuItem quitter = new JMenuItem("Quitter");
        quitter.setMnemonic(KeyEvent.VK_Q);
        quitter.setToolTipText("Quitter l'application");
        quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 
            ActionEvent.CTRL_MASK));
        
        JMenuItem apropos = new JMenuItem("À propos...");
        
        help.add(apropos);

        quitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);   
            }
        });
        
        apropos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AboutDialog ad = new AboutDialog();
                ad.setVisible(true);
            }

        });

//        file.add(dbOpen);
//        file.addSeparator();
        file.add(quitter);

        menuBar.add(file);
        menuBar.add(help);

        setJMenuBar(menuBar);

        setSize(720, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new LoginGRS();
    }
}
