package quiz.application;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class StartQuiz extends JFrame implements ActionListener{
    String name;
    JButton begins;
    StartQuiz(String name){
        this.name = name;
       getContentPane().setBackground(Color.WHITE);
 
       setVisible(true);
       setLayout(null);
        JLabel rules = new JLabel("Welcome "+ name + " to IQ Meter");
        rules.setBounds(500,30,500,30);
        rules.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        rules.setForeground(new Color(240,0,0));
        add(rules);
        
         JLabel welcome = new JLabel("Quiz Instructions");
        welcome.setBounds(600,100,500,20);
        welcome.setFont(new Font("NEW ROMAN TIMES",Font.BOLD,15));
        welcome.setForeground(new Color(240,0,0));
        add(welcome);
        
        JLabel topic = new JLabel();
        topic.setBounds(100,200,500,20);
        topic.setFont(new Font("NEW ROMAN TIMES",Font.BOLD,15));
        topic.setForeground(new Color(240,0,0));
        topic.setText(
                      "1. Every Question"
                              + " will be of 15 seconds ");
        add(topic);
        
           JLabel topic2 = new JLabel();
        topic2.setBounds(100,230,500,20);
        topic2.setFont(new Font("NEW ROMAN TIMES",Font.BOLD,15));
        topic2.setForeground(new Color(240,0,0));
        topic2.setText(
                      "2.  5 Points will be provided for each right answer ");
        add(topic2);
        
        begins = new JButton("Start it");
         begins.setBounds(830,240,200,40);
        begins.setBackground(new Color(2,78,32));
        begins.setForeground(Color.white);
        begins.addActionListener(this);
        add(begins);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1200,400);
        setLocation(200,200);
        setVisible(true);
  
    }
    public static void main(String[]args){
        new StartQuiz("user");
}

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==begins){
          setVisible(false);
       new Quiz(name);
//          new requiz(name);
    
   }  else{
               setVisible(false);
               new Login();
               }
    }
}