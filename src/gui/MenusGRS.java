import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class MenusGRS extends JFrame {

    public MenusGRS() {

        setTitle("Gestion de Requêtes de Support (GRS)");

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("Fichier");
        file.setMnemonic(KeyEvent.VK_F);

        JMenu rqt = new JMenu("Requête");
        rqt.setMnemonic(KeyEvent.VK_R);
        
        JMenu search = new JMenu("Recherche");
        rqt.setMnemonic(KeyEvent.VK_C);

        JMenu report = new JMenu("Rapport");

        JMenu account = new JMenu("Comptes");

        JMenu help = new JMenu("Aide");

        JMenuItem newrqt = new JMenuItem("Nouvelle...");
        JMenuItem mod = new JMenuItem("Modifier...");
        JMenuItem finalize = new JMenuItem("Finaliser...");
        
        JMenuItem notAssigned = new JMenuItem("Non assignées...");
        JMenuItem byMember = new JMenuItem("Par membre...");
        JMenuItem byRef = new JMenuItem("Par référence...");

        JMenuItem report1 = new JMenuItem("Rapport 1...");
        JMenuItem report2 = new JMenuItem("Rapport 2...");

        search.add(notAssigned);
        search.add(byMember);
        search.add(byRef);

        report.add(report1);
        report.add(report2);

        rqt.add(newrqt);
        rqt.addSeparator();
        rqt.add(search);
        rqt.add(mod);
        rqt.add(report);
        rqt.addSeparator();
        rqt.add(finalize);

        JMenuItem dbOpen = new JMenuItem("Ouvrir base de données...");
        dbOpen.setMnemonic(KeyEvent.VK_O);  

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

        file.add(dbOpen);
        file.addSeparator();
        file.add(quitter);

        menuBar.add(file);
        menuBar.add(rqt);
        menuBar.add(account);
        menuBar.add(help);

        setJMenuBar(menuBar);

        setSize(720, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new MenusGRS();
    }
}
