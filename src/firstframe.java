import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class firstframe extends JFrame {
	 public firstframe() {
		 createComponents();
		 
		 setSize(800,400);
	 }
	 public class ClickListener implements ActionListener
	 {
	  public void actionPerformed(ActionEvent event) {
		  JFrame frame1 = new principalframe();
		  setVisible(false);
		  
		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame1.setVisible(true);;
		  
	  }
	 }
	 
	 public class ClickListener1 implements ActionListener
	 {
	  public void actionPerformed(ActionEvent event) {
		  JFrame frame1 = new RequestFrame();
		  setVisible(false);
		  
		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame1.setVisible(true);;
		  
	  }
	 }
	 public void createComponents() {
		 JButton button = new JButton("principals tools");
		 JPanel panel = new JPanel();
		 JButton button2 = new JButton("Request Space");
		 panel.add(button);
		 panel.add(button2);
		 add(panel);
		 
		 ActionListener listener =new ClickListener();
		 button.addActionListener(listener);
		 ActionListener listener1 =new ClickListener1();
		 button2.addActionListener(listener1);
	 }

}