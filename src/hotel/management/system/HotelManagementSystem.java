
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HotelManagementSystem extends JFrame implements ActionListener{
    
    HotelManagementSystem(){
            setSize(1366,564);
            setLocation(0,0);
           
            
         
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
            JLabel image = new JLabel(i1);
            image.setBounds(0,0,1366,565);
            add(image);
            
            
             JLabel text = new JLabel("Hotel Management System");
             text.setFont(new Font("serif", Font.PLAIN, 50));
            text.setBounds(20,430,1000,100);
            text.setForeground(Color.WHITE);
            image.add(text);
            
            
           JButton next = new JButton ("Next");
           next.setBounds(1150,450,150,50);
            next.setBackground(Color.WHITE);
            image.add(next);
            next.addActionListener(this);
            
            setVisible(true);
            
            
            while(true){
                
                text.setVisible(false);
                try{
                    Thread.sleep(500);
                    
                }catch(Exception e){
                    System.out.println(e);
                }
                text.setVisible(true);
                 try{
                    Thread.sleep(500);
                    
                }catch(Exception e){
                    System.out.println(e);
                }
                
                
            }
        
    }
    @Override
   public void actionPerformed(ActionEvent ae)
   {
       setVisible(false);
       new Login();
   }    
    
    
    
    public static void main(String[] args) {
        new HotelManagementSystem();

        


    }
    
}
