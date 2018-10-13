import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class ResolveConflict extends JFrame {
	  public ResolveConflict() {
		  createComponents();
		  setSize(800,400);
	  }
	public void createComponents() {
		  String[] data =new String[10];
		  Sched Sch= new Sched();
			try{
				// Open file to read from, named SavedObj.sav.
				
				FileInputStream saveFile = new FileInputStream("SaveSch.sav");

				// Create an ObjectInputStream to get objects from save file.
				ObjectInputStream save = new ObjectInputStream(saveFile);
				Sch=(Sched)save.readObject();
				save.close();
				
			}
			catch(Exception exc){
				exc.printStackTrace(); // If there was an error, print the info.
				}
		  
		  for(int i =0;i<Sch.get().size();i++) {
			  for(Sched s : Sch.get()) {
				  if(s.getR1().getAv()) {
					  data[i]="Room1"+" "+s.getName();
				  }
			  }
		  }
		  
		
		JList list = new JList(data); //data has type Object[]
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
		
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(400,200));
		
	}

}
