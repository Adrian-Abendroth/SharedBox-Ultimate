package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;

/* MainView is a Swing-Component for the Graphical UserInterface */
public class MainView {
  // MainView uses Swing framework to display UI to user
    private JFrame frame;
    private JButton end;
    
    public MainView(String title) {
            frame = new JFrame(title);
        
            // set a title for the frame
            frame.setTitle("MainView!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // display the window
            frame.setVisible(true);
            // set the size of the window to 800 x 600
            frame.setSize(800, 600);
            
            // GUI-Elements
            end = new JButton("Beenden");
            
            // GUI-Layout
            frame.getContentPane().add(end, BorderLayout.EAST);
            /* Bekomme es nicht hin, den Action.Listener in die Klasse UserAction.java einzubauen */
            end.addActionListener(e -> System.exit(0));
    }

    
    /* ***** Getter ***** */
    public JFrame getFrame() {
     return frame;
    }
   
    
    public void setFrame(JFrame frame) {
     this.frame = frame;
    }
    
    public JButton getEnd() {
         return end;
        }
    
    /* ***** Setter ***** */    
    public void setEnd(JButton end) {
     this.end = end;
    }
    


}