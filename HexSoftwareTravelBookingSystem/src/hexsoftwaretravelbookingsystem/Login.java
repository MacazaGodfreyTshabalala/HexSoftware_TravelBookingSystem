
package hexsoftwaretravelbookingsystem;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

 public class Login extends JFrame {
     
     
     Login(){
         
            setSize(700,350);
            setLocation(350,200);
            setLayout(null);
            
            getContentPane().setBackground(Color.WHITE);
         
            JPanel p1 = new JPanel();
            p1.setBackground(Color.GREEN);
            p1.setBounds(0,0,350,350);
            p1.setLayout(null);
            add(p1);  
         
         
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
            Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(100,120,200,200);
            p1.add(image);
            
            JPanel p2 = new JPanel();
            p2.setLayout(null);
            p2.setBounds(350,30,400,250);
            add(p2);
            
            JLabel lblUsername = new JLabel("Username");
            
          
            setVisible(true);
            
             
            
            
     
     
     }
     
     public static void main(String[] args)
     {
     
       new Login();
     }
     
     
    
}
