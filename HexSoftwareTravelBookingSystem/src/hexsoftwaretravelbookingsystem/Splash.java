package hexsoftwaretravelbookingsystem;

import javax.swing.*;
import java.awt.*;

public abstract class Splash extends JFrame implements Runnable{
    
    Thread thread;
    
    Splash()
    {
        
         
        
        
     
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
          
    }
    
    @Override
    public void run()
    {
        try
        {
              Thread.sleep(7000);
              //new Login();
                setVisible(false);
        }
        catch(InterruptedException e)
        {
        }
    
    }
    
    public static void main(String[] arsg){
        
        Splash frame = new Splash() {};
        
        int x= 1;
        for(int i = 1;i <= 350 ; x+=7, i+=6)
        {
          frame.setLocation(640 - (x+i)/2, 360-(i/2));
          frame.setSize(x + i, i);
          
          try{
            Thread.sleep(5);
          }
          catch(InterruptedException e)
          {
             
          }
          
          
        }
        
    }

 
    
}
