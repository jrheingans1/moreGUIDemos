package tempconvgui;

import javax.swing.UIManager;

/**
 * Start up the first example.
 * @author jlombardo
 */
public class Startup2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set default look and feel for system
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
        } catch (Exception e) {
            // Likely the L&F class is not in the class path; ignore.
        }
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow2().setVisible(true);
            }
        });
            
    }
}
