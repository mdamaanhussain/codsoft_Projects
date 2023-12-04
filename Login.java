
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton Start,Back;
    JTextField tfname;

    Login(){
        getContentPane().setBackground(Color.WHITE);   //content pane color
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));  //image
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,300,300);   //image location on pane
        add(image);
        
        JLabel heading = new JLabel("IQ Meter");  //Heading
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("MOngolian Baiti",Font.BOLD,40));
        heading.setForeground(new Color(30,40,254));
        add(heading);
        
        
           JLabel name = new JLabel("Enter Your Name");
        name.setBounds(755,150,300,20);
        name.setFont(new Font("MOngolian Baiti",Font.BOLD,20));
        name.setForeground(new Color(240,0,0));
        add(name);
        
           
        tfname = new JTextField();
        tfname.setBounds(670,200,300,25);
        tfname.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
        add(tfname);
        
        
        Start = new JButton("Start");
        Start.setBounds(700,240,100,20);
        Start.setBackground(new Color(2,48,32));
        Start.setForeground(Color.white);
        Start.addActionListener(this);
        add(Start);
        
                Back = new JButton("Back");
        Back.setBounds(830,240,100,20);
        Back.setBackground(new Color(2,48,32));
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1200,400);
        setLocation(200,200);
        setVisible(true);
  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == Start){
          String name = tfname.getText();
          setVisible(false);
          new StartQuiz(name);
          
    }else if(e.getSource()== Back){
        setVisible(false);
    }
    }
    public static void main(String[]args){
      new Login();
    }

    
}
