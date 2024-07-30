
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;


public class MyFirstFrame extends JFrame{

    public MyFirstFrame() {
        this.setTitle("My First Gui");
        this.setSize(200, 250);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setForeground(Color.blue);
        this.setVisible(true);
    }
    
    
}
