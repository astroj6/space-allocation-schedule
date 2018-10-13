import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class principalframe extends JFrame {
  public principalframe() {
	  createComponents();
	  setSize(800,400);
  }
  class ClickListener implements ActionListener{
	  public void actionPerformed(ActionEvent event) {
		  JFrame createframe = new createFrame2();
          setVisible(false);
		  
		  createframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  createframe.setVisible(true);;
	  }
  }
  public void createComponents() {
	  JButton button = new JButton("Create Schedule");
	  JPanel panel = new JPanel();
	  panel.add(button);
	  add(panel);
	  
	  ActionListener listener =new ClickListener();
	button.addActionListener(listener);
  }
}
