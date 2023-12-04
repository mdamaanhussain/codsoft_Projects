
package quiz.application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
     JButton next;
    Score(String name,int score){
    
            setBounds(600,150,790,550);
               getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
         ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/score (Small).png"));  //iamge
        JLabel imagE = new JLabel(i2);
        imagE.setBounds(-100,0,1050,200);   //image location on pane
        add(imagE);
        
       JLabel  heading = new JLabel("Thank You "+ name +" For Playing IQ METER");
        heading.setBounds(200, 450, 900, 30);
         heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        
            JLabel  scorelabel = new JLabel("Your score is "+score);
        scorelabel.setBounds(250, 200, 900, 50);
         scorelabel.setFont(new Font("Tahoma",Font.PLAIN,44));
            scorelabel.setForeground(Color.BLUE);
        add(scorelabel);
        
        
       next = new JButton("Play Again");
next.setBounds(300,300,200,40);
next.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,22));
next.setForeground(Color.white);
next.setBackground(Color.blue);
next.addActionListener(this);
add(next);
        
        
        
        setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        new Score("user",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==next){
        new Login();
        setVisible(false);
    }
    }
}
