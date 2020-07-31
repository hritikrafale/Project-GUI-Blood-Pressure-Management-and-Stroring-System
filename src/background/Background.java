
package background;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Background
{
    public static void main(String[] args) {
    PutBackground pb = new PutBackground();    
    }
    
}

class PutBackground extends JFrame 
{
    public PutBackground()
    {
        JLabel background;
        setSize(1200,700);
        setLayout(null);
        setDefaultCloseOperation(3);
        ImageIcon img = new ImageIcon("Background.jpeg");
        
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1200,700);
        add(background);
        setVisible(true);
    }
}
