package hexsoftwaretravelbookingsystem;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame{
    
    
    Splash()
    {
        
        setSize(800,500);
        setLocation(250,100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);
    
    }
    
    public static void main(String[] arsg){
        
        new Splash();
    
    }
    
    
}
