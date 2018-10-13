import java.io.*;
import java.util.ArrayList;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class createFrame2 extends JFrame {
	
	//panes
	
	JTabbedPane intro = new JTabbedPane();
	JPanel panel= new JPanel();
	
	//
	
	//room1
	JPanel panelR1= new JPanel();
	
	JTabbedPane introR1 = new JTabbedPane();
	JPanel panelR1_intro=new JPanel();
	
	JPanel panelR1_d1=new JPanel();
	JPanel panelR1_d2=new JPanel();
	JPanel panelR1_d3=new JPanel();
	JPanel panelR1_d4=new JPanel();
	JPanel panelR1_d5=new JPanel();
	JPanel panelR1_d6=new JPanel();
	JPanel panelR1_d7=new JPanel();
	
	
	
	//
	
	//room 2
    JPanel panelR2= new JPanel();
	
	JTabbedPane introR2 = new JTabbedPane();
	JPanel panelR2_intro=new JPanel();
	
	JPanel panelR2_d1=new JPanel();
	JPanel panelR2_d2=new JPanel();
	JPanel panelR2_d3=new JPanel();
	JPanel panelR2_d4=new JPanel();
	JPanel panelR2_d5=new JPanel();
	JPanel panelR2_d6=new JPanel();
	JPanel panelR2_d7=new JPanel();
	
	
	//
	
	//room 3
    JPanel panelR3= new JPanel();
	
	JTabbedPane introR3 = new JTabbedPane();
	JPanel panelR3_intro=new JPanel();
	
	JPanel panelR3_d1=new JPanel();
	JPanel panelR3_d2=new JPanel();
	JPanel panelR3_d3=new JPanel();
	JPanel panelR3_d4=new JPanel();
	JPanel panelR3_d5=new JPanel();
	JPanel panelR3_d6=new JPanel();
	JPanel panelR3_d7=new JPanel();
	//
	
	// room4
    JPanel panelR4= new JPanel();
	
	JTabbedPane introR4 = new JTabbedPane();
	JPanel panelR4_intro=new JPanel();
	
	JPanel panelR4_d1=new JPanel();
	JPanel panelR4_d2=new JPanel();
	JPanel panelR4_d3=new JPanel();
	JPanel panelR4_d4=new JPanel();
	JPanel panelR4_d5=new JPanel();
	JPanel panelR4_d6=new JPanel();
	JPanel panelR4_d7=new JPanel();
	//
	//room5
    JPanel panelR5= new JPanel();
	
	JTabbedPane introR5 = new JTabbedPane();
	JPanel panelR5_intro=new JPanel();
	
	JPanel panelR5_d1=new JPanel();
	JPanel panelR5_d2=new JPanel();
	JPanel panelR5_d3=new JPanel();
	JPanel panelR5_d4=new JPanel();
	JPanel panelR5_d5=new JPanel();
	JPanel panelR5_d6=new JPanel();
	JPanel panelR5_d7=new JPanel();
	//
	
	// room check box availabilitty
	JCheckBox gym = new JCheckBox("is the Gym available?");
	JCheckBox the = new JCheckBox("is the theater available?");
	JCheckBox lab = new JCheckBox("is the laboratory available?");
	JCheckBox caf = new JCheckBox("is the cafeteria available?");
	JCheckBox lib = new JCheckBox("is the library available?");
	//
	
	//days available
	JCheckBox day1 = new JCheckBox("is Monday available?");
	
	JCheckBox day1_2 = new JCheckBox("is Monday available?");
	
	JCheckBox day1_3 = new JCheckBox("is Monday available?");
	
	JCheckBox day1_4 = new JCheckBox("is Monday available?");
	
	JCheckBox day1_5 = new JCheckBox("is Monday available?");
	  //times available
	 JCheckBox mtime2 = new JCheckBox("8-9 AM");
	 JCheckBox mtime1 = new JCheckBox("9-10 AM");
	 JCheckBox mtime3 = new JCheckBox("10-11AM");
	 JCheckBox mtime4= new JCheckBox("11-12AM");
	 JCheckBox mtime5 = new JCheckBox("12-1 PM");
	 
	 JCheckBox mtime2_2 = new JCheckBox("8-9 AM");
	 JCheckBox mtime1_2 = new JCheckBox("9-10 AM");
	 JCheckBox mtime3_2 = new JCheckBox("10-11AM");
	 JCheckBox mtime4_2 = new JCheckBox("11-12AM");
	 JCheckBox mtime5_2 = new JCheckBox("12-1 PM");
	 
	 JCheckBox mtime2_3 = new JCheckBox("8-9 AM");
	 JCheckBox mtime1_3 = new JCheckBox("9-10 AM");
	 JCheckBox mtime3_3 = new JCheckBox("10-11AM");
	 JCheckBox mtime4_3= new JCheckBox("11-12AM");
	 JCheckBox mtime5_3 = new JCheckBox("12-1 PM");
	 
	 JCheckBox mtime2_4 = new JCheckBox("8-9 AM");
	 JCheckBox mtime1_4 = new JCheckBox("9-10 AM");
	 JCheckBox mtime3_4 = new JCheckBox("10-11AM");
	 JCheckBox mtime4_4= new JCheckBox("11-12AM");
	 JCheckBox mtime5_4 = new JCheckBox("12-1 PM");
	 
	 JCheckBox mtime2_5 = new JCheckBox("8-9 AM");
	 JCheckBox mtime1_5 = new JCheckBox("9-10 AM");
	 JCheckBox mtime3_5 = new JCheckBox("10-11AM");
	 JCheckBox mtime4_5 = new JCheckBox("11-12AM");
	 JCheckBox mtime5_5 = new JCheckBox("12-1 PM");
	  // 
	JCheckBox day2 = new JCheckBox("Tuesday");
	
	JCheckBox day2_2 = new JCheckBox("Tuesday");
	
	JCheckBox day2_3 = new JCheckBox("Tuesday");
	
	JCheckBox day2_4 = new JCheckBox("Tuesday");
	
	JCheckBox day2_5 = new JCheckBox("Tuesday");
	  //times available
	  JCheckBox ttime1 = new JCheckBox("8-9 AM");
	  JCheckBox ttime2 = new JCheckBox("9-10 AM");
	  JCheckBox ttime3 = new JCheckBox("10-11AM");
	  JCheckBox ttime4= new JCheckBox("11-12AM");
	  JCheckBox ttime5 = new JCheckBox("12-1 PM");
	  
		 JCheckBox ttime1_2 = new JCheckBox("8-9 AM");
		 JCheckBox ttime2_2 = new JCheckBox("9-10 AM");
		 JCheckBox ttime3_2 = new JCheckBox("10-11AM");
		 JCheckBox ttime4_2 = new JCheckBox("11-12AM");
		 JCheckBox ttime5_2 = new JCheckBox("12-1 PM");
		 
		 JCheckBox ttime1_3 = new JCheckBox("8-9 AM");
		 JCheckBox ttime2_3 = new JCheckBox("9-10 AM");
		 JCheckBox ttime3_3 = new JCheckBox("10-11AM");
		 JCheckBox ttime4_3= new JCheckBox("11-12AM");
		 JCheckBox ttime5_3 = new JCheckBox("12-1 PM");
		 
		 JCheckBox ttime1_4 = new JCheckBox("8-9 AM");
		 JCheckBox ttime2_4 = new JCheckBox("9-10 AM");
		 JCheckBox ttime3_4 = new JCheckBox("10-11AM");
		 JCheckBox ttime4_4= new JCheckBox("11-12AM");
		 JCheckBox ttime5_4 = new JCheckBox("12-1 PM");
		 
		 JCheckBox ttime1_5 = new JCheckBox("8-9 AM");
		 JCheckBox ttime2_5 = new JCheckBox("9-10 AM");
		 JCheckBox ttime3_5 = new JCheckBox("10-11AM");
		 JCheckBox ttime4_5 = new JCheckBox("11-12AM");
		 JCheckBox ttime5_5 = new JCheckBox("12-1 PM");
	 
	  // 
	JCheckBox day3 = new JCheckBox("Wednesday");
	
	JCheckBox day3_2 = new JCheckBox("Wednesday");
	
	JCheckBox day3_3 = new JCheckBox("Wednesday");
	
	JCheckBox day3_4 = new JCheckBox("Wednesday");
	
	JCheckBox day3_5 = new JCheckBox("Wednesday");
	  //times available
	  JCheckBox wtime1 = new JCheckBox("8-9 AM");
	  JCheckBox wtime2 = new JCheckBox("9-10 AM");
	  JCheckBox wtime3 = new JCheckBox("10-11AM");
	  JCheckBox wtime4= new JCheckBox("11-12AM");
	  JCheckBox wtime5 = new JCheckBox("12-1 PM");
	  
		 JCheckBox wtime1_2 = new JCheckBox("8-9 AM");
		 JCheckBox wtime2_2 = new JCheckBox("9-10 AM");
		 JCheckBox wtime3_2 = new JCheckBox("10-11AM");
		 JCheckBox wtime4_2 = new JCheckBox("11-12AM");
		 JCheckBox wtime5_2 = new JCheckBox("12-1 PM");
		 
		 JCheckBox wtime1_3 = new JCheckBox("8-9 AM");
		 JCheckBox wtime2_3 = new JCheckBox("9-10 AM");
		 JCheckBox wtime3_3 = new JCheckBox("10-11AM");
		 JCheckBox wtime4_3= new JCheckBox("11-12AM");
		 JCheckBox wtime5_3 = new JCheckBox("12-1 PM");
		 
		 JCheckBox wtime1_4 = new JCheckBox("8-9 AM");
		 JCheckBox wtime2_4 = new JCheckBox("9-10 AM");
		 JCheckBox wtime3_4 = new JCheckBox("10-11AM");
		 JCheckBox wtime4_4= new JCheckBox("11-12AM");
		 JCheckBox wtime5_4 = new JCheckBox("12-1 PM");
		 
		 JCheckBox wtime1_5 = new JCheckBox("8-9 AM");
		 JCheckBox wtime2_5 = new JCheckBox("9-10 AM");
		 JCheckBox wtime3_5 = new JCheckBox("10-11AM");
		 JCheckBox wtime4_5 = new JCheckBox("11-12AM");
		 JCheckBox wtime5_5 = new JCheckBox("12-1 PM");
		
	  // 
	JCheckBox day4 = new JCheckBox("Thursday");
	
	JCheckBox day4_2 = new JCheckBox("Thursday");
	
	JCheckBox day4_3 = new JCheckBox("Thursday");
	
	JCheckBox day4_4 = new JCheckBox("Thursday");
	
	JCheckBox day4_5 = new JCheckBox("Thursday");
	  //times available
	
	  JCheckBox htime1 = new JCheckBox("8-9 AM");
	  JCheckBox htime2 = new JCheckBox("9-10 AM");
	  JCheckBox htime3 = new JCheckBox("10-11AM");
	  JCheckBox htime4= new JCheckBox("11-12AM");
	  JCheckBox htime5 = new JCheckBox("12-1 PM");
	  
		 JCheckBox htime1_2 = new JCheckBox("8-9 AM");
		 JCheckBox htime2_2 = new JCheckBox("9-10 AM");
		 JCheckBox htime3_2 = new JCheckBox("10-11AM");
		 JCheckBox htime4_2 = new JCheckBox("11-12AM");
		 JCheckBox htime5_2 = new JCheckBox("12-1 PM");
		 
		 JCheckBox htime1_3 = new JCheckBox("8-9 AM");
		 JCheckBox htime2_3 = new JCheckBox("9-10 AM");
		 JCheckBox htime3_3 = new JCheckBox("10-11AM");
		 JCheckBox htime4_3= new JCheckBox("11-12AM");
		 JCheckBox htime5_3 = new JCheckBox("12-1 PM");
		 
		 JCheckBox htime1_4 = new JCheckBox("8-9 AM");
		 JCheckBox htime2_4 = new JCheckBox("9-10 AM");
		 JCheckBox htime3_4 = new JCheckBox("10-11AM");
		 JCheckBox htime4_4= new JCheckBox("11-12AM");
		 JCheckBox htime5_4 = new JCheckBox("12-1 PM");
		
		 JCheckBox htime1_5 = new JCheckBox("8-9 AM");
		 JCheckBox htime2_5 = new JCheckBox("9-10 AM");
		 JCheckBox htime3_5 = new JCheckBox("10-11AM");
		 JCheckBox htime4_5 = new JCheckBox("11-12AM");
		 JCheckBox htime5_5 = new JCheckBox("12-1 PM");
	  
	  // 
	JCheckBox day5 = new JCheckBox("Friday");
	JCheckBox day5_2 = new JCheckBox("Friday");
	JCheckBox day5_3 = new JCheckBox("Friday");
	JCheckBox day5_4 = new JCheckBox("Friday");
	JCheckBox day5_5 = new JCheckBox("Friday");
	  //times available
	
	  JCheckBox ftime1 = new JCheckBox("8-9 AM");
	  JCheckBox ftime2 = new JCheckBox("9-10 AM");
	  JCheckBox ftime3 = new JCheckBox("10-11AM");
	  JCheckBox ftime4= new JCheckBox("11-12AM");
	  JCheckBox ftime5 = new JCheckBox("12-1 PM");
	  
		 JCheckBox ftime1_2 = new JCheckBox("8-9 AM");
		 JCheckBox ftime2_2 = new JCheckBox("9-10 AM");
		 JCheckBox ftime3_2 = new JCheckBox("10-11AM");
		 JCheckBox ftime4_2 = new JCheckBox("11-12AM");
		 JCheckBox ftime5_2 = new JCheckBox("12-1 PM");
		 
		 JCheckBox ftime1_3 = new JCheckBox("8-9 AM");
		 JCheckBox ftime2_3 = new JCheckBox("9-10 AM");
		 JCheckBox ftime3_3 = new JCheckBox("10-11AM");
		 JCheckBox ftime4_3= new JCheckBox("11-12AM");
		 JCheckBox ftime5_3 = new JCheckBox("12-1 PM");
		 
		 JCheckBox ftime1_4 = new JCheckBox("8-9 AM");
		 JCheckBox ftime2_4 = new JCheckBox("9-10 AM");
		 JCheckBox ftime3_4 = new JCheckBox("10-11AM");
		 JCheckBox ftime4_4= new JCheckBox("11-12AM");
		 JCheckBox ftime5_4 = new JCheckBox("12-1 PM");
		 
		 JCheckBox ftime1_5 = new JCheckBox("8-9 AM");
		 JCheckBox ftime2_5 = new JCheckBox("9-10 AM");
		 JCheckBox ftime3_5 = new JCheckBox("10-11AM");
		 JCheckBox ftime4_5 = new JCheckBox("11-12AM");
		 JCheckBox ftime5_5 = new JCheckBox("12-1 PM");
	  
	  // 
	JCheckBox day6 = new JCheckBox("Saturday");
	  //times available
	  JCheckBox stime1 = new JCheckBox("12-1 AM");
	  JCheckBox stime2 = new JCheckBox("1-2 AM");
		 JCheckBox stime3 = new JCheckBox("10-11AM");
		 JCheckBox stime4= new JCheckBox("11-12AM");
		 JCheckBox stime5 = new JCheckBox("12-1 PM");
	  
	  // 
	JCheckBox day7 = new JCheckBox("Sunday");
	  //times available
	  JCheckBox utime1 = new JCheckBox("12-1 AM");
	  JCheckBox utime2 = new JCheckBox("1-2 AM");
		 JCheckBox utime3 = new JCheckBox("10-11AM");
		 JCheckBox utime4= new JCheckBox("11-12AM");
		 JCheckBox utime5 = new JCheckBox("12-1 PM");  
	
	  // 
		 
	//semesters available for each room
		  JCheckBox fal = new JCheckBox("is the room available in the fall?");
		  JCheckBox win = new JCheckBox("is the room available in the winter?");
		  
		  JCheckBox fal2 = new JCheckBox("is the room available in the fall?");
		  JCheckBox win2 = new JCheckBox("is the room available in the winter?");
		  
		  JCheckBox fal3 = new JCheckBox("is the room available in the fall?");
		  JCheckBox win3 = new JCheckBox("is the room available in the winter?");
		  
		  JCheckBox fal4 = new JCheckBox("is the room available in the fall?");
		  JCheckBox win4 = new JCheckBox("is the room available in the winter?");
		  
		  JCheckBox fal5 = new JCheckBox("is the room available in the fall?");
		  JCheckBox win5 = new JCheckBox("is the room available in the winter?");
	
	//
		  
		  //convenience buttons for each room :
		  
		  JButton R1d1b1 = new JButton("Apply these times to tuesday ");
		  JButton R1d1b2 = new JButton("Apply these times to wednesday");
		  JButton R1d1b3 = new JButton("Apply these times to thursday");
		  JButton R1d1b4 = new JButton("Apply these times to friday");

		  JButton R1d2b1 = new JButton("Apply these times to monday");
		  JButton R1d2b2 = new JButton("Apply these times to wednesday");
		  JButton R1d2b3 = new JButton("Apply these times to thursday");
		  JButton R1d2b4 = new JButton("Apply these times to friday");
		  
		  JButton R1d3b1 = new JButton("Apply these times to monday");
		  JButton R1d3b2 = new JButton("Apply these times to tuesday");
		  JButton R1d3b3 = new JButton("Apply these times to thursday");
		  JButton R1d3b4 = new JButton("Apply these times to friday");

		  JButton R1d4b1 = new JButton("Apply these times to monday");
		  JButton R1d4b2 = new JButton("Apply these times to tuesday");
		  JButton R1d4b3 = new JButton("Apply these times to wednesday");
		  JButton R1d4b4 = new JButton("Apply these times to friday");

		  JButton R1d5b1 = new JButton("Apply these times to monday");
		  JButton R1d5b2 = new JButton("Apply these times to tuesday");
		  JButton R1d5b3 = new JButton("Apply these times to wednesday");
		  JButton R1d5b4 = new JButton("Apply these times to thursday");
		  //////
		  
		  JButton R2d1b1 = new JButton("Apply these times to tuesday ");   
		  JButton R2d1b2 = new JButton("Apply these times to wednesday");  
		  JButton R2d1b3 = new JButton("Apply these times to thursday");   
		  JButton R2d1b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R2d2b1 = new JButton("Apply these times to monday");     
		  JButton R2d2b2 = new JButton("Apply these times to wednesday");  
		  JButton R2d2b3 = new JButton("Apply these times to thursday");   
		  JButton R2d2b4 = new JButton("Apply these times to friday");     
		                                                                   
		  JButton R2d3b1 = new JButton("Apply these times to monday");     
		  JButton R2d3b2 = new JButton("Apply these times to tuesday");    
		  JButton R2d3b3 = new JButton("Apply these times to thursday");   
		  JButton R2d3b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R2d4b1 = new JButton("Apply these times to monday");     
		  JButton R2d4b2 = new JButton("Apply these times to tuesday");    
		  JButton R2d4b3 = new JButton("Apply these times to wednesday");  
		  JButton R2d4b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R2d5b1 = new JButton("Apply these times to monday");     
		  JButton R2d5b2 = new JButton("Apply these times to tuesday");    
		  JButton R2d5b3 = new JButton("Apply these times to wednesday");  
		  JButton R2d5b4 = new JButton("Apply these times to thursday");   

//////////////////////////////////
		  
		  JButton R3d1b1 = new JButton("Apply these times to tuesday ");   
		  JButton R3d1b2 = new JButton("Apply these times to wednesday");  
		  JButton R3d1b3 = new JButton("Apply these times to thursday");   
		  JButton R3d1b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R3d2b1 = new JButton("Apply these times to monday");     
		  JButton R3d2b2 = new JButton("Apply these times to wednesday");  
		  JButton R3d2b3 = new JButton("Apply these times to thursday");   
		  JButton R3d2b4 = new JButton("Apply these times to friday");     
		                                                                   
		  JButton R3d3b1 = new JButton("Apply these times to monday");     
		  JButton R3d3b2 = new JButton("Apply these times to tuesday");    
		  JButton R3d3b3 = new JButton("Apply these times to thursday");   
		  JButton R3d3b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R3d4b1 = new JButton("Apply these times to monday");     
		  JButton R3d4b2 = new JButton("Apply these times to tuesday");    
		  JButton R3d4b3 = new JButton("Apply these times to wednesday");  
		  JButton R3d4b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R3d5b1 = new JButton("Apply these times to monday");     
		  JButton R3d5b2 = new JButton("Apply these times to tuesday");    
		  JButton R3d5b3 = new JButton("Apply these times to wednesday");  
		  JButton R3d5b4 = new JButton("Apply these times to thursday");   
		  
		  //////////////////////////////////////////
		  
		  JButton R4d1b1 = new JButton("Apply these times to tuesday ");   
		  JButton R4d1b2 = new JButton("Apply these times to wednesday");  
		  JButton R4d1b3 = new JButton("Apply these times to thursday");   
		  JButton R4d1b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R4d2b1 = new JButton("Apply these times to monday");     
		  JButton R4d2b2 = new JButton("Apply these times to wednesday");  
		  JButton R4d2b3 = new JButton("Apply these times to thursday");   
		  JButton R4d2b4 = new JButton("Apply these times to friday");     
		                                                                   
		  JButton R4d3b1 = new JButton("Apply these times to monday");     
		  JButton R4d3b2 = new JButton("Apply these times to tuesday");    
		  JButton R4d3b3 = new JButton("Apply these times to thursday");   
		  JButton R4d3b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R4d4b1 = new JButton("Apply these times to monday");     
		  JButton R4d4b2 = new JButton("Apply these times to tuesday");    
		  JButton R4d4b3 = new JButton("Apply these times to wednesday");  
		  JButton R4d4b4 = new JButton("Apply these times to friday");     
                                                                           
		  JButton R4d5b1 = new JButton("Apply these times to monday");     
		  JButton R4d5b2 = new JButton("Apply these times to tuesday");    
		  JButton R4d5b3 = new JButton("Apply these times to wednesday");  
		  JButton R4d5b4 = new JButton("Apply these times to thursday");   
	
		  //////////////////////////////////////
		  
		  JButton R5d1b1 = new JButton("Apply these times to tuesday ");   
		  JButton R5d1b2 = new JButton("Apply these times to wednesday");  
		  JButton R5d1b3 = new JButton("Apply these times to thursday");   
		  JButton R5d1b4 = new JButton("Apply these times to friday");     
                                                                          
		  JButton R5d2b1 = new JButton("Apply these times to monday");     
		  JButton R5d2b2 = new JButton("Apply these times to wednesday");  
		  JButton R5d2b3 = new JButton("Apply these times to thursday");   
		  JButton R5d2b4 = new JButton("Apply these times to friday");     
		                                                                  
		  JButton R5d3b1 = new JButton("Apply these times to monday");     
		  JButton R5d3b2 = new JButton("Apply these times to tuesday");    
		  JButton R5d3b3 = new JButton("Apply these times to thursday");   
		  JButton R5d3b4 = new JButton("Apply these times to friday");     
                                                                          
		  JButton R5d4b1 = new JButton("Apply these times to monday");     
		  JButton R5d4b2 = new JButton("Apply these times to tuesday");    
		  JButton R5d4b3 = new JButton("Apply these times to wednesday");  
		  JButton R5d4b4 = new JButton("Apply these times to friday");     
                                                                          
		  JButton R5d5b1 = new JButton("Apply these times to monday");     
		  JButton R5d5b2 = new JButton("Apply these times to tuesday");    
		  JButton R5d5b3 = new JButton("Apply these times to wednesday");  
		  JButton R5d5b4 = new JButton("Apply these times to thursday");   
		  
	public createFrame2() {
		createComponents();
	   setSize(800,400);
	
	}
	public void createSchedule() {
		Sched sch = new Sched();
	if(gym.isSelected()) {
		Room RR1=new Room();
		if(day1.isSelected()) {
		Day d1 = new Day();
		 if(mtime1.isSelected()) {
			 d1.setT1(true);
		 }
		 if(mtime2.isSelected()) {
			 d1.setT2(true);
		 }
		 if(mtime3.isSelected()) {
			 d1.setT3(true);
		 }
		 if(mtime4.isSelected()) {
			 d1.setT4(true);
		 }
		 if(mtime5.isSelected()) {
			 d1.setT5(true);
		 }
		 RR1.setD1(d1);
		}
	
		if(day2.isSelected()) {
		Day d2 = new Day();
		 if(ttime1.isSelected()) {
			 d2.setT1(true);
		 }
		 if(ttime2.isSelected()) {
			 d2.setT2(true);
		 }
		 if(ttime3.isSelected()) {
			 d2.setT3(true);
		 }
		 if(ttime4.isSelected()) {
			 d2.setT4(true);
		 }
		 if(ttime5.isSelected()) {
			 d2.setT5(true);
		 }
		 RR1.setD2(d2);
		}
		if(day3.isSelected()) {
		Day d3 = new Day();
		 if(wtime1.isSelected()) {
			 d3.setT1(true);
		 }
		 if(wtime2.isSelected()) {
			 d3.setT2(true);
		 }
		 if(wtime3.isSelected()) {
			 d3.setT3(true);
		 }
		 if(wtime4.isSelected()) {
			 d3.setT4(true);
		 }
		 if(wtime5.isSelected()) {
			 d3.setT5(true);
		 }
		 RR1.setD3(d3);
		}
		if(day4.isSelected()) {
		Day d4 = new Day();
		 if(htime1.isSelected()) {
			 d4.setT1(true);
		 }
		 if(htime2.isSelected()) {
			 d4.setT2(true);
		 }
		 if(htime3.isSelected()) {
			 d4.setT3(true);
		 }
		 if(htime4.isSelected()) {
			 d4.setT4(true);
		 }
		 if(htime5.isSelected()) {
			 d4.setT5(true);
		 }
		 RR1.setD4(d4);
		}
		if(day5.isSelected()) {
		Day d5 = new Day();
		 if(ftime1.isSelected()) {
			 d5.setT1(true);
		 }
		 if(ftime2.isSelected()) {
			 d5.setT2(true);
		 }
		 if(ftime3.isSelected()) {
			 d5.setT3(true);
		 }
		 if(ftime4.isSelected()) {
			 d5.setT4(true);
		 }
		 if(ftime5.isSelected()) {
			 d5.setT5(true);
		 }
		 RR1.setD5(d5);
		 
		}
		 if(fal.isSelected()) {
			 RR1.setF(true);
		 }
		 if(win.isSelected()) {
			 RR1.setW(true);
		 }
		sch.setR1(RR1);
	}
	
	if(the.isSelected()) {
		Room RR1=new Room();
		if(day1_2.isSelected()) {
		Day d1 = new Day();
		 if(mtime1_2.isSelected()) {
			 d1.setT1(true);
		 }
		 if(mtime2_2.isSelected()) {
			 d1.setT2(true);
		 }
		 if(mtime3_2.isSelected()) {
			 d1.setT3(true);
		 }
		 if(mtime4_2.isSelected()) {
			 d1.setT4(true);
		 }
		 if(mtime5_2.isSelected()) {
			 d1.setT5(true);
		 }
		 RR1.setD1(d1);
		}
	
		if(day2_2.isSelected()) {
		Day d2 = new Day();
		 if(ttime1_2.isSelected()) {
			 d2.setT1(true);
		 }
		 if(ttime2_2.isSelected()) {
			 d2.setT2(true);
		 }
		 if(ttime3_2.isSelected()) {
			 d2.setT3(true);
		 }
		 if(ttime4_2.isSelected()) {
			 d2.setT4(true);
		 }
		 if(ttime5_2.isSelected()) {
			 d2.setT5(true);
		 }
		 RR1.setD2(d2);
		}
		if(day3_2.isSelected()) {
		Day d3 = new Day();
		 if(wtime1_2.isSelected()) {
			 d3.setT1(true);
		 }
		 if(wtime2_2.isSelected()) {
			 d3.setT2(true);
		 }
		 if(wtime3_2.isSelected()) {
			 d3.setT3(true);
		 }
		 if(wtime4_2.isSelected()) {
			 d3.setT4(true);
		 }
		 if(wtime5_2.isSelected()) {
			 d3.setT5(true);
		 }
		 RR1.setD3(d3);
		}
		if(day4_2.isSelected()) {
		Day d4 = new Day();
		 if(htime1_2.isSelected()) {
			 d4.setT1(true);
		 }
		 if(htime2_2.isSelected()) {
			 d4.setT2(true);
		 }
		 if(htime3_2.isSelected()) {
			 d4.setT3(true);
		 }
		 if(htime4_2.isSelected()) {
			 d4.setT4(true);
		 }
		 if(htime5_2.isSelected()) {
			 d4.setT5(true);
		 }
		 RR1.setD4(d4);
		}
		if(day5_2.isSelected()) {
		Day d5 = new Day();
		 if(ftime1_2.isSelected()) {
			 d5.setT1(true);
		 }
		 if(ftime2_2.isSelected()) {
			 d5.setT2(true);
		 }
		 if(ftime3_2.isSelected()) {
			 d5.setT3(true);
		 }
		 if(ftime4_2.isSelected()) {
			 d5.setT4(true);
		 }
		 if(ftime5_2.isSelected()) {
			 d5.setT5(true);
		 }
		 RR1.setD5(d5);
		}
		 if(fal2.isSelected()) {
			 RR1.setF(true);
		 }
		 if(win2.isSelected()) {
			 RR1.setW(true);
		 }
       sch.setR2(RR1);
	}
	
	if(lab.isSelected()) {
		Room RR1=new Room();
		if(day1_3.isSelected()) {
		Day d1 = new Day();
		 if(mtime1_3.isSelected()) {
			 d1.setT1(true);
		 }
		 if(mtime2_3.isSelected()) {
			 d1.setT2(true);
		 }
		 if(mtime3_3.isSelected()) {
			 d1.setT3(true);
		 }
		 if(mtime4_3.isSelected()) {
			 d1.setT4(true);
		 }
		 if(mtime5_3.isSelected()) {
			 d1.setT5(true);
		 }
		 RR1.setD1(d1);
		}
	
		if(day2_3.isSelected()) {
		Day d2 = new Day();
		 if(ttime1_3.isSelected()) {
			 d2.setT1(true);
		 }
		 if(ttime2_3.isSelected()) {
			 d2.setT2(true);
		 }
		 if(ttime3_3.isSelected()) {
			 d2.setT3(true);
		 }
		 if(ttime4_3.isSelected()) {
			 d2.setT4(true);
		 }
		 if(ttime5_3.isSelected()) {
			 d2.setT5(true);
		 }
		 RR1.setD2(d2);
		}
		if(day3_3.isSelected()) {
		Day d3 = new Day();
		 if(wtime1_3.isSelected()) {
			 d3.setT1(true);
		 }
		 if(wtime2_3.isSelected()) {
			 d3.setT2(true);
		 }
		 if(wtime3_3.isSelected()) {
			 d3.setT3(true);
		 }
		 if(wtime4_3.isSelected()) {
			 d3.setT4(true);
		 }
		 if(wtime5_3.isSelected()) {
			 d3.setT5(true);
		 }
		 RR1.setD3(d3);
		}
		if(day4_3.isSelected()) {
		Day d4 = new Day();
		 if(htime1_3.isSelected()) {
			 d4.setT1(true);
		 }
		 if(htime2_3.isSelected()) {
			 d4.setT2(true);
		 }
		 if(htime3_3.isSelected()) {
			 d4.setT3(true);
		 }
		 if(htime4_3.isSelected()) {
			 d4.setT4(true);
		 }
		 if(htime5_3.isSelected()) {
			 d4.setT5(true);
		 }
		 RR1.setD4(d4);
		}
		if(day5_3.isSelected()) {
		Day d5 = new Day();
		 if(ftime1_3.isSelected()) {
			 d5.setT1(true);
		 }
		 if(ftime2_3.isSelected()) {
			 d5.setT2(true);
		 }
		 if(ftime3_3.isSelected()) {
			 d5.setT3(true);
		 }
		 if(ftime4_3.isSelected()) {
			 d5.setT4(true);
		 }
		 if(ftime5_3.isSelected()) {
			 d5.setT5(true);
		 }
		 RR1.setD5(d5);
		}
		 if(fal3.isSelected()) {
			 RR1.setF(true);
		 }
		 if(win3.isSelected()) {
			 RR1.setW(true);
		 }
       sch.setR3(RR1);
	}
	
	if(caf.isSelected()) {
		Room RR1=new Room();
		if(day1_4.isSelected()) {
		Day d1 = new Day();
		 if(mtime1_4.isSelected()) {
			 d1.setT1(true);
		 }
		 if(mtime2_4.isSelected()) {
			 d1.setT2(true);
		 }
		 if(mtime3_4.isSelected()) {
			 d1.setT3(true);
		 }
		 if(mtime4_4.isSelected()) {
			 d1.setT4(true);
		 }
		 if(mtime5_4.isSelected()) {
			 d1.setT5(true);
		 }
		 RR1.setD1(d1);
		}
	
		if(day2_4.isSelected()) {
		Day d2 = new Day();
		 if(ttime1_4.isSelected()) {
			 d2.setT1(true);
		 }
		 if(ttime2_4.isSelected()) {
			 d2.setT2(true);
		 }
		 if(ttime3_4.isSelected()) {
			 d2.setT3(true);
		 }
		 if(ttime4_4.isSelected()) {
			 d2.setT4(true);
		 }
		 if(ttime5_4.isSelected()) {
			 d2.setT5(true);
		 }
		 RR1.setD2(d2);
		}
		if(day3_4.isSelected()) {
		Day d3 = new Day();
		 if(wtime1_4.isSelected()) {
			 d3.setT1(true);
		 }
		 if(wtime2_4.isSelected()) {
			 d3.setT2(true);
		 }
		 if(wtime3_4.isSelected()) {
			 d3.setT3(true);
		 }
		 if(wtime4_4.isSelected()) {
			 d3.setT4(true);
		 }
		 if(wtime5_4.isSelected()) {
			 d3.setT5(true);
		 }
		 RR1.setD3(d3);
		}
		if(day4_4.isSelected()) {
		Day d4 = new Day();
		 if(htime1_4.isSelected()) {
			 d4.setT1(true);
		 }
		 if(htime2_4.isSelected()) {
			 d4.setT2(true);
		 }
		 if(htime3_4.isSelected()) {
			 d4.setT3(true);
		 }
		 if(htime4_4.isSelected()) {
			 d4.setT4(true);
		 }
		 if(htime5_4.isSelected()) {
			 d4.setT5(true);
		 }
		 RR1.setD4(d4);
		}
		if(day5_4.isSelected()) {
		Day d5 = new Day();
		 if(ftime1_4.isSelected()) {
			 d5.setT1(true);
		 }
		 if(ftime2_4.isSelected()) {
			 d5.setT2(true);
		 }
		 if(ftime3_4.isSelected()) {
			 d5.setT3(true);
		 }
		 if(ftime4_4.isSelected()) {
			 d5.setT4(true);
		 }
		 if(ftime5_4.isSelected()) {
			 d5.setT5(true);
		 }
		 RR1.setD5(d5);
		}
		 if(fal4.isSelected()) {
			 RR1.setF(true);
		 }
		 if(win4.isSelected()) {
			 RR1.setW(true);
		 }
       sch.setR4(RR1);
	}
	
	
	if(lib.isSelected()) {
		Room RR1=new Room();
		if(day1_5.isSelected()) {
		Day d1 = new Day();
		 if(mtime1_5.isSelected()) {
			 d1.setT1(true);
		 }
		 if(mtime2_5.isSelected()) {
			 d1.setT2(true);
		 }
		 if(mtime3_5.isSelected()) {
			 d1.setT3(true);
		 }
		 if(mtime4_5.isSelected()) {
			 d1.setT4(true);
		 }
		 if(mtime5_5.isSelected()) {
			 d1.setT5(true);
		 }
		 
		 
		 RR1.setD1(d1);
		}
	
		if(day2_5.isSelected()) {
		Day d2 = new Day();
		 if(ttime1_5.isSelected()) {
			 d2.setT1(true);
		 }
		 if(ttime2_5.isSelected()) {
			 d2.setT2(true);
		 }
		 if(ttime3_5.isSelected()) {
			 d2.setT3(true);
		 }
		 if(ttime4_5.isSelected()) {
			 d2.setT4(true);
		 }
		 if(ttime5_5.isSelected()) {
			 d2.setT5(true);
		 }
		 RR1.setD2(d2);
		}
		if(day3_5.isSelected()) {
		Day d3 = new Day();
		 if(wtime1_5.isSelected()) {
			 d3.setT1(true);
		 }
		 if(wtime2_5.isSelected()) {
			 d3.setT2(true);
		 }
		 if(wtime3_5.isSelected()) {
			 d3.setT3(true);
		 }
		 if(wtime4_5.isSelected()) {
			 d3.setT4(true);
		 }
		 if(wtime5_5.isSelected()) {
			 d3.setT5(true);
		 }
		 RR1.setD3(d3);
		}
		if(day4_5.isSelected()) {
		Day d4 = new Day();
		 if(htime1_5.isSelected()) {
			 d4.setT1(true);
		 }
		 if(htime2_5.isSelected()) {
			 d4.setT2(true);
		 }
		 if(htime3_5.isSelected()) {
			 d4.setT3(true);
		 }
		 if(htime4_5.isSelected()) {
			 d4.setT4(true);
		 }
		 if(htime5_5.isSelected()) {
			 d4.setT5(true);
		 }
		 RR1.setD4(d4);
		}
		if(day5_5.isSelected()) {
		Day d5 = new Day();
		 if(ftime1_5.isSelected()) {
			 d5.setT1(true);
		 }
		 if(ftime2_5.isSelected()) {
			 d5.setT2(true);
		 }
		 if(ftime3_5.isSelected()) {
			 d5.setT3(true);
		 }
		 if(ftime4_5.isSelected()) {
			 d5.setT4(true);
		 }
		 if(ftime5_5.isSelected()) {
			 d5.setT5(true);
		 }
		 RR1.setD5(d5);
		}
		 if(fal5.isSelected()) {
			 RR1.setF(true);
		 }
		 if(win5.isSelected()) {
			 RR1.setW(true);
		 }
       sch.setR5(RR1);
	}
	try{  // Catch errors in I/O if necessary.
		// Open a file to write to, named SavedObj.sav.
		FileOutputStream saveFile=new FileOutputStream("SaveSch.sav");

		// Create an ObjectOutputStream to put objects into save file.
		ObjectOutputStream save = new ObjectOutputStream(saveFile);
		save.writeObject(sch);
		save.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
		
	}
	public void createComponents() {

		
		JLabel pls = new JLabel("please determine which rooms are available and navigate to each avilable room's tab for more specifications , go to the submit tab when you are done.");
		panel.add(pls);
		panel.add(gym);
		panel.add(the);
		panel.add(lab);
		panel.add(caf);
		panel.add(lib);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		intro.add("intro",panel);
		add(intro);
		
		////////////////////room1
		
		
		panelR1.setLayout(new BorderLayout());
		
		panelR1.add(introR1,BorderLayout.CENTER);
		intro.add("Gym", panelR1);
		
		
		int n = intro.indexOfTab("Gym");
		intro.setEnabledAt(n, false);
		
		 ItemListener listener =new ClickListenerR1();
			gym.addItemListener(listener);
		
		panelR1_intro.setLayout(new BoxLayout(panelR1_intro, BoxLayout.Y_AXIS));
		JLabel expR1 =new JLabel("please determine the availability of the room and navigate to each day's tab forr more specifications");
		JLabel expR2 =new JLabel("please determine the availability of the room and navigate to each day's tab forr more specifications");
		JLabel expR3 =new JLabel("please determine the availability of the room and navigate to each day's tab forr more specifications");
		JLabel expR4 =new JLabel("please determine the availability of the room and navigate to each day's tab forr more specifications");
		JLabel expR5 =new JLabel("please determine the availability of the room and navigate to each day's tab forr more specifications");
		panelR1_intro.add(expR1);
		panelR1_intro.add(fal);
		fal.setSelected(true);
		panelR1_intro.add(win);
		
		 ItemListener listenerSem =new ClickListenerR1_sem();
		 fal.addItemListener(listenerSem);
		 win.addItemListener(listenerSem);
		 
		 JLabel expR1_2 =new JLabel("select which days are available and then navigate to their respective tabs to select the available time slots");
		 JLabel expR1_22 =new JLabel("select which days are available and then navigate to their respective tabs to select the available time slots");
		 JLabel expR1_23 =new JLabel("select which days are available and then navigate to their respective tabs to select the available time slots");
		 JLabel expR1_24 =new JLabel("select which days are available and then navigate to their respective tabs to select the available time slots");
		 JLabel expR1_25 =new JLabel("select which days are available and then navigate to their respective tabs to select the available time slots");
		 panelR1_intro.add(expR1_2);
		 panelR1_intro.add(day1);
		 panelR1_intro.add(day2);
		 panelR1_intro.add(day3);
		 panelR1_intro.add(day4);
		 panelR1_intro.add(day5);

		 
		 
		
		introR1.add("availability",panelR1_intro);
	//day 1	
		panelR1_d1.setLayout(new BoxLayout(panelR1_d1, BoxLayout.Y_AXIS));
		panelR1_d1.add(mtime1);
		panelR1_d1.add(mtime2);
		panelR1_d1.add(mtime3);
		panelR1_d1.add(mtime4);
		panelR1_d1.add(mtime5);
		panelR1_d1.add(R1d1b1);
		panelR1_d1.add(R1d1b2);
		panelR1_d1.add(R1d1b3);
		panelR1_d1.add(R1d1b4);
		ItemListener listenerR_D=new ClickListenerR_D();
		day1.addItemListener(listenerR_D);
		
		ActionListener lis1 =new CListenerR1D1B1();
		R1d1b1.addActionListener(lis1);
		ActionListener lis2 =new CListenerR1D1B2();
		R1d1b2.addActionListener(lis2);
		ActionListener lis3 =new CListenerR1D1B3();
		R1d1b3.addActionListener(lis3);
		ActionListener lis4 =new CListenerR1D1B4();
		R1d1b4.addActionListener(lis4);
		//R1d1b1.
		
		introR1.add("Monday",panelR1_d1);
//greyed out monday		
		int n1 = introR1.indexOfTab("Monday");
		introR1.setEnabledAt(n1, false);
		
		//day 2
		panelR1_d2.setLayout(new BoxLayout(panelR1_d2, BoxLayout.Y_AXIS));
		panelR1_d2.add(ttime1);
		panelR1_d2.add(ttime2);
		panelR1_d2.add(ttime3);
		panelR1_d2.add(ttime4);
		panelR1_d2.add(ttime5);
		panelR1_d2.add(R1d2b1);
		panelR1_d2.add(R1d2b2);
		panelR1_d2.add(R1d2b3);
		panelR1_d2.add(R1d2b4);
		day2.addItemListener(listenerR_D);
		
		ActionListener lis11 =new CListenerR1D2B1();
		R1d2b1.addActionListener(lis11);
		ActionListener lis21 =new CListenerR1D2B2();
		R1d2b2.addActionListener(lis21);
		ActionListener lis31 =new CListenerR1D2B3();
		R1d2b3.addActionListener(lis31);
		ActionListener lis41 =new CListenerR1D2B4();
		R1d2b4.addActionListener(lis41);
		
		introR1.add("Tuesday",panelR1_d2);
		//greyed out tuesday		
				int n2 = introR1.indexOfTab("Tuesday");
				introR1.setEnabledAt(n2, false);
				
				//day 3
				panelR1_d3.setLayout(new BoxLayout(panelR1_d3, BoxLayout.Y_AXIS));
				panelR1_d3.add(wtime1);
				panelR1_d3.add(wtime2);
				panelR1_d3.add(wtime3);
				panelR1_d3.add(wtime4);
				panelR1_d3.add(wtime5);
				panelR1_d3.add(R1d3b1);
				panelR1_d3.add(R1d3b2);
				panelR1_d3.add(R1d3b3);
				panelR1_d3.add(R1d3b4);
				day3.addItemListener(listenerR_D);
				
				ActionListener lis12 =new CListenerR1D3B1();
				R1d3b1.addActionListener(lis12);
				ActionListener lis22 =new CListenerR1D3B2();
				R1d3b2.addActionListener(lis22);
				ActionListener lis32 =new CListenerR1D3B3();
				R1d3b3.addActionListener(lis32);
				ActionListener lis42 =new CListenerR1D3B4();
				R1d3b4.addActionListener(lis42);
				
				introR1.add("Wednesday",panelR1_d3);
				//greyed out wednesday	
						int n3 = introR1.indexOfTab("Wednesday");
						introR1.setEnabledAt(n3, false);
						
						//day 4
						panelR1_d4.setLayout(new BoxLayout(panelR1_d4, BoxLayout.Y_AXIS));
						panelR1_d4.add(htime1);
						panelR1_d4.add(htime2);
						panelR1_d4.add(htime3);
						panelR1_d4.add(htime4);
						panelR1_d4.add(htime5);
						panelR1_d4.add(R1d4b1);
						panelR1_d4.add(R1d4b2);
						panelR1_d4.add(R1d4b3);
						panelR1_d4.add(R1d4b4);
						day4.addItemListener(listenerR_D);
						
						ActionListener lis13 =new CListenerR1D4B1();
						R1d4b1.addActionListener(lis13);
						ActionListener lis23 =new CListenerR1D4B2();
						R1d4b2.addActionListener(lis23);
						ActionListener lis33 =new CListenerR1D4B3();
						R1d4b3.addActionListener(lis33);
						ActionListener lis43 =new CListenerR1D4B4();
						R1d4b4.addActionListener(lis43);
						
						introR1.add("Thursday",panelR1_d4);
						//greyed out Thursday	
								int n4 = introR1.indexOfTab("Thursday");
								introR1.setEnabledAt(n4, false);
					
								
								
								//day 5
								panelR1_d5.setLayout(new BoxLayout(panelR1_d5, BoxLayout.Y_AXIS));
								panelR1_d5.add(ftime1);
								panelR1_d5.add(ftime2);
								panelR1_d5.add(ftime3);
								panelR1_d5.add(ftime4);
								panelR1_d5.add(ftime5);
								panelR1_d5.add(R1d5b1);
								panelR1_d5.add(R1d5b2);
								panelR1_d5.add(R1d5b3);
								panelR1_d5.add(R1d5b4);
								day5.addItemListener(listenerR_D);
								ActionListener lis14 =new CListenerR1D5B1();
								R1d5b1.addActionListener(lis14);
								ActionListener lis24 =new CListenerR1D5B2();
								R1d5b2.addActionListener(lis24);
								ActionListener lis34 =new CListenerR1D5B3();
								R1d5b3.addActionListener(lis34);
								ActionListener lis44 =new CListenerR1D5B4();
								R1d5b4.addActionListener(lis44);
								
								introR1.add("Friday",panelR1_d5);
								//greyed out Friday	
										int n5 = introR1.indexOfTab("Friday");
										introR1.setEnabledAt(n5, false);
	///////////////////////////////////////////////////////////////////////////room 1 finished							
		
								//////////rooom 2
		panelR2.setLayout(new BorderLayout());

		panelR2.add(introR2, BorderLayout.CENTER);
		intro.add("Theater", panelR2);

		int t = intro.indexOfTab("Theater");
		intro.setEnabledAt(t, false);

		ItemListener listener2 = new ClickListenerR2();
		the.addItemListener(listener2);

		panelR2_intro.setLayout(new BoxLayout(panelR2_intro, BoxLayout.Y_AXIS));
		panelR2_intro.add(expR2);

		panelR2_intro.add(fal2);
		fal2.setSelected(true);
		panelR2_intro.add(win2);

		ItemListener listenerSem2 = new ClickListenerR2_sem();
		fal2.addItemListener(listenerSem2);
		win2.addItemListener(listenerSem2);

		panelR2_intro.add(expR1_22);
		panelR2_intro.add(day1_2);
		panelR2_intro.add(day2_2);
		panelR2_intro.add(day3_2);
		panelR2_intro.add(day4_2);
		panelR2_intro.add(day5_2);
		


		introR2.add("availability", panelR2_intro);

		// day 1
		panelR2_d1.setLayout(new BoxLayout(panelR2_d1, BoxLayout.Y_AXIS));
		panelR2_d1.add(mtime1_2);
		panelR2_d1.add(mtime2_2);
		panelR2_d1.add(mtime3_2);
		panelR2_d1.add(mtime4_2);
		panelR2_d1.add(mtime5_2);
		panelR2_d1.add(R2d1b1);
		panelR2_d1.add(R2d1b2);
		panelR2_d1.add(R2d1b3);
		panelR2_d1.add(R2d1b4);
		ItemListener listenerR2_D = new ClickListenerR2_D();
		day1_2.addItemListener(listenerR2_D);
		
		ActionListener lis1_ =new CListenerR2D1B1();
		R2d1b1.addActionListener(lis1_);
		ActionListener lis2_ =new CListenerR2D1B2();
		R2d1b2.addActionListener(lis2_);
		ActionListener lis3_ =new CListenerR2D1B3();
		R2d1b3.addActionListener(lis3_);
		ActionListener lis4_ =new CListenerR2D1B4();
		R2d1b4.addActionListener(lis4_);

		introR2.add("Monday", panelR2_d1);
		// greyed out monday
		int t1 = introR2.indexOfTab("Monday");
		introR2.setEnabledAt(t1, false);

		// day 2
		panelR2_d2.setLayout(new BoxLayout(panelR2_d2, BoxLayout.Y_AXIS));
		panelR2_d2.add(ttime1_2);
		panelR2_d2.add(ttime2_2);
		panelR2_d2.add(ttime3_2);
		panelR2_d2.add(ttime4_2);
		panelR2_d2.add(ttime5_2);
		panelR2_d2.add(R2d2b1);
		panelR2_d2.add(R2d2b2);
		panelR2_d2.add(R2d2b3);
		panelR2_d2.add(R2d2b4);
		day2_2.addItemListener(listenerR2_D);
		
		ActionListener lis1_1 =new CListenerR2D2B1();
		R2d2b1.addActionListener(lis1_1);
		ActionListener lis2_1 =new CListenerR2D2B2();
		R2d2b2.addActionListener(lis2_1);
		ActionListener lis3_1 =new CListenerR2D2B3();
		R2d2b3.addActionListener(lis3_1);
		ActionListener lis4_1 =new CListenerR2D2B4();
		R2d2b4.addActionListener(lis4_1);

		introR2.add("Tuesday", panelR2_d2);
		// greyed out Tuesday
		int t2 = introR2.indexOfTab("Tuesday");
		introR2.setEnabledAt(t2, false);
		// day 3
		panelR2_d3.setLayout(new BoxLayout(panelR2_d3, BoxLayout.Y_AXIS));
		panelR2_d3.add(wtime1_2);
		panelR2_d3.add(wtime2_2);
		panelR2_d3.add(wtime3_2);
		panelR2_d3.add(wtime4_2);
		panelR2_d3.add(wtime5_2);
		panelR2_d3.add(R2d3b1);
		panelR2_d3.add(R2d3b2);
		panelR2_d3.add(R2d3b3);
		panelR2_d3.add(R2d3b4);
		day3_2.addItemListener(listenerR2_D);
		
		ActionListener lis1_2 =new CListenerR2D3B1();
		R2d3b1.addActionListener(lis1_2);
		ActionListener lis2_2 =new CListenerR2D3B2();
		R2d3b2.addActionListener(lis2_2);
		ActionListener lis3_2 =new CListenerR2D3B3();
		R2d3b3.addActionListener(lis3_2);
		ActionListener lis4_2 =new CListenerR2D3B4();
		R2d3b4.addActionListener(lis4_2);

		introR2.add("Wednesday", panelR2_d3);
		// greyed out Wednesday
		int t3 = introR2.indexOfTab("Wednesday");
		introR2.setEnabledAt(t3, false);

		// day 4
		panelR2_d4.setLayout(new BoxLayout(panelR2_d4, BoxLayout.Y_AXIS));
		panelR2_d4.add(htime1_2);
		panelR2_d4.add(htime2_2);
		panelR2_d4.add(htime3_2);
		panelR2_d4.add(htime4_2);
		panelR2_d4.add(htime5_2);
		panelR2_d4.add(R2d4b1);
		panelR2_d4.add(R2d4b2);
		panelR2_d4.add(R2d4b3);
		panelR2_d4.add(R2d4b4);
		day4_2.addItemListener(listenerR2_D);
		
		ActionListener lis1_3 =new CListenerR2D4B1();
		R2d4b1.addActionListener(lis1_3);
		ActionListener lis2_3 =new CListenerR2D4B2();
		R2d4b2.addActionListener(lis2_3);
		ActionListener lis3_3 =new CListenerR2D4B3();
		R2d4b3.addActionListener(lis3_3);
		ActionListener lis4_3 =new CListenerR2D4B4();
		R2d4b4.addActionListener(lis4_3);

		introR2.add("Thursday", panelR2_d4);
		// greyed out Thursday
		int t4 = introR2.indexOfTab("Thursday");
		introR2.setEnabledAt(t4, false);

		// day 5
		panelR2_d5.setLayout(new BoxLayout(panelR2_d5, BoxLayout.Y_AXIS));
		panelR2_d5.add(ftime1_2);
		panelR2_d5.add(ftime2_2);
		panelR2_d5.add(ftime3_2);
		panelR2_d5.add(ftime4_2);
		panelR2_d5.add(ftime5_2);
		panelR2_d5.add(R2d5b1);
		panelR2_d5.add(R2d5b2);
		panelR2_d5.add(R2d5b3);
		panelR2_d5.add(R2d5b4);
		day5_2.addItemListener(listenerR2_D);
		
		ActionListener lis1_4 =new CListenerR2D5B1();
		R2d5b1.addActionListener(lis1_4);
		ActionListener lis2_4 =new CListenerR2D5B2();
		R2d5b2.addActionListener(lis2_4);
		ActionListener lis3_4 =new CListenerR2D5B3();
		R2d5b3.addActionListener(lis3_4);
		ActionListener lis4_4 =new CListenerR2D5B4();
		R2d5b4.addActionListener(lis4_4);

		introR2.add("Friday", panelR2_d5);
		// greyed out Friday
		int t5 = introR2.indexOfTab("Friday");
		introR2.setEnabledAt(t5, false);
						///////////////////////////////////////////////////////////////////////////room 2 finished		
		
		//room 3
		
		panelR3.setLayout(new BorderLayout());

		panelR3.add(introR3, BorderLayout.CENTER);
		intro.add("Laboratory", panelR3);

		int s = intro.indexOfTab("Laboratory");
		intro.setEnabledAt(s, false);

		ItemListener listener3 = new ClickListenerR3();
	    lab.addItemListener(listener3);

		panelR3_intro.setLayout(new BoxLayout(panelR3_intro, BoxLayout.Y_AXIS));
		panelR3_intro.add(expR3);

		panelR3_intro.add(fal3);
		fal3.setSelected(true);
		panelR3_intro.add(win3);

		ItemListener listenerSem3 = new ClickListenerR3_sem();
		fal3.addItemListener(listenerSem3);
		win3.addItemListener(listenerSem3);

		panelR3_intro.add(expR1_23);
		panelR3_intro.add(day1_3);
		panelR3_intro.add(day2_3);
		panelR3_intro.add(day3_3);
		panelR3_intro.add(day4_3);
		panelR3_intro.add(day5_3);

		introR3.add("availability", panelR3_intro);

		// day 1
		panelR3_d1.setLayout(new BoxLayout(panelR3_d1, BoxLayout.Y_AXIS));
		panelR3_d1.add(mtime1_3);
		panelR3_d1.add(mtime2_3);
		panelR3_d1.add(mtime3_3);
		panelR3_d1.add(mtime4_3);
		panelR3_d1.add(mtime5_3);
		panelR3_d1.add(R3d1b1);
		panelR3_d1.add(R3d1b2);
		panelR3_d1.add(R3d1b3);
		panelR3_d1.add(R3d1b4);
		ItemListener listenerR3_D = new ClickListenerR3_D();
		day1_3.addItemListener(listenerR3_D);
		
		ActionListener lis_1 =new CListenerR3D1B1();
		R3d1b1.addActionListener(lis_1);
		ActionListener lis_2 =new CListenerR3D1B2();
		R3d1b2.addActionListener(lis_2);
		ActionListener lis_3 =new CListenerR3D1B3();
		R3d1b3.addActionListener(lis_3);
		ActionListener lis_4 =new CListenerR3D1B4();
		R3d1b4.addActionListener(lis_4);

		introR3.add("Monday", panelR3_d1);
		// greyed out monday
		int s1 = introR3.indexOfTab("Monday");
		introR3.setEnabledAt(s1, false);

		// day 2
		panelR3_d2.setLayout(new BoxLayout(panelR3_d2, BoxLayout.Y_AXIS));
		panelR3_d2.add(ttime1_3);
		panelR3_d2.add(ttime2_3);
		panelR3_d2.add(ttime3_3);
		panelR3_d2.add(ttime4_3);
		panelR3_d2.add(ttime5_3);
		panelR3_d2.add(R3d2b1);
		panelR3_d2.add(R3d2b2);
		panelR3_d2.add(R3d2b3);
		panelR3_d2.add(R3d2b4);
		day2_3.addItemListener(listenerR3_D);
		
		ActionListener lis_11 =new CListenerR3D2B1();
		R3d2b1.addActionListener(lis_11);
		ActionListener lis_21 =new CListenerR3D2B2();
		R3d2b2.addActionListener(lis_21);
		ActionListener lis_31 =new CListenerR3D2B3();
		R3d2b3.addActionListener(lis_31);
		ActionListener lis_41 =new CListenerR3D2B4();
		R3d2b4.addActionListener(lis_41);

		introR3.add("Tuesday", panelR3_d2);
		// greyed out Tuesday
		int s2 = introR3.indexOfTab("Tuesday");
		introR3.setEnabledAt(s2, false);
		// day 3
		panelR3_d3.setLayout(new BoxLayout(panelR3_d3, BoxLayout.Y_AXIS));
		panelR3_d3.add(wtime1_3);
		panelR3_d3.add(wtime2_3);
		panelR3_d3.add(wtime3_3);
		panelR3_d3.add(wtime4_3);
		panelR3_d3.add(wtime5_3);
		panelR3_d3.add(R3d3b1);
		panelR3_d3.add(R3d3b2);
		panelR3_d3.add(R3d3b3);
		panelR3_d3.add(R3d3b4);
		day3_3.addItemListener(listenerR3_D);
		
		ActionListener lis_12 =new CListenerR3D3B1();
		R3d3b1.addActionListener(lis_12);
		ActionListener lis_22 =new CListenerR3D3B2();
		R3d3b2.addActionListener(lis_22);
		ActionListener lis_32 =new CListenerR3D3B3();
		R3d3b3.addActionListener(lis_32);
		ActionListener lis_42 =new CListenerR3D3B4();
		R3d3b4.addActionListener(lis_42);

		introR3.add("Wednesday", panelR3_d3);
		// greyed out Wednesday
		int s3 = introR3.indexOfTab("Wednesday");
		introR3.setEnabledAt(s3, false);

		// day 4
		panelR3_d4.setLayout(new BoxLayout(panelR3_d4, BoxLayout.Y_AXIS));
		panelR3_d4.add(htime1_3);
		panelR3_d4.add(htime2_3);
		panelR3_d4.add(htime3_3);
		panelR3_d4.add(htime4_3);
		panelR3_d4.add(htime5_3);
		panelR3_d4.add(R3d4b1);
		panelR3_d4.add(R3d4b2);
		panelR3_d4.add(R3d4b3);
		panelR3_d4.add(R3d4b4);
		day4_3.addItemListener(listenerR3_D);
		
		ActionListener lis_13 =new CListenerR3D4B1();
		R3d4b1.addActionListener(lis_13);
		ActionListener lis_23 =new CListenerR3D4B2();
		R3d4b2.addActionListener(lis_23);
		ActionListener lis_33 =new CListenerR3D4B3();
		R3d4b3.addActionListener(lis_33);
		ActionListener lis_43 =new CListenerR3D4B4();
		R3d4b4.addActionListener(lis_43);

		introR3.add("Thursday", panelR3_d4);
		// greyed out Thursday
		int s4 = introR3.indexOfTab("Thursday");
		introR3.setEnabledAt(s4, false);

		// day 5
		panelR3_d5.setLayout(new BoxLayout(panelR3_d5, BoxLayout.Y_AXIS));
		panelR3_d5.add(ftime1_3);
		panelR3_d5.add(ftime2_3);
		panelR3_d5.add(ftime3_3);
		panelR3_d5.add(ftime4_3);
		panelR3_d5.add(ftime5_3);
		panelR3_d1.add(R2d5b1);
		panelR3_d1.add(R2d5b2);
		panelR3_d1.add(R2d5b3);
		panelR3_d1.add(R2d5b4);
		day5_3.addItemListener(listenerR3_D);
		
		ActionListener lis_14 =new CListenerR3D5B1();
		R3d5b1.addActionListener(lis_14);
		ActionListener lis_24 =new CListenerR3D5B2();
		R3d5b2.addActionListener(lis_24);
		ActionListener lis_34 =new CListenerR3D5B3();
		R3d5b3.addActionListener(lis_34);
		ActionListener lis_44 =new CListenerR3D5B4();
		R3d5b4.addActionListener(lis_44);

		introR3.add("Friday", panelR3_d5);
		// greyed out Friday
		int s5 = introR3.indexOfTab("Friday");
		introR3.setEnabledAt(s5, false);
		///////room 4
		
		panelR4.setLayout(new BorderLayout());

		panelR4.add(introR4, BorderLayout.CENTER);
		intro.add("Cafeteria", panelR4);

		int m = intro.indexOfTab("Cafeteria");
		intro.setEnabledAt(m, false);

		ItemListener listener4 = new ClickListenerR4();
		caf.addItemListener(listener4);

		panelR4_intro.setLayout(new BoxLayout(panelR4_intro, BoxLayout.Y_AXIS));
		panelR4_intro.add(expR4);

		panelR4_intro.add(fal4);
		fal4.setSelected(true);
		panelR4_intro.add(win4);

		ItemListener listenerSem4 = new ClickListenerR4_sem();
		fal4.addItemListener(listenerSem4);
		win4.addItemListener(listenerSem4);

		panelR4_intro.add(expR1_24);
		panelR4_intro.add(day1_4);
		panelR4_intro.add(day2_4);
		panelR4_intro.add(day3_4);
		panelR4_intro.add(day4_4);
		panelR4_intro.add(day5_4);

		introR4.add("availability", panelR4_intro);

		// day 1
		panelR4_d1.setLayout(new BoxLayout(panelR4_d1, BoxLayout.Y_AXIS));
		panelR4_d1.add(mtime1_4);
		panelR4_d1.add(mtime2_4);
		panelR4_d1.add(mtime3_4);
		panelR4_d1.add(mtime4_4);
		panelR4_d1.add(mtime5_4);
		panelR4_d1.add(R4d1b1);
		panelR4_d1.add(R4d1b2);
		panelR4_d1.add(R4d1b3);
		panelR4_d1.add(R4d1b4);
		ItemListener listenerR4_D = new ClickListenerR4_D();
		day1_4.addItemListener(listenerR4_D);
		
		ActionListener lis1_11 =new CListenerR4D1B1();
		R4d1b1.addActionListener(lis1_11);
		ActionListener lis1_21 =new CListenerR4D1B2();
		R4d1b2.addActionListener(lis1_21);
		ActionListener lis1_31 =new CListenerR4D1B3();
		R4d1b3.addActionListener(lis1_31);
		ActionListener lis1_41 =new CListenerR4D1B4();
		R4d1b4.addActionListener(lis1_41);

		introR4.add("Monday", panelR4_d1);
		// greyed out monday
		int m1 = introR4.indexOfTab("Monday");
		introR4.setEnabledAt(m1, false);

		// day 2
		panelR4_d2.setLayout(new BoxLayout(panelR4_d2, BoxLayout.Y_AXIS));
		panelR4_d2.add(ttime1_4);
		panelR4_d2.add(ttime2_4);
		panelR4_d2.add(ttime3_4);
		panelR4_d2.add(ttime4_4);
		panelR4_d2.add(ttime5_4);
		panelR4_d2.add(R4d2b1);
		panelR4_d2.add(R4d2b2);
		panelR4_d2.add(R4d2b3);
		panelR4_d2.add(R4d2b4);
		day2_4.addItemListener(listenerR4_D);
		
		ActionListener lis1_12 =new CListenerR4D2B1();
		R4d2b1.addActionListener(lis1_12);
		ActionListener lis1_22 =new CListenerR4D2B2();
		R4d2b2.addActionListener(lis1_22);
		ActionListener lis1_32 =new CListenerR4D2B3();
		R4d2b3.addActionListener(lis1_32);
		ActionListener lis1_42 =new CListenerR4D2B4();
		R4d2b4.addActionListener(lis1_42);

		introR4.add("Tuesday", panelR4_d2);
		// greyed out Tuesday
		int m2 = introR4.indexOfTab("Tuesday");
		introR4.setEnabledAt(m2, false);
		// day 3
		panelR4_d3.setLayout(new BoxLayout(panelR4_d3, BoxLayout.Y_AXIS));
		panelR4_d3.add(wtime1_4);
		panelR4_d3.add(wtime2_4);
		panelR4_d3.add(wtime3_4);
		panelR4_d3.add(wtime4_4);
		panelR4_d3.add(wtime5_4);
		panelR4_d3.add(R4d3b1);
		panelR4_d3.add(R4d3b2);
		panelR4_d3.add(R4d3b3);
		panelR4_d3.add(R4d3b4);
		day3_4.addItemListener(listenerR4_D);
		
		ActionListener lis1_13 =new CListenerR4D3B1();
		R4d3b1.addActionListener(lis1_13);
		ActionListener lis1_23 =new CListenerR4D3B2();
		R4d3b2.addActionListener(lis1_23);
		ActionListener lis1_33 =new CListenerR4D3B3();
		R4d3b3.addActionListener(lis1_33);
		ActionListener lis1_43 =new CListenerR4D3B4();
		R4d3b4.addActionListener(lis1_43);

		introR4.add("Wednesday", panelR4_d3);
		// greyed out Wednesday
		int m3 = introR4.indexOfTab("Wednesday");
		introR4.setEnabledAt(m3, false);

		// day 4
		panelR4_d4.setLayout(new BoxLayout(panelR4_d4, BoxLayout.Y_AXIS));
		panelR4_d4.add(htime1_4);
		panelR4_d4.add(htime2_4);
		panelR4_d4.add(htime3_4);
		panelR4_d4.add(htime4_4);
		panelR4_d4.add(htime5_4);
		panelR4_d4.add(R4d4b1);
		panelR4_d4.add(R4d4b2);
		panelR4_d4.add(R4d4b3);
		panelR4_d4.add(R4d4b4);
		day4_4.addItemListener(listenerR4_D);
		
		ActionListener lis1_14 =new CListenerR4D4B1();
		R4d4b1.addActionListener(lis1_14);
		ActionListener lis1_24 =new CListenerR4D4B2();
		R4d4b2.addActionListener(lis1_24);
		ActionListener lis1_34 =new CListenerR4D4B3();
		R4d4b3.addActionListener(lis1_34);
		ActionListener lis1_44 =new CListenerR4D4B4();
		R4d4b4.addActionListener(lis1_44);

		introR4.add("Thursday", panelR4_d4);
		// greyed out Thursday
		int m4 = introR4.indexOfTab("Thursday");
		introR4.setEnabledAt(m4, false);

		// day 5
		panelR4_d5.setLayout(new BoxLayout(panelR4_d5, BoxLayout.Y_AXIS));
		panelR4_d5.add(ftime1_4);
		panelR4_d5.add(ftime2_4);
		panelR4_d5.add(ftime3_4);
		panelR4_d5.add(ftime4_4);
		panelR4_d5.add(ftime5_4);
		panelR4_d5.add(R4d5b1);
		panelR4_d5.add(R4d5b2);
		panelR4_d5.add(R4d5b3);
		panelR4_d5.add(R4d5b4);
		day5_4.addItemListener(listenerR4_D);
		
		ActionListener lis1_15 =new CListenerR4D5B1();
		R4d5b1.addActionListener(lis1_15);
		ActionListener lis1_25 =new CListenerR4D5B2();
		R4d5b2.addActionListener(lis1_25);
		ActionListener lis1_35 =new CListenerR4D5B3();
		R4d5b3.addActionListener(lis1_35);
		ActionListener lis1_45 =new CListenerR4D5B4();
		R4d5b4.addActionListener(lis1_45);

		introR4.add("Friday", panelR4_d5);
		// greyed out Friday
		int m5 = introR4.indexOfTab("Friday");
		introR4.setEnabledAt(m5, false);
					////////////////////////////////////////////////////
		
		//room 5
				
		panelR5.setLayout(new BorderLayout());

		panelR5.add(introR5, BorderLayout.CENTER);
		intro.add("Library",panelR5);

		int l = intro.indexOfTab("Library");
		intro.setEnabledAt(l, false);

		ItemListener listener5 = new ClickListenerR5();
		lib.addItemListener(listener5);

		panelR5_intro.setLayout(new BoxLayout(panelR5_intro, BoxLayout.Y_AXIS));
		panelR5_intro.add(expR5);

		panelR5_intro.add(fal5);
		fal5.setSelected(true);
		panelR5_intro.add(win5);

		ItemListener listenerSem5 = new ClickListenerR5_sem();
		fal5.addItemListener(listenerSem5);
		win5.addItemListener(listenerSem5);

		panelR5_intro.add(expR1_25);
		panelR5_intro.add(day1_5);
		panelR5_intro.add(day2_5);
		panelR5_intro.add(day3_5);
		panelR5_intro.add(day4_5);
		panelR5_intro.add(day5_5);

		introR5.add("availability", panelR5_intro);

		// day 1
		panelR5_d1.setLayout(new BoxLayout(panelR5_d1, BoxLayout.Y_AXIS));
		panelR5_d1.add(mtime1_5);
		panelR5_d1.add(mtime2_5);
		panelR5_d1.add(mtime3_5);
		panelR5_d1.add(mtime4_5);
		panelR5_d1.add(mtime5_5);
		panelR5_d1.add(R5d1b1);
		panelR5_d1.add(R5d1b2);
		panelR5_d1.add(R5d1b3);
		panelR5_d1.add(R5d1b4);
		ItemListener listenerR5_D = new ClickListenerR5_D();
		day1_5.addItemListener(listenerR5_D);
		
		ActionListener lis2_11 =new CListenerR5D1B1();
		R5d1b1.addActionListener(lis2_11);
		ActionListener lis2_21 =new CListenerR5D1B2();
		R5d1b2.addActionListener(lis2_21);
		ActionListener lis2_31 =new CListenerR5D1B3();
		R5d1b3.addActionListener(lis2_31);
		ActionListener lis2_41 =new CListenerR5D1B4();
		R5d1b4.addActionListener(lis2_41);

		introR5.add("Monday", panelR5_d1);
		// greyed out monday
		int l1 = introR5.indexOfTab("Monday");
		introR5.setEnabledAt(l1, false);

		// day 2
		panelR5_d2.setLayout(new BoxLayout(panelR5_d2, BoxLayout.Y_AXIS));
		panelR5_d2.add(ttime1_5);
		panelR5_d2.add(ttime2_5);
		panelR5_d2.add(ttime3_5);
		panelR5_d2.add(ttime4_5);
		panelR5_d2.add(ttime5_5);
		panelR5_d2.add(R5d2b1);
		panelR5_d2.add(R5d2b2);
		panelR5_d2.add(R5d2b3);
		panelR5_d2.add(R5d2b4);
		day2_5.addItemListener(listenerR5_D);
		
		ActionListener lis2_12 =new CListenerR5D2B1();
		R5d2b1.addActionListener(lis2_12);
		ActionListener lis2_22 =new CListenerR5D2B2();
		R5d2b2.addActionListener(lis2_22);
		ActionListener lis2_32 =new CListenerR5D2B3();
		R5d2b3.addActionListener(lis2_32);
		ActionListener lis2_42 =new CListenerR5D2B4();
		R5d2b4.addActionListener(lis2_42);

		introR5.add("Tuesday", panelR5_d2);
		// greyed out Tuesday
		int l2 = introR5.indexOfTab("Tuesday");
		introR5.setEnabledAt(l2, false);
		// day 3
		panelR5_d3.setLayout(new BoxLayout(panelR5_d3, BoxLayout.Y_AXIS));
		panelR5_d3.add(wtime1_5);
		panelR5_d3.add(wtime2_5);
		panelR5_d3.add(wtime3_5);
		panelR5_d3.add(wtime4_5);
		panelR5_d3.add(wtime5_5);
		panelR5_d3.add(R5d3b1);
		panelR5_d3.add(R5d3b2);
		panelR5_d3.add(R5d3b3);
		panelR5_d3.add(R5d3b4);
		day3_5.addItemListener(listenerR5_D);
		
		ActionListener lis2_13 =new CListenerR5D3B1();
		R5d3b1.addActionListener(lis2_13);
		ActionListener lis2_23 =new CListenerR5D3B2();
		R5d3b2.addActionListener(lis2_23);
		ActionListener lis2_33 =new CListenerR5D3B3();
		R5d3b3.addActionListener(lis2_33);
		ActionListener lis2_43 =new CListenerR5D3B4();
		R5d3b4.addActionListener(lis2_43);

		introR5.add("Wednesday", panelR5_d3);
		// greyed out Wednesday
		int l3 = introR5.indexOfTab("Wednesday");
		introR5.setEnabledAt(l3, false);

		// day 4
		panelR5_d4.setLayout(new BoxLayout(panelR5_d4, BoxLayout.Y_AXIS));
		panelR5_d4.add(htime1_5);
		panelR5_d4.add(htime2_5);
		panelR5_d4.add(htime3_5);
		panelR5_d4.add(htime4_5);
		panelR5_d4.add(htime5_5);
		panelR5_d4.add(R5d4b1);
		panelR5_d4.add(R5d4b2);
		panelR5_d4.add(R5d4b3);
		panelR5_d4.add(R5d4b4);
		day4_5.addItemListener(listenerR5_D);
		
		ActionListener lis2_14 =new CListenerR5D4B1();
		R5d4b1.addActionListener(lis2_14);
		ActionListener lis2_24 =new CListenerR5D4B2();
		R5d4b2.addActionListener(lis2_24);
		ActionListener lis2_34 =new CListenerR5D4B3();
		R5d4b3.addActionListener(lis2_34);
		ActionListener lis2_44 =new CListenerR5D4B4();
		R5d4b4.addActionListener(lis2_44);

		introR5.add("Thursday", panelR5_d4);
		// greyed out Thursday
		int l4 = introR5.indexOfTab("Thursday");
		introR5.setEnabledAt(l4, false);

		// day 5
		panelR5_d5.setLayout(new BoxLayout(panelR5_d5, BoxLayout.Y_AXIS));
		panelR5_d5.add(ftime1_5);
		panelR5_d5.add(ftime2_5);
		panelR5_d5.add(ftime3_5);
		panelR5_d5.add(ftime4_5);
		panelR5_d5.add(ftime5_5);
		panelR5_d5.add(R5d5b1);
		panelR5_d5.add(R5d5b2);
		panelR5_d5.add(R5d5b3);
		panelR5_d5.add(R5d5b4);
		day5_5.addItemListener(listenerR5_D);
		
		ActionListener lis2_15 =new CListenerR5D5B1();
		R5d5b1.addActionListener(lis2_15);
		ActionListener lis2_25 =new CListenerR5D5B2();
		R5d5b2.addActionListener(lis2_25);
		ActionListener lis2_35 =new CListenerR5D5B3();
		R5d5b3.addActionListener(lis2_35);
		ActionListener lis2_45 =new CListenerR5D5B4();
		R5d5b4.addActionListener(lis2_45);

		introR5.add("Friday", panelR5_d5);
		// greyed out Friday
		int l5 = introR5.indexOfTab("Friday");
		introR5.setEnabledAt(l5, false);
		
		JPanel submit = new JPanel();
		JButton submitb=new JButton("Submit");
		submit.add(submitb);
		intro.add("submit", submit);
		ActionListener lissubmit =new CListenersub();
		submitb.addActionListener(lissubmit);
		
	}
	
	
	//room 1 click listeners
	  class ClickListenerR1 implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(!gym.isSelected()) {
					int n = intro.indexOfTab("Gym");
					intro.setEnabledAt(n, false);
			}
				else if( gym.isSelected()){
					int n = intro.indexOfTab("Gym");
					intro.setEnabledAt(n, true);
			
			  
		  }
			}
		  }
	  
	  class ClickListenerR1_sem implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(fal.isSelected() || win.isSelected()) {
			}
				else if( !fal.isSelected() & !win.isSelected()){
					JOptionPane.showMessageDialog(null, "since the room is available , at least 1 semester should be selected(you can't uncheck all boxes at the same time ), fall has been selected automatically");
					fal.setSelected(true);
			  
		  }
			}
		  }
	  
	  //
	  
	  //room 2 click listener
	  
	  class ClickListenerR2 implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(!the.isSelected()) {
					int n = intro.indexOfTab("Theater");
					intro.setEnabledAt(n, false);
			}
				else if( the.isSelected()){
					int n = intro.indexOfTab("Theater");
					intro.setEnabledAt(n, true);
			
			  
		  }
			}
		  }
	  
	  class ClickListenerR2_sem implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(fal2.isSelected() || win2.isSelected()) {
			}
				else if( !fal2.isSelected() & !win2.isSelected()){
					JOptionPane.showMessageDialog(null, "since the room is available , at least 1 semester should be selected(you can't uncheck all boxes at the same time ), fall has been selected automatically");
					fal2.setSelected(true);
			  
		  }
			}
		  }
	  
	  //room3
	  
	  
	  class ClickListenerR3 implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(!lab.isSelected()) {
					int n = intro.indexOfTab("Laboratory");
					intro.setEnabledAt(n, false);
			}
				else if( lab.isSelected()){
					int n = intro.indexOfTab("Laboratory");
					intro.setEnabledAt(n, true);
			
			  
		  }
			}
		  }
	  
	  class ClickListenerR3_sem implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(fal3.isSelected() || win3.isSelected()) {
			}
				else if( !fal3.isSelected() & !win3.isSelected()){
					JOptionPane.showMessageDialog(null, "since the room is available , at least 1 semester should be selected(you can't uncheck all boxes at the same time ), fall has been selected automatically");
					fal3.setSelected(true);
			  
		  }
			}
		  }
	  
	  
	  //room4
	  
	  class ClickListenerR4 implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(!caf.isSelected()) {
					int n = intro.indexOfTab("Cafeteria");
					intro.setEnabledAt(n, false);
			}
				else if( caf.isSelected()){
					int n = intro.indexOfTab("Cafeteria");
					intro.setEnabledAt(n, true);
			
			  
		  }
			}
		  }
	  
	  class ClickListenerR4_sem implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(fal4.isSelected() || win4.isSelected()) {
			}
				else if( !fal4.isSelected() & !win4.isSelected()){
					JOptionPane.showMessageDialog(null, "since the room is available , at least 1 semester should be selected(you can't uncheck all boxes at the same time ), fall has been selected automatically");
					fal4.setSelected(true);
			  
		  }
			}
		  }
	  
	  
	  //room5
	  
	  class ClickListenerR5 implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(!lib.isSelected()) {
					int n = intro.indexOfTab("Library");
					intro.setEnabledAt(n, false);
			}
				else if( lib.isSelected()){
					int n = intro.indexOfTab("Library");
					intro.setEnabledAt(n, true);
			
			  
		  }
			}
		  }
	  
	  class ClickListenerR5_sem implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(fal5.isSelected() || win5.isSelected()) {
			}
				else if( !fal5.isSelected() & !win5.isSelected()){
					JOptionPane.showMessageDialog(null, "since the room is available , at least 1 semester should be selected(you can't uncheck all boxes at the same time ), fall has been selected automatically");
					fal5.setSelected(true);
			  
		  }
			}
		  }
	    
	  //
	  class ClickListenerR_D implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(!day1.isSelected()) {
					int n = introR1.indexOfTab("Monday");
					introR1.setEnabledAt(n, false);
			}
				 if( day1.isSelected()){
					int n = introR1.indexOfTab("Monday");
					introR1.setEnabledAt(n, true);
			  
		  }
					if(!day2.isSelected()) {
						int n = introR1.indexOfTab("Tuesday");
						introR1.setEnabledAt(n, false);
				}
					 if( day2.isSelected()){
						int n = introR1.indexOfTab("Tuesday");
						introR1.setEnabledAt(n, true);
				  
			  }
					if(!day3.isSelected()) {
							int n = introR1.indexOfTab("Wednesday");
							introR1.setEnabledAt(n, false);
					}
						 if( day3.isSelected()){
							int n = introR1.indexOfTab("Wednesday");
							introR1.setEnabledAt(n, true);
					  
				  }
							if(!day4.isSelected()) {
						int n = introR1.indexOfTab("Thursday");
								introR1.setEnabledAt(n, false);
						}
							 if( day4.isSelected()){
								int n = introR1.indexOfTab("Thursday");
								introR1.setEnabledAt(n, true);
						  
					  }
								if(!day5.isSelected()) {
									int n = introR1.indexOfTab("Friday");
									introR1.setEnabledAt(n, false);
							}
								 if( day5.isSelected()){
									int n = introR1.indexOfTab("Friday");
									introR1.setEnabledAt(n, true);
							  
						  }

			}
		  }
	  
	  class ClickListenerR2_D implements ItemListener{

			@Override
		public void itemStateChanged(ItemEvent e) {
			if (!day1_2.isSelected()) {
				int n = introR2.indexOfTab("Monday");
				introR2.setEnabledAt(n, false);
			}
			if (day1_2.isSelected()) {
				int n = introR2.indexOfTab("Monday");
				introR2.setEnabledAt(n, true);

			}
			if (!day2_2.isSelected()) {
				int n = introR2.indexOfTab("Tuesday");
				introR2.setEnabledAt(n, false);
			}
			if (day2_2.isSelected()) {
				int n = introR2.indexOfTab("Tuesday");
				introR2.setEnabledAt(n, true);

			}
			if (!day3_2.isSelected()) {
				int n = introR2.indexOfTab("Wednesday");
				introR2.setEnabledAt(n, false);
			}
			if (day3_2.isSelected()) {
				int n = introR2.indexOfTab("Wednesday");
				introR2.setEnabledAt(n, true);

			}
			if (!day4_2.isSelected()) {
				int n = introR2.indexOfTab("Thursday");
				introR2.setEnabledAt(n, false);
			}
			if (day4_2.isSelected()) {
				int n = introR2.indexOfTab("Thursday");
				introR2.setEnabledAt(n, true);

			}
			if (!day5_2.isSelected()) {
				int n = introR2.indexOfTab("Friday");
				introR2.setEnabledAt(n, false);
			}
			if (day5_2.isSelected()) {
				int n = introR2.indexOfTab("Friday");
				introR2.setEnabledAt(n, true);

			}

		}
		  }
	  
	  class ClickListenerR3_D implements ItemListener{

			@Override
		public void itemStateChanged(ItemEvent e) {
			if (!day1_3.isSelected()) {
				int n = introR3.indexOfTab("Monday");
				introR3.setEnabledAt(n, false);
			}
			if (day1_3.isSelected()) {
				int n = introR3.indexOfTab("Monday");
				introR3.setEnabledAt(n, true);

			}
			if (!day2_3.isSelected()) {
				int n = introR3.indexOfTab("Tuesday");
				introR3.setEnabledAt(n, false);
			}
			if (day2_3.isSelected()) {
				int n = introR3.indexOfTab("Tuesday");
				introR3.setEnabledAt(n, true);

			}
			if (!day3_3.isSelected()) {
				int n = introR3.indexOfTab("Wednesday");
				introR3.setEnabledAt(n, false);
			}
			if (day3_3.isSelected()) {
				int n = introR3.indexOfTab("Wednesday");
				introR3.setEnabledAt(n, true);

			}
			if (!day4_3.isSelected()) {
				int n = introR3.indexOfTab("Thursday");
				introR3.setEnabledAt(n, false);
			}
			if (day4_3.isSelected()) {
				int n = introR3.indexOfTab("Thursday");
				introR3.setEnabledAt(n, true);

			}
			if (!day5_3.isSelected()) {
				int n = introR3.indexOfTab("Friday");
				introR3.setEnabledAt(n, false);
			}
			if (day5_3.isSelected()) {
				int n = introR3.indexOfTab("Friday");
				introR3.setEnabledAt(n, true);

			}

		}
		  }
	  
	  
	  class ClickListenerR4_D implements ItemListener{

			@Override
		public void itemStateChanged(ItemEvent e) {
			if (!day1_4.isSelected()) {
				int n = introR4.indexOfTab("Monday");
				introR4.setEnabledAt(n, false);
			}
			if (day1_4.isSelected()) {
				int n = introR4.indexOfTab("Monday");
				introR4.setEnabledAt(n, true);

			}
			if (!day2_4.isSelected()) {
				int n = introR4.indexOfTab("Tuesday");
				introR4.setEnabledAt(n, false);
			}
			if (day2_4.isSelected()) {
				int n = introR4.indexOfTab("Tuesday");
				introR4.setEnabledAt(n, true);

			}
			if (!day3_4.isSelected()) {
				int n = introR4.indexOfTab("Wednesday");
				introR4.setEnabledAt(n, false);
			}
			if (day3_4.isSelected()) {
				int n = introR4.indexOfTab("Wednesday");
				introR4.setEnabledAt(n, true);

			}
			if (!day4_4.isSelected()) {
				int n = introR4.indexOfTab("Thursday");
				introR4.setEnabledAt(n, false);
			}
			if (day4_4.isSelected()) {
				int n = introR4.indexOfTab("Thursday");
				introR4.setEnabledAt(n, true);

			}
			if (!day5_4.isSelected()) {
				int n = introR4.indexOfTab("Friday");
				introR4.setEnabledAt(n, false);
			}
			if (day5_4.isSelected()) {
				int n = introR4.indexOfTab("Friday");
				introR4.setEnabledAt(n, true);

			}

		}
		  }
	  
	  
	  class ClickListenerR5_D implements ItemListener{

			@Override
		public void itemStateChanged(ItemEvent e) {
			if (!day1_5.isSelected()) {
				int n = introR5.indexOfTab("Monday");
				introR5.setEnabledAt(n, false);
			}
			if (day1_5.isSelected()) {
				int n = introR5.indexOfTab("Monday");
				introR5.setEnabledAt(n, true);

			}
			if (!day2_5.isSelected()) {
				int n = introR5.indexOfTab("Tuesday");
				introR5.setEnabledAt(n, false);
			}
			if (day2_5.isSelected()) {
				int n = introR5.indexOfTab("Tuesday");
				introR5.setEnabledAt(n, true);

			}
			if (!day3_5.isSelected()) {
				int n = introR5.indexOfTab("Wednesday");
				introR5.setEnabledAt(n, false);
			}
			if (day3_5.isSelected()) {
				int n = introR5.indexOfTab("Wednesday");
				introR5.setEnabledAt(n, true);

			}
			if (!day4_5.isSelected()) {
				int n = introR5.indexOfTab("Thursday");
				introR5.setEnabledAt(n, false);
			}
			if (day4_5.isSelected()) {
				int n = introR5.indexOfTab("Thursday");
				introR5.setEnabledAt(n, true);

			}
			if (!day5_5.isSelected()) {
				int n = introR5.indexOfTab("Friday");
				introR5.setEnabledAt(n, false);
			}
			if (day5_5.isSelected()) {
				int n = introR5.indexOfTab("Friday");
				introR5.setEnabledAt(n, true);

			}

		}
		  }
	  
	  
	  //// convenience buttons listeners
	  //R1 day 1
	  class CListenerR1D1B1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(mtime1.isSelected()) {
				ttime1.setSelected(true);
				
			}
			else {
				ttime1.setSelected(false);
			}
			
			if(mtime2.isSelected()) {
				ttime2.setSelected(true);
				
			}
			else {
				ttime2.setSelected(false);
			}
			if(mtime3.isSelected()) {
				ttime3.setSelected(true);
				
			}
			else {
				ttime3.setSelected(false);
			}
			if(mtime4.isSelected()) {
				ttime4.setSelected(true);
				
			}
			else {
				ttime4.setSelected(false);
			}
			
			if(mtime5.isSelected()) {
				ttime5.setSelected(true);
				
			}
			else {
				ttime5.setSelected(false);
			}
			
		}
		  
	  }
	  
	  class CListenerR1D1B2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(mtime1.isSelected()) {
				wtime1.setSelected(true);
				
			}
			else {
				wtime1.setSelected(false);
			}
			
			if(mtime2.isSelected()) {
				wtime2.setSelected(true);
				
			}
			else {
				wtime2.setSelected(false);
			}
			if(mtime3.isSelected()) {
				wtime3.setSelected(true);
				
			}
			else {
				wtime3.setSelected(false);
			}
			if(mtime4.isSelected()) {
				wtime4.setSelected(true);
				
			}
			else {
				wtime4.setSelected(false);
			}
			
			if(mtime5.isSelected()) {
				wtime5.setSelected(true);
				
			}
			else {
				wtime5.setSelected(false);
			}
			
		}
			
		}
	  
	  class CListenerR1D1B3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(mtime1.isSelected()) {
				htime1.setSelected(true);
				
			}
			else {
				htime1.setSelected(false);
			}
			
			if(mtime2.isSelected()) {
				htime2.setSelected(true);
				
			}
			else {
				htime2.setSelected(false);
			}
			if(mtime3.isSelected()) {
				htime3.setSelected(true);
				
			}
			else {
				htime3.setSelected(false);
			}
			if(mtime4.isSelected()) {
				htime4.setSelected(true);
				
			}
			else {
				htime4.setSelected(false);
			}
			
			if(mtime5.isSelected()) {
				htime5.setSelected(true);
				
			}
			else {
				htime5.setSelected(false);
			}
			
		}
		  
	  }
	  class CListenerR1D1B4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(mtime1.isSelected()) {
				ftime1.setSelected(true);
				
			}
			else {
				ftime1.setSelected(false);
			}
			
			if(mtime2.isSelected()) {
				ftime2.setSelected(true);
				
			}
			else {
				ftime2.setSelected(false);
			}
			if(mtime3.isSelected()) {
				ftime3.setSelected(true);
				
			}
			else {
				ftime3.setSelected(false);
			}
			if(mtime4.isSelected()) {
				ftime4.setSelected(true);
				
			}
			else {
				ftime4.setSelected(false);
			}
			
			if(mtime5.isSelected()) {
				ftime5.setSelected(true);
				
			}
			else {
				ftime5.setSelected(false);
			}
			
		}
		  
	  }
	  
	  //R1 day 2
	  
	  class CListenerR1D2B1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent event) {
				if(ttime1.isSelected()) {
					mtime1.setSelected(true);
					
				}
				else {
					mtime1.setSelected(false);
				}
				
				if(ttime2.isSelected()) {
					mtime2.setSelected(true);
					
				}
				else {
					mtime2.setSelected(false);
				}
				if(ttime3.isSelected()) {
					mtime3.setSelected(true);
					
				}
				else {
					mtime3.setSelected(false);
				}
				if(ttime4.isSelected()) {
					mtime4.setSelected(true);
					
				}
				else {
					mtime4.setSelected(false);
				}
				
				if(ttime5.isSelected()) {
					mtime5.setSelected(true);
					
				}
				else {
					mtime5.setSelected(false);
				}
				
			}
			  
		  }
		  
		  class CListenerR1D2B2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent event) {
				if(ttime1.isSelected()) {
					wtime1.setSelected(true);
					
				}
				else {
					wtime1.setSelected(false);
				}
				
				if(ttime2.isSelected()) {
					wtime2.setSelected(true);
					
				}
				else {
					wtime2.setSelected(false);
				}
				if(ttime3.isSelected()) {
					wtime3.setSelected(true);
					
				}
				else {
					wtime3.setSelected(false);
				}
				if(ttime4.isSelected()) {
					wtime4.setSelected(true);
					
				}
				else {
					wtime4.setSelected(false);
				}
				
				if(ttime5.isSelected()) {
					wtime5.setSelected(true);
					
				}
				else {
					wtime5.setSelected(false);
				}
				
			}
				
			}
		  
		  class CListenerR1D2B3 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent event) {
				if(ttime1.isSelected()) {
					htime1.setSelected(true);
					
				}
				else {
					htime1.setSelected(false);
				}
				
				if(ttime2.isSelected()) {
					htime2.setSelected(true);
					
				}
				else {
					htime2.setSelected(false);
				}
				if(ttime3.isSelected()) {
					htime3.setSelected(true);
					
				}
				else {
					htime3.setSelected(false);
				}
				if(ttime4.isSelected()) {
					htime4.setSelected(true);
					
				}
				else {
					htime4.setSelected(false);
				}
				
				if(ttime5.isSelected()) {
					htime5.setSelected(true);
					
				}
				else {
					htime5.setSelected(false);
				}
				
			}
			  
		  }
		  class CListenerR1D2B4 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent event) {
						if(ttime1.isSelected()) {
					ftime1.setSelected(true);
					
				}
				else {
					ftime1.setSelected(false);
				}
				
				if(ttime2.isSelected()) {
					ftime2.setSelected(true);
					
				}
				else {
					ftime2.setSelected(false);
				}
				if(ttime3.isSelected()) {
					ftime3.setSelected(true);
					
				}
				else {
					ftime3.setSelected(false);
				}
				if(ttime4.isSelected()) {
					ftime4.setSelected(true);
					
				}
				else {
					ftime4.setSelected(false);
				}
				
				if(ttime5.isSelected()) {
					ftime5.setSelected(true);
					
				}
				else {
					ftime5.setSelected(false);
				}
				
			}
			  
		  }
		  
		  //r 1 day 3
		  
		  class CListenerR1D3B1 implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent event) {
					if(wtime1.isSelected()) {
						mtime1.setSelected(true);
						
					}
					else {
						mtime1.setSelected(false);
					}
					
					if(wtime2.isSelected()) {
						mtime2.setSelected(true);
						
					}
					else {
						mtime2.setSelected(false);
					}
					if(wtime3.isSelected()) {
						mtime3.setSelected(true);
						
					}
					else {
						mtime3.setSelected(false);
					}
					if(wtime4.isSelected()) {
						mtime4.setSelected(true);
						
					}
					else {
						mtime4.setSelected(false);
					}
					
					if(wtime5.isSelected()) {
						mtime5.setSelected(true);
						
					}
					else {
						mtime5.setSelected(false);
					}
					
				}
				  
			  }
			  
			  class CListenerR1D3B2 implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent event) {
					if(wtime1.isSelected()) {
						ttime1.setSelected(true);
						
					}
					else {
						ttime1.setSelected(false);
					}
					
					if(wtime2.isSelected()) {
						ttime2.setSelected(true);
						
					}
					else {
						ttime2.setSelected(false);
					}
					if(wtime3.isSelected()) {
						ttime3.setSelected(true);
						
					}
					else {
						ttime3.setSelected(false);
					}
					if(wtime4.isSelected()) {
						ttime4.setSelected(true);
						
					}
					else {
						ttime4.setSelected(false);
					}
					
					if(wtime5.isSelected()) {
						ttime5.setSelected(true);
						
					}
					else {
						ttime5.setSelected(false);
					}
					
				}
					
				}
			  
			  class CListenerR1D3B3 implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent event) {
					if(wtime1.isSelected()) {
						htime1.setSelected(true);
						
					}
					else {
						htime1.setSelected(false);
					}
					
					if(wtime2.isSelected()) {
						htime2.setSelected(true);
						
					}
					else {
						htime2.setSelected(false);
					}
					if(wtime3.isSelected()) {
						htime3.setSelected(true);
						
					}
					else {
						htime3.setSelected(false);
					}
					if(wtime4.isSelected()) {
						htime4.setSelected(true);
						
					}
					else {
						htime4.setSelected(false);
					}
					
					if(wtime5.isSelected()) {
						htime5.setSelected(true);
						
					}
					else {
						htime5.setSelected(false);
					}
					
				}
				  
			  }
			  class CListenerR1D3B4 implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent event) {
					if(wtime1.isSelected()) {
						ftime1.setSelected(true);
						
					}
					else {
						ftime1.setSelected(false);
					}
					
					if(wtime2.isSelected()) {
						ftime2.setSelected(true);
						
					}
					else {
						ftime2.setSelected(false);
					}
					if(wtime3.isSelected()) {
						ftime3.setSelected(true);
						
					}
					else {
						ftime3.setSelected(false);
					}
					if(wtime4.isSelected()) {
						ftime4.setSelected(true);
						
					}
					else {
						ftime4.setSelected(false);
					}
					
					if(wtime5.isSelected()) {
						ftime5.setSelected(true);
						
					}
					else {
						ftime5.setSelected(false);
					}
					
				}
				  
			  }
			  /////room 1 day 4
			  
			  class CListenerR1D4B1 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(htime1.isSelected()) {
							mtime1.setSelected(true);
							
						}
						else {
							mtime1.setSelected(false);
						}
						
						if(htime2.isSelected()) {
							mtime2.setSelected(true);
							
						}
						else {
							mtime2.setSelected(false);
						}
						if(htime3.isSelected()) {
							mtime3.setSelected(true);
							
						}
						else {
							mtime3.setSelected(false);
						}
						if(htime4.isSelected()) {
							mtime4.setSelected(true);
							
						}
						else {
							mtime4.setSelected(false);
						}
						
						if(htime5.isSelected()) {
							mtime5.setSelected(true);
							
						}
						else {
							mtime5.setSelected(false);
						}
						
					}
					  
				  }
				  
				  class CListenerR1D4B2 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(htime1.isSelected()) {
							ttime1.setSelected(true);
							
						}
						else {
							ttime1.setSelected(false);
						}
						
						if(htime2.isSelected()) {
							ttime2.setSelected(true);
							
						}
						else {
							ttime2.setSelected(false);
						}
						if(htime3.isSelected()) {
							ttime3.setSelected(true);
							
						}
						else {
							ttime3.setSelected(false);
						}
						if(htime4.isSelected()) {
							ttime4.setSelected(true);
							
						}
						else {
							ttime4.setSelected(false);
						}
						
						if(htime5.isSelected()) {
							ttime5.setSelected(true);
							
						}
						else {
							ttime5.setSelected(false);
						}
						
					}
						
					}
				  
				  class CListenerR1D4B3 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(htime1.isSelected()) {
							wtime1.setSelected(true);
							
						}
						else {
							wtime1.setSelected(false);
						}
						
						if(htime2.isSelected()) {
							wtime2.setSelected(true);
							
						}
						else {
							wtime2.setSelected(false);
						}
						if(htime3.isSelected()) {
							wtime3.setSelected(true);
							
						}
						else {
							wtime3.setSelected(false);
						}
						if(htime4.isSelected()) {
							wtime4.setSelected(true);
							
						}
						else {
							wtime4.setSelected(false);
						}
						
						if(htime5.isSelected()) {
							wtime5.setSelected(true);
							
						}
						else {
							wtime5.setSelected(false);
						}
						
					}
					  
				  }
				  class CListenerR1D4B4 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(htime1.isSelected()) {
							ftime1.setSelected(true);
							
						}
						else {
							ftime1.setSelected(false);
						}
						
						if(htime2.isSelected()) {
							ftime2.setSelected(true);
							
						}
						else {
							ftime2.setSelected(false);
						}
						if(htime3.isSelected()) {
							ftime3.setSelected(true);
							
						}
						else {
							ftime3.setSelected(false);
						}
						if(htime4.isSelected()) {
							ftime4.setSelected(true);
							
						}
						else {
							ftime4.setSelected(false);
						}
						
						if(htime5.isSelected()) {
							ftime5.setSelected(true);
							
						}
						else {
							ftime5.setSelected(false);
						}
						
					}
					  
				  }
				  
				  ///r1 day 5
				  
				  class CListenerR1D5B1 implements ActionListener{

						@Override
						public void actionPerformed(ActionEvent event) {
							if(ftime1.isSelected()) {
								mtime1.setSelected(true);
								
							}
							else {
								mtime1.setSelected(false);
							}
							
							if(ftime2.isSelected()) {
								mtime2.setSelected(true);
								
							}
							else {
								mtime2.setSelected(false);
							}
							if(ftime3.isSelected()) {
								mtime3.setSelected(true);
								
							}
							else {
								mtime3.setSelected(false);
							}
							if(ftime4.isSelected()) {
								mtime4.setSelected(true);
								
							}
							else {
								mtime4.setSelected(false);
							}
							
							if(ftime5.isSelected()) {
								mtime5.setSelected(true);
								
							}
							else {
								mtime5.setSelected(false);
							}
							
						}
						  
					  }
					  
					  class CListenerR1D5B2 implements ActionListener{

						@Override
						public void actionPerformed(ActionEvent event) {
							if(ftime1.isSelected()) {
								ttime1.setSelected(true);
								
							}
							else {
								ttime1.setSelected(false);
							}
							
							if(ftime2.isSelected()) {
								ttime2.setSelected(true);
								
							}
							else {
								ttime2.setSelected(false);
							}
							if(ftime3.isSelected()) {
								ttime3.setSelected(true);
								
							}
							else {
								ttime3.setSelected(false);
							}
							if(ftime4.isSelected()) {
								ttime4.setSelected(true);
								
							}
							else {
								ttime4.setSelected(false);
							}
							
							if(ftime5.isSelected()) {
								ttime5.setSelected(true);
								
							}
							else {
								ttime5.setSelected(false);
							}
							
						}
							
						}
					  
					  class CListenerR1D5B3 implements ActionListener{

						@Override
						public void actionPerformed(ActionEvent event) {
							if(ftime1.isSelected()) {
								wtime1.setSelected(true);
								
							}
							else {
								wtime1.setSelected(false);
							}
							
							if(ftime2.isSelected()) {
								wtime2.setSelected(true);
								
							}
							else {
								wtime2.setSelected(false);
							}
							if(ftime3.isSelected()) {
								wtime3.setSelected(true);
								
							}
							else {
								wtime3.setSelected(false);
							}
							if(ftime4.isSelected()) {
								wtime4.setSelected(true);
								
							}
							else {
								wtime4.setSelected(false);
							}
							
							if(ftime5.isSelected()) {
								wtime5.setSelected(true);
								
							}
							else {
								wtime5.setSelected(false);
							}
							
						}
						  
					  }
					  class CListenerR1D5B4 implements ActionListener{

						@Override
						public void actionPerformed(ActionEvent event) {
							if(ftime1.isSelected()) {
								htime1.setSelected(true);
								
							}
							else {
								htime1.setSelected(false);
							}
							
							if(ftime2.isSelected()) {
								htime2.setSelected(true);
								
							}
							else {
								htime2.setSelected(false);
							}
							if(ftime3.isSelected()) {
								htime3.setSelected(true);
								
							}
							else {
								htime3.setSelected(false);
							}
							if(ftime4.isSelected()) {
								htime4.setSelected(true);
								
							}
							else {
								htime4.setSelected(false);
							}
							
							if(ftime5.isSelected()) {
								htime5.setSelected(true);
								
							}
							else {
								htime5.setSelected(false);
							}
							
						}
						  
					  }
					  
					  
					  ///room 2 day 1
					  
					  class CListenerR2D1B1 implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent event) {
								if(mtime1_2.isSelected()) {
									ttime1_2.setSelected(true);
									
								}
								else {
									ttime1_2.setSelected(false);
								}
								
								if(mtime2_2.isSelected()) {
									ttime2_2.setSelected(true);
									
								}
								else {
									ttime2_2.setSelected(false);
								}
								if(mtime3_2.isSelected()) {
									ttime3_2.setSelected(true);
									
								}
								else {
									ttime3_2.setSelected(false);
								}
								if(mtime4_2.isSelected()) {
									ttime4_2.setSelected(true);
									
								}
								else {
									ttime4_2.setSelected(false);
								}
								
								if(mtime5_2.isSelected()) {
									ttime5_2.setSelected(true);
									
								}
								else {
									ttime5_2.setSelected(false);
								}
								
							}
							  
						  }
						  
						   class CListenerR2D1B2 implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent event) {
								if(mtime1_2.isSelected()) {
									wtime1_2.setSelected(true);
									
								}
								else {
									wtime1_2.setSelected(false);
								}
								
								if(mtime2_2.isSelected()) {
									wtime2_2.setSelected(true);
									
								}
								else {
									wtime2_2.setSelected(false);
								}
								if(mtime3_2.isSelected()) {
									wtime3_2.setSelected(true);
									
								}
								else {
									wtime3_2.setSelected(false);
								}
								if(mtime4_2.isSelected()) {
									wtime4_2.setSelected(true);
									
								}
								else {
									wtime4_2.setSelected(false);
								}
								
								if(mtime5_2.isSelected()) {
									wtime5_2.setSelected(true);
									
								}
								else {
									wtime5_2.setSelected(false);
								}
								
							}
							  
						  }
						  
						  	   class CListenerR2D1B3 implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent event) {
								if(mtime1_2.isSelected()) {
									htime1_2.setSelected(true);
									
								}
								else {
									htime1_2.setSelected(false);
								}
								
								if(mtime2_2.isSelected()) {
									htime2_2.setSelected(true);
									
								}
								else {
									htime2_2.setSelected(false);
								}
								if(mtime3_2.isSelected()) {
									htime3_2.setSelected(true);
									
								}
								else {
									htime3_2.setSelected(false);
								}
								if(mtime4_2.isSelected()) {
									htime4_2.setSelected(true);
									
								}
								else {
									htime4_2.setSelected(false);
								}
								
								if(mtime5_2.isSelected()) {
									htime5_2.setSelected(true);
									
								}
								else {
									htime5_2.setSelected(false);
								}
								
							}
							  
						  }
						  
			 class CListenerR2D1B4 implements ActionListener{

							
							public void actionPerformed(ActionEvent event) {
								if(mtime1_2.isSelected()) {
									ftime1_2.setSelected(true);
									
								}
								else {
									ftime1_2.setSelected(false);
								}
								
								if(mtime2_2.isSelected()) {
									ftime2_2.setSelected(true);
									
								}
								else {
									ftime2_2.setSelected(false);
								}
								if(mtime3_2.isSelected()) {
									ftime3_2.setSelected(true);
									
								}
								else {
									ftime3_2.setSelected(false);
								}
								if(mtime4_2.isSelected()) {
									ftime4_2.setSelected(true);
									
								}
								else {
									ftime4_2.setSelected(false);
								}
								
								if(mtime5_2.isSelected()) {
									ftime5_2.setSelected(true);
									
								}
								else {
									ftime5_2.setSelected(false);
								}
								
							}
							  
		  
	  }
			 
			 class CListenerR2D2B1 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(ttime1_2.isSelected()) {
							mtime1_2.setSelected(true);
							
						}
						else {
							mtime1_2.setSelected(false);
						}
						
						if(ttime2_2.isSelected()) {
							mtime2_2.setSelected(true);
							
						}
						else {
							mtime2_2.setSelected(false);
						}
						if(ttime3_2.isSelected()) {
							mtime3_2.setSelected(true);
							
						}
						else {
							mtime3_2.setSelected(false);
						}
						if(ttime4_2.isSelected()) {
							mtime4_2.setSelected(true);
							
						}
						else {
							mtime4_2.setSelected(false);
						}
						
						if(ttime5_2.isSelected()) {
							mtime5_2.setSelected(true);
							
						}
						else {
							mtime5_2.setSelected(false);
						}
						
					}
					  
				  }
				  
			 
			 // day 2
				   class CListenerR2D2B2 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(ttime1_2.isSelected()) {
							wtime1_2.setSelected(true);
							
						}
						else {
							wtime1_2.setSelected(false);
						}
						
						if(ttime2_2.isSelected()) {
							wtime2_2.setSelected(true);
							
						}
						else {
							wtime2_2.setSelected(false);
						}
						if(ttime3_2.isSelected()) {
							wtime3_2.setSelected(true);
							
						}
						else {
							wtime3_2.setSelected(false);
						}
						if(ttime4_2.isSelected()) {
							wtime4_2.setSelected(true);
							
						}
						else {
							wtime4_2.setSelected(false);
						}
						
						if(ttime5_2.isSelected()) {
							wtime5_2.setSelected(true);
							
						}
						else {
							wtime5_2.setSelected(false);
						}
						
					}
					  
				  }
				  
				  	   class CListenerR2D2B3 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(ttime1_2.isSelected()) {
							htime1_2.setSelected(true);
							
						}
						else {
							htime1_2.setSelected(false);
						}
						
						if(ttime2_2.isSelected()) {
							htime2_2.setSelected(true);
							
						}
						else {
							htime2_2.setSelected(false);
						}
						if(ttime3_2.isSelected()) {
							htime3_2.setSelected(true);
							
						}
						else {
							htime3_2.setSelected(false);
						}
						if(ttime4_2.isSelected()) {
							htime4_2.setSelected(true);
							
						}
						else {
							htime4_2.setSelected(false);
						}
						
						if(ttime5_2.isSelected()) {
							htime5_2.setSelected(true);
							
						}
						else {
							htime5_2.setSelected(false);
						}
						
					}
					  
				  }
				  
				  	   class CListenerR2D2B4 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent event) {
						if(ttime1_2.isSelected()) {
							ftime1_2.setSelected(true);
							
						}
						else {
							ftime1_2.setSelected(false);
						}
						
						if(ttime2_2.isSelected()) {
							ftime2_2.setSelected(true);
							
						}
						else {
							ftime2_2.setSelected(false);
						}
						if(ttime3_2.isSelected()) {
							ftime3_2.setSelected(true);
							
						}
						else {
							ftime3_2.setSelected(false);
						}
						if(ttime4_2.isSelected()) {
							ftime4_2.setSelected(true);
							
						}
						else {
							ftime4_2.setSelected(false);
						}
						
						if(ttime5_2.isSelected()) {
							ftime5_2.setSelected(true);
							
						}
						else {
							ftime5_2.setSelected(false);
						}
						
					}
					  
				  }
				  	   
				  	   // day 3
				  	   
				  	 class CListenerR2D3B1 implements ActionListener{

				 		@Override
				 		public void actionPerformed(ActionEvent event) {
				 			if(wtime1_2.isSelected()) {
				 				mtime1_2.setSelected(true);
				 				
				 			}
				 			else {
				 				mtime1_2.setSelected(false);
				 			}
				 			
				 			if(wtime2_2.isSelected()) {
				 				mtime2_2.setSelected(true);
				 				
				 			}
				 			else {
				 				mtime2_2.setSelected(false);
				 			}
				 			if(wtime3_2.isSelected()) {
				 				mtime3_2.setSelected(true);
				 				
				 			}
				 			else {
				 				mtime3_2.setSelected(false);
				 			}
				 			if(wtime4_2.isSelected()) {
				 				mtime4_2.setSelected(true);
				 				
				 			}
				 			else {
				 				mtime4_2.setSelected(false);
				 			}
				 			
				 			if(wtime5_2.isSelected()) {
				 				mtime5_2.setSelected(true);
				 				
				 			}
				 			else {
				 				mtime5_2.setSelected(false);
				 			}
				 			
				 		}
				 		  
				 	  }
				 	  
				 	   class CListenerR2D3B2 implements ActionListener{

				 		@Override
				 		public void actionPerformed(ActionEvent event) {
				 			if(wtime1_2.isSelected()) {
				 				ttime1_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ttime1_2.setSelected(false);
				 			}
				 			
				 			if(wtime2_2.isSelected()) {
				 				ttime2_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ttime2_2.setSelected(false);
				 			}
				 			if(wtime3_2.isSelected()) {
				 				ttime3_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ttime3_2.setSelected(false);
				 			}
				 			if(wtime4_2.isSelected()) {
				 				ttime4_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ttime4_2.setSelected(false);
				 			}
				 			
				 			if(wtime5_2.isSelected()) {
				 				ttime5_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ttime5_2.setSelected(false);
				 			}
				 			
				 		}
				 		  
				 	  }
				 	  
				 	  	   class CListenerR2D3B3 implements ActionListener{

				 		@Override
				 		public void actionPerformed(ActionEvent event) {
				 			if(wtime1_2.isSelected()) {
				 				htime1_2.setSelected(true);
				 				
				 			}
				 			else {
				 				htime1_2.setSelected(false);
				 			}
				 			
				 			if(wtime2_2.isSelected()) {
				 				htime2_2.setSelected(true);
				 				
				 			}
				 			else {
				 				htime2_2.setSelected(false);
				 			}
				 			if(wtime3_2.isSelected()) {
				 				htime3_2.setSelected(true);
				 				
				 			}
				 			else {
				 				htime3_2.setSelected(false);
				 			}
				 			if(wtime4_2.isSelected()) {
				 				htime4_2.setSelected(true);
				 				
				 			}
				 			else {
				 				htime4_2.setSelected(false);
				 			}
				 			
				 			if(wtime5_2.isSelected()) {
				 				htime5_2.setSelected(true);
				 				
				 			}
				 			else {
				 				htime5_2.setSelected(false);
				 			}
				 			
				 		}
				 		  
				 	  }
				 	  
				 	  	   class CListenerR2D3B4 implements ActionListener{

				 		@Override
				 		public void actionPerformed(ActionEvent event) {
				 			if(wtime1_2.isSelected()) {
				 				ftime1_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ftime1_2.setSelected(false);
				 			}
				 			
				 			if(wtime2_2.isSelected()) {
				 				ftime2_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ftime2_2.setSelected(false);
				 			}
				 			if(wtime3_2.isSelected()) {
				 				ftime3_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ftime3_2.setSelected(false);
				 			}
				 			if(wtime4_2.isSelected()) {
				 				ftime4_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ftime4_2.setSelected(false);
				 			}
				 			
				 			if(wtime5_2.isSelected()) {
				 				ftime5_2.setSelected(true);
				 				
				 			}
				 			else {
				 				ftime5_2.setSelected(false);
				 			}
				 			
				 		}
				 		  
				 	  }
				 	  	   //// day4
				 	  	   
				 	  	 class CListenerR2D4B1 implements ActionListener{

				 			@Override
				 			public void actionPerformed(ActionEvent event) {
				 				if(htime1_2.isSelected()) {
				 					mtime1_2.setSelected(true);
				 					
				 				}
				 				else {
				 					mtime1_2.setSelected(false);
				 				}
				 				
				 				if(htime2_2.isSelected()) {
				 					mtime2_2.setSelected(true);
				 					
				 				}
				 				else {
				 					mtime2_2.setSelected(false);
				 				}
				 				if(htime3_2.isSelected()) {
				 					mtime3_2.setSelected(true);
				 					
				 				}
				 				else {
				 					mtime3_2.setSelected(false);
				 				}
				 				if(htime4_2.isSelected()) {
				 					mtime4_2.setSelected(true);
				 					
				 				}
				 				else {
				 					mtime4_2.setSelected(false);
				 				}
				 				
				 				if(htime5_2.isSelected()) {
				 					mtime5_2.setSelected(true);
				 					
				 				}
				 				else {
				 					mtime5_2.setSelected(false);
				 				}
				 				
				 			}
				 			  
				 		  }
				 		  
				 		   class CListenerR2D4B2 implements ActionListener{

				 			@Override
				 			public void actionPerformed(ActionEvent event) {
				 				if(htime1_2.isSelected()) {
				 					ttime1_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ttime1_2.setSelected(false);
				 				}
				 				
				 				if(htime2_2.isSelected()) {
				 					ttime2_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ttime2_2.setSelected(false);
				 				}
				 				if(htime3_2.isSelected()) {
				 					ttime3_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ttime3_2.setSelected(false);
				 				}
				 				if(htime4_2.isSelected()) {
				 					ttime4_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ttime4_2.setSelected(false);
				 				}
				 				
				 				if(htime5_2.isSelected()) {
				 					ttime5_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ttime5_2.setSelected(false);
				 				}
				 				
				 			}
				 			  
				 		  }
				 		  
				 		  	   class CListenerR2D4B3 implements ActionListener{

				 			@Override
				 			public void actionPerformed(ActionEvent event) {
				 				if(htime1_2.isSelected()) {
				 					wtime1_2.setSelected(true);
				 					
				 				}
				 				else {
				 					wtime1_2.setSelected(false);
				 				}
				 				
				 				if(htime2_2.isSelected()) {
				 					wtime2_2.setSelected(true);
				 					
				 				}
				 				else {
				 					wtime2_2.setSelected(false);
				 				}
				 				if(htime3_2.isSelected()) {
				 					wtime3_2.setSelected(true);
				 					
				 				}
				 				else {
				 					wtime3_2.setSelected(false);
				 				}
				 				if(htime4_2.isSelected()) {
				 					wtime4_2.setSelected(true);
				 					
				 				}
				 				else {
				 					wtime4_2.setSelected(false);
				 				}
				 				
				 				if(htime5_2.isSelected()) {
				 					wtime5_2.setSelected(true);
				 					
				 				}
				 				else {
				 					wtime5_2.setSelected(false);
				 				}
				 				
				 			}
				 			  
				 		  }
				 		  
				 		  	   class CListenerR2D4B4 implements ActionListener{

				 			@Override
				 			public void actionPerformed(ActionEvent event) {
				 				if(htime1_2.isSelected()) {
				 					ftime1_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ftime1_2.setSelected(false);
				 				}
				 				
				 				if(htime2_2.isSelected()) {
				 					ftime2_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ftime2_2.setSelected(false);
				 				}
				 				if(htime3_2.isSelected()) {
				 					ftime3_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ftime3_2.setSelected(false);
				 				}
				 				if(htime4_2.isSelected()) {
				 					ftime4_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ftime4_2.setSelected(false);
				 				}
				 				
				 				if(htime5_2.isSelected()) {
				 					ftime5_2.setSelected(true);
				 					
				 				}
				 				else {
				 					ftime5_2.setSelected(false);
				 				}
				 				
				 			}
				 			  
				 		  }
				 		  	   //day 5
				 		  	   
				 		  	 class CListenerR2D5B1 implements ActionListener{

				 				@Override
				 				public void actionPerformed(ActionEvent event) {
				 					if(ftime1_2.isSelected()) {
				 						mtime1_2.setSelected(true);
				 						
				 					}
				 					else {
				 						mtime1_2.setSelected(false);
				 					}
				 					
				 					if(ftime2_2.isSelected()) {
				 						mtime2_2.setSelected(true);
				 						
				 					}
				 					else {
				 						mtime2_2.setSelected(false);
				 					}
				 					if(ftime3_2.isSelected()) {
				 						mtime3_2.setSelected(true);
				 						
				 					}
				 					else {
				 						mtime3_2.setSelected(false);
				 					}
				 					if(ftime4_2.isSelected()) {
				 						mtime4_2.setSelected(true);
				 						
				 					}
				 					else {
				 						mtime4_2.setSelected(false);
				 					}
				 					
				 					if(ftime5_2.isSelected()) {
				 						mtime5_2.setSelected(true);
				 						
				 					}
				 					else {
				 						mtime5_2.setSelected(false);
				 					}
				 					
				 				}
				 				  
				 			  }
				 			  
				 			   class CListenerR2D5B2 implements ActionListener{

				 				@Override
				 				public void actionPerformed(ActionEvent event) {
				 					if(ftime1_2.isSelected()) {
				 						ttime1_2.setSelected(true);
				 						
				 					}
				 					else {
				 						ttime1_2.setSelected(false);
				 					}
				 					
				 					if(ftime2_2.isSelected()) {
				 						ttime2_2.setSelected(true);
				 						
				 					}
				 					else {
				 						ttime2_2.setSelected(false);
				 					}
				 					if(ftime3_2.isSelected()) {
				 						ttime3_2.setSelected(true);
				 						
				 					}
				 					else {
				 						ttime3_2.setSelected(false);
				 					}
				 					if(ftime4_2.isSelected()) {
				 						ttime4_2.setSelected(true);
				 						
				 					}
				 					else {
				 						ttime4_2.setSelected(false);
				 					}
				 					
				 					if(ftime5_2.isSelected()) {
				 						ttime5_2.setSelected(true);
				 						
				 					}
				 					else {
				 						ttime5_2.setSelected(false);
				 					}
				 					
				 				}
				 				  
				 			  }
				 			  
				 			  	   class CListenerR2D5B3 implements ActionListener{

				 				@Override
				 				public void actionPerformed(ActionEvent event) {
				 					if(ftime1_2.isSelected()) {
				 						wtime1_2.setSelected(true);
				 						
				 					}
				 					else {
				 						wtime1_2.setSelected(false);
				 					}
				 					
				 					if(ftime2_2.isSelected()) {
				 						wtime2_2.setSelected(true);
				 						
				 					}
				 					else {
				 						wtime2_2.setSelected(false);
				 					}
				 					if(ftime3_2.isSelected()) {
				 						wtime3_2.setSelected(true);
				 						
				 					}
				 					else {
				 						wtime3_2.setSelected(false);
				 					}
				 					if(ftime4_2.isSelected()) {
				 						wtime4_2.setSelected(true);
				 						
				 					}
				 					else {
				 						wtime4_2.setSelected(false);
				 					}
				 					
				 					if(ftime5_2.isSelected()) {
				 						wtime5_2.setSelected(true);
				 						
				 					}
				 					else {
				 						wtime5_2.setSelected(false);
				 					}
				 					
				 				}
				 				  
				 			  }
				 			  
				 			  	   class CListenerR2D5B4 implements ActionListener{

				 				@Override
				 				public void actionPerformed(ActionEvent event) {
				 					if(ftime1_2.isSelected()) {
				 						htime1_2.setSelected(true);
				 						
				 					}
				 					else {
				 						htime1_2.setSelected(false);
				 					}
				 					
				 					if(ftime2_2.isSelected()) {
				 						htime2_2.setSelected(true);
				 						
				 					}
				 					else {
				 						htime2_2.setSelected(false);
				 					}
				 					if(ftime3_2.isSelected()) {
				 						htime3_2.setSelected(true);
				 						
				 					}
				 					else {
				 						htime3_2.setSelected(false);
				 					}
				 					if(ftime4_2.isSelected()) {
				 						htime4_2.setSelected(true);
				 						
				 					}
				 					else {
				 						htime4_2.setSelected(false);
				 					}
				 					
				 					if(ftime5_2.isSelected()) {
				 						htime5_2.setSelected(true);
				 						
				 					}
				 					else {
				 						htime5_2.setSelected(false);
				 					}
				 					
				 				}
				 				  
				 			  }
				 			  	   
				 			  	   
				 			  ////room 3
				 			  	   
									  class CListenerR3D1B1 implements ActionListener{

											@Override
											public void actionPerformed(ActionEvent event) {
												if(mtime1_3.isSelected()) {
													ttime1_3.setSelected(true);
													
												}
												else {
													ttime1_3.setSelected(false);
												}
												
												if(mtime2_3.isSelected()) {
													ttime2_3.setSelected(true);
													
												}
												else {
													ttime2_3.setSelected(false);
												}
												if(mtime3_3.isSelected()) {
													ttime3_3.setSelected(true);
													
												}
												else {
													ttime3_3.setSelected(false);
												}
												if(mtime4_3.isSelected()) {
													ttime4_3.setSelected(true);
													
												}
												else {
													ttime4_3.setSelected(false);
												}
												
												if(mtime5_3.isSelected()) {
													ttime5_3.setSelected(true);
													
												}
												else {
													ttime5_3.setSelected(false);
												}
												
											}
											  
										  }
										  
										   class CListenerR3D1B2 implements ActionListener{

											@Override
											public void actionPerformed(ActionEvent event) {
												if(mtime1_3.isSelected()) {
													wtime1_3.setSelected(true);
													
												}
												else {
													wtime1_3.setSelected(false);
												}
												
												if(mtime2_3.isSelected()) {
													wtime2_3.setSelected(true);
													
												}
												else {
													wtime2_3.setSelected(false);
												}
												if(mtime3_3.isSelected()) {
													wtime3_3.setSelected(true);
													
												}
												else {
													wtime3_3.setSelected(false);
												}
												if(mtime4_3.isSelected()) {
													wtime4_3.setSelected(true);
													
												}
												else {
													wtime4_3.setSelected(false);
												}
												
												if(mtime5_3.isSelected()) {
													wtime5_3.setSelected(true);
													
												}
												else {
													wtime5_3.setSelected(false);
												}
												
											}
											  
										  }
										  
										  	   class CListenerR3D1B3 implements ActionListener{

											@Override
											public void actionPerformed(ActionEvent event) {
												if(mtime1_3.isSelected()) {
													htime1_3.setSelected(true);
													
												}
												else {
													htime1_3.setSelected(false);
												}
												
												if(mtime2_3.isSelected()) {
													htime2_3.setSelected(true);
													
												}
												else {
													htime2_3.setSelected(false);
												}
												if(mtime3_3.isSelected()) {
													htime3_3.setSelected(true);
													
												}
												else {
													htime3_3.setSelected(false);
												}
												if(mtime4_3.isSelected()) {
													htime4_3.setSelected(true);
													
												}
												else {
													htime4_3.setSelected(false);
												}
												
												if(mtime5_3.isSelected()) {
													htime5_3.setSelected(true);
													
												}
												else {
													htime5_3.setSelected(false);
												}
												
											}
											  
										  }
										  
							 class CListenerR3D1B4 implements ActionListener{

											
											public void actionPerformed(ActionEvent event) {
												if(mtime1_3.isSelected()) {
													ftime1_3.setSelected(true);
													
												}
												else {
													ftime1_3.setSelected(false);
												}
												
												if(mtime2_3.isSelected()) {
													ftime2_3.setSelected(true);
													
												}
												else {
													ftime2_3.setSelected(false);
												}
												if(mtime3_3.isSelected()) {
													ftime3_3.setSelected(true);
													
												}
												else {
													ftime3_3.setSelected(false);
												}
												if(mtime4_3.isSelected()) {
													ftime4_3.setSelected(true);
													
												}
												else {
													ftime4_3.setSelected(false);
												}
												
												if(mtime5_3.isSelected()) {
													ftime5_3.setSelected(true);
													
												}
												else {
													ftime5_3.setSelected(false);
												}
												
											}
											  
						  
					  }
							 
							 class CListenerR3D2B1 implements ActionListener{

									@Override
									public void actionPerformed(ActionEvent event) {
										if(ttime1_3.isSelected()) {
											mtime1_3.setSelected(true);
											
										}
										else {
											mtime1_3.setSelected(false);
										}
										
										if(ttime2_3.isSelected()) {
											mtime2_3.setSelected(true);
											
										}
										else {
											mtime2_3.setSelected(false);
										}
										if(ttime3_3.isSelected()) {
											mtime3_3.setSelected(true);
											
										}
										else {
											mtime3_3.setSelected(false);
										}
										if(ttime4_3.isSelected()) {
											mtime4_3.setSelected(true);
											
										}
										else {
											mtime4_3.setSelected(false);
										}
										
										if(ttime5_3.isSelected()) {
											mtime5_3.setSelected(true);
											
										}
										else {
											mtime5_3.setSelected(false);
										}
										
									}
									  
								  }
								  
							 
							 // day 2
								   class CListenerR3D2B2 implements ActionListener{

									@Override
									public void actionPerformed(ActionEvent event) {
										if(ttime1_3.isSelected()) {
											wtime1_3.setSelected(true);
											
										}
										else {
											wtime1_3.setSelected(false);
										}
										
										if(ttime2_3.isSelected()) {
											wtime2_3.setSelected(true);
											
										}
										else {
											wtime2_3.setSelected(false);
										}
										if(ttime3_3.isSelected()) {
											wtime3_3.setSelected(true);
											
										}
										else {
											wtime3_3.setSelected(false);
										}
										if(ttime4_3.isSelected()) {
											wtime4_3.setSelected(true);
											
										}
										else {
											wtime4_3.setSelected(false);
										}
										
										if(ttime5_3.isSelected()) {
											wtime5_3.setSelected(true);
											
										}
										else {
											wtime5_3.setSelected(false);
										}
										
									}
									  
								  }
								  
								  	   class CListenerR3D2B3 implements ActionListener{

									@Override
									public void actionPerformed(ActionEvent event) {
										if(ttime1_3.isSelected()) {
											htime1_3.setSelected(true);
											
										}
										else {
											htime1_3.setSelected(false);
										}
										
										if(ttime2_3.isSelected()) {
											htime2_3.setSelected(true);
											
										}
										else {
											htime2_3.setSelected(false);
										}
										if(ttime3_3.isSelected()) {
											htime3_3.setSelected(true);
											
										}
										else {
											htime3_3.setSelected(false);
										}
										if(ttime4_3.isSelected()) {
											htime4_3.setSelected(true);
											
										}
										else {
											htime4_3.setSelected(false);
										}
										
										if(ttime5_3.isSelected()) {
											htime5_3.setSelected(true);
											
										}
										else {
											htime5_3.setSelected(false);
										}
										
									}
									  
								  }
								  
								  	   class CListenerR3D2B4 implements ActionListener{

									@Override
									public void actionPerformed(ActionEvent event) {
										if(ttime1_3.isSelected()) {
											ftime1_3.setSelected(true);
											
										}
										else {
											ftime1_3.setSelected(false);
										}
										
										if(ttime2_3.isSelected()) {
											ftime2_3.setSelected(true);
											
										}
										else {
											ftime2_3.setSelected(false);
										}
										if(ttime3_3.isSelected()) {
											ftime3_3.setSelected(true);
											
										}
										else {
											ftime3_3.setSelected(false);
										}
										if(ttime4_3.isSelected()) {
											ftime4_3.setSelected(true);
											
										}
										else {
											ftime4_3.setSelected(false);
										}
										
										if(ttime5_3.isSelected()) {
											ftime5_3.setSelected(true);
											
										}
										else {
											ftime5_3.setSelected(false);
										}
										
									}
									  
								  }
								  	   
								  	   // day 3
								  	   
								  	 class CListenerR3D3B1 implements ActionListener{

								 		@Override
								 		public void actionPerformed(ActionEvent event) {
								 			if(wtime1_3.isSelected()) {
								 				mtime1_3.setSelected(true);
								 				
								 			}
								 			else {
								 				mtime1_3.setSelected(false);
								 			}
								 			
								 			if(wtime2_3.isSelected()) {
								 				mtime2_3.setSelected(true);
								 				
								 			}
								 			else {
								 				mtime2_3.setSelected(false);
								 			}
								 			if(wtime3_3.isSelected()) {
								 				mtime3_3.setSelected(true);
								 				
								 			}
								 			else {
								 				mtime3_3.setSelected(false);
								 			}
								 			if(wtime4_3.isSelected()) {
								 				mtime4_3.setSelected(true);
								 				
								 			}
								 			else {
								 				mtime4_3.setSelected(false);
								 			}
								 			
								 			if(wtime5_3.isSelected()) {
								 				mtime5_3.setSelected(true);
								 				
								 			}
								 			else {
								 				mtime5_3.setSelected(false);
								 			}
								 			
								 		}
								 		  
								 	  }
								 	  
								 	   class CListenerR3D3B2 implements ActionListener{

								 		@Override
								 		public void actionPerformed(ActionEvent event) {
								 			if(wtime1_3.isSelected()) {
								 				ttime1_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ttime1_3.setSelected(false);
								 			}
								 			
								 			if(wtime2_3.isSelected()) {
								 				ttime2_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ttime2_3.setSelected(false);
								 			}
								 			if(wtime3_3.isSelected()) {
								 				ttime3_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ttime3_3.setSelected(false);
								 			}
								 			if(wtime4_3.isSelected()) {
								 				ttime4_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ttime4_3.setSelected(false);
								 			}
								 			
								 			if(wtime5_3.isSelected()) {
								 				ttime5_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ttime5_3.setSelected(false);
								 			}
								 			
								 		}
								 		  
								 	  }
								 	  
								 	  	   class CListenerR3D3B3 implements ActionListener{

								 		@Override
								 		public void actionPerformed(ActionEvent event) {
								 			if(wtime1_3.isSelected()) {
								 				htime1_3.setSelected(true);
								 				
								 			}
								 			else {
								 				htime1_3.setSelected(false);
								 			}
								 			
								 			if(wtime2_3.isSelected()) {
								 				htime2_3.setSelected(true);
								 				
								 			}
								 			else {
								 				htime2_3.setSelected(false);
								 			}
								 			if(wtime3_3.isSelected()) {
								 				htime3_3.setSelected(true);
								 				
								 			}
								 			else {
								 				htime3_3.setSelected(false);
								 			}
								 			if(wtime4_3.isSelected()) {
								 				htime4_3.setSelected(true);
								 				
								 			}
								 			else {
								 				htime4_3.setSelected(false);
								 			}
								 			
								 			if(wtime5_3.isSelected()) {
								 				htime5_3.setSelected(true);
								 				
								 			}
								 			else {
								 				htime5_3.setSelected(false);
								 			}
								 			
								 		}
								 		  
								 	  }
								 	  
								 	  	   class CListenerR3D3B4 implements ActionListener{

								 		@Override
								 		public void actionPerformed(ActionEvent event) {
								 			if(wtime1_3.isSelected()) {
								 				ftime1_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ftime1_3.setSelected(false);
								 			}
								 			
								 			if(wtime2_3.isSelected()) {
								 				ftime2_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ftime2_3.setSelected(false);
								 			}
								 			if(wtime3_3.isSelected()) {
								 				ftime3_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ftime3_3.setSelected(false);
								 			}
								 			if(wtime4_3.isSelected()) {
								 				ftime4_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ftime4_3.setSelected(false);
								 			}
								 			
								 			if(wtime5_3.isSelected()) {
								 				ftime5_3.setSelected(true);
								 				
								 			}
								 			else {
								 				ftime5_3.setSelected(false);
								 			}
								 			
								 		}
								 		  
								 	  }
								 	  	   //// day4
								 	  	   
								 	  	 class CListenerR3D4B1 implements ActionListener{

								 			@Override
								 			public void actionPerformed(ActionEvent event) {
								 				if(htime1_3.isSelected()) {
								 					mtime1_3.setSelected(true);
								 					
								 				}
								 				else {
								 					mtime1_3.setSelected(false);
								 				}
								 				
								 				if(htime2_3.isSelected()) {
								 					mtime2_3.setSelected(true);
								 					
								 				}
								 				else {
								 					mtime2_3.setSelected(false);
								 				}
								 				if(htime3_3.isSelected()) {
								 					mtime3_3.setSelected(true);
								 					
								 				}
								 				else {
								 					mtime3_3.setSelected(false);
								 				}
								 				if(htime4_3.isSelected()) {
								 					mtime4_3.setSelected(true);
								 					
								 				}
								 				else {
								 					mtime4_3.setSelected(false);
								 				}
								 				
								 				if(htime5_3.isSelected()) {
								 					mtime5_3.setSelected(true);
								 					
								 				}
								 				else {
								 					mtime5_3.setSelected(false);
								 				}
								 				
								 			}
								 			  
								 		  }
								 		  
								 		   class CListenerR3D4B2 implements ActionListener{

								 			@Override
								 			public void actionPerformed(ActionEvent event) {
								 				if(htime1_3.isSelected()) {
								 					ttime1_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ttime1_3.setSelected(false);
								 				}
								 				
								 				if(htime2_3.isSelected()) {
								 					ttime2_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ttime2_3.setSelected(false);
								 				}
								 				if(htime3_3.isSelected()) {
								 					ttime3_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ttime3_3.setSelected(false);
								 				}
								 				if(htime4_3.isSelected()) {
								 					ttime4_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ttime4_3.setSelected(false);
								 				}
								 				
								 				if(htime5_3.isSelected()) {
								 					ttime5_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ttime5_3.setSelected(false);
								 				}
								 				
								 			}
								 			  
								 		  }
								 		  
								 		  	   class CListenerR3D4B3 implements ActionListener{

								 			@Override
								 			public void actionPerformed(ActionEvent event) {
								 				if(htime1_3.isSelected()) {
								 					wtime1_3.setSelected(true);
								 					
								 				}
								 				else {
								 					wtime1_3.setSelected(false);
								 				}
								 				
								 				if(htime2_3.isSelected()) {
								 					wtime2_3.setSelected(true);
								 					
								 				}
								 				else {
								 					wtime2_3.setSelected(false);
								 				}
								 				if(htime3_3.isSelected()) {
								 					wtime3_3.setSelected(true);
								 					
								 				}
								 				else {
								 					wtime3_3.setSelected(false);
								 				}
								 				if(htime4_3.isSelected()) {
								 					wtime4_3.setSelected(true);
								 					
								 				}
								 				else {
								 					wtime4_3.setSelected(false);
								 				}
								 				
								 				if(htime5_3.isSelected()) {
								 					wtime5_3.setSelected(true);
								 					
								 				}
								 				else {
								 					wtime5_3.setSelected(false);
								 				}
								 				
								 			}
								 			  
								 		  }
								 		  
								 		  	   class CListenerR3D4B4 implements ActionListener{

								 			@Override
								 			public void actionPerformed(ActionEvent event) {
								 				if(htime1_3.isSelected()) {
								 					ftime1_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ftime1_3.setSelected(false);
								 				}
								 				
								 				if(htime2_3.isSelected()) {
								 					ftime2_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ftime2_3.setSelected(false);
								 				}
								 				if(htime3_3.isSelected()) {
								 					ftime3_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ftime3_3.setSelected(false);
								 				}
								 				if(htime4_3.isSelected()) {
								 					ftime4_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ftime4_3.setSelected(false);
								 				}
								 				
								 				if(htime5_3.isSelected()) {
								 					ftime5_3.setSelected(true);
								 					
								 				}
								 				else {
								 					ftime5_3.setSelected(false);
								 				}
								 				
								 			}
								 			  
								 		  }
								 		  	   //day 5
								 		  	   
								 		  	 class CListenerR3D5B1 implements ActionListener{

								 				@Override
								 				public void actionPerformed(ActionEvent event) {
								 					if(ftime1_3.isSelected()) {
								 						mtime1_3.setSelected(true);
								 						
								 					}
								 					else {
								 						mtime1_3.setSelected(false);
								 					}
								 					
								 					if(ftime2_3.isSelected()) {
								 						mtime2_3.setSelected(true);
								 						
								 					}
								 					else {
								 						mtime2_3.setSelected(false);
								 					}
								 					if(ftime3_3.isSelected()) {
								 						mtime3_3.setSelected(true);
								 						
								 					}
								 					else {
								 						mtime3_3.setSelected(false);
								 					}
								 					if(ftime4_3.isSelected()) {
								 						mtime4_3.setSelected(true);
								 						
								 					}
								 					else {
								 						mtime4_3.setSelected(false);
								 					}
								 					
								 					if(ftime5_3.isSelected()) {
								 						mtime5_3.setSelected(true);
								 						
								 					}
								 					else {
								 						mtime5_3.setSelected(false);
								 					}
								 					
								 				}
								 				  
								 			  }
								 			  
								 			   class CListenerR3D5B2 implements ActionListener{

								 				@Override
								 				public void actionPerformed(ActionEvent event) {
								 					if(ftime1_3.isSelected()) {
								 						ttime1_3.setSelected(true);
								 						
								 					}
								 					else {
								 						ttime1_3.setSelected(false);
								 					}
								 					
								 					if(ftime2_3.isSelected()) {
								 						ttime2_3.setSelected(true);
								 						
								 					}
								 					else {
								 						ttime2_3.setSelected(false);
								 					}
								 					if(ftime3_3.isSelected()) {
								 						ttime3_3.setSelected(true);
								 						
								 					}
								 					else {
								 						ttime3_3.setSelected(false);
								 					}
								 					if(ftime4_3.isSelected()) {
								 						ttime4_3.setSelected(true);
								 						
								 					}
								 					else {
								 						ttime4_3.setSelected(false);
								 					}
								 					
								 					if(ftime5_3.isSelected()) {
								 						ttime5_3.setSelected(true);
								 						
								 					}
								 					else {
								 						ttime5_3.setSelected(false);
								 					}
								 					
								 				}
								 				  
								 			  }
								 			  
								 			  	   class CListenerR3D5B3 implements ActionListener{

								 				@Override
								 				public void actionPerformed(ActionEvent event) {
								 					if(ftime1_3.isSelected()) {
								 						wtime1_3.setSelected(true);
								 						
								 					}
								 					else {
								 						wtime1_3.setSelected(false);
								 					}
								 					
								 					if(ftime2_3.isSelected()) {
								 						wtime2_3.setSelected(true);
								 						
								 					}
								 					else {
								 						wtime2_3.setSelected(false);
								 					}
								 					if(ftime3_3.isSelected()) {
								 						wtime3_3.setSelected(true);
								 						
								 					}
								 					else {
								 						wtime3_3.setSelected(false);
								 					}
								 					if(ftime4_3.isSelected()) {
								 						wtime4_3.setSelected(true);
								 						
								 					}
								 					else {
								 						wtime4_3.setSelected(false);
								 					}
								 					
								 					if(ftime5_3.isSelected()) {
								 						wtime5_3.setSelected(true);
								 						
								 					}
								 					else {
								 						wtime5_3.setSelected(false);
								 					}
								 					
								 				}
								 				  
								 			  }
								 			  
								 			  	   class CListenerR3D5B4 implements ActionListener{

								 				@Override
								 				public void actionPerformed(ActionEvent event) {
								 					if(ftime1_3.isSelected()) {
								 						htime1_3.setSelected(true);
								 						
								 					}
								 					else {
								 						htime1_3.setSelected(false);
								 					}
								 					
								 					if(ftime2_3.isSelected()) {
								 						htime2_3.setSelected(true);
								 						
								 					}
								 					else {
								 						htime2_3.setSelected(false);
								 					}
								 					if(ftime3_3.isSelected()) {
								 						htime3_3.setSelected(true);
								 						
								 					}
								 					else {
								 						htime3_3.setSelected(false);
								 					}
								 					if(ftime4_3.isSelected()) {
								 						htime4_3.setSelected(true);
								 						
								 					}
								 					else {
								 						htime4_3.setSelected(false);
								 					}
								 					
								 					if(ftime5_3.isSelected()) {
								 						htime5_3.setSelected(true);
								 						
								 					}
								 					else {
								 						htime5_3.setSelected(false);
								 					}
								 					
								 				}
								 				  
								 			  }
								 			  	   
								 			  	   
								 			  	   /////room 4
								 			  	   
													  class CListenerR4D1B1 implements ActionListener{

															@Override
															public void actionPerformed(ActionEvent event) {
																if(mtime1_4.isSelected()) {
																	ttime1_4.setSelected(true);
																	
																}
																else {
																	ttime1_4.setSelected(false);
																}
																
																if(mtime2_4.isSelected()) {
																	ttime2_4.setSelected(true);
																	
																}
																else {
																	ttime2_4.setSelected(false);
																}
																if(mtime3_4.isSelected()) {
																	ttime3_4.setSelected(true);
																	
																}
																else {
																	ttime3_4.setSelected(false);
																}
																if(mtime4_4.isSelected()) {
																	ttime4_4.setSelected(true);
																	
																}
																else {
																	ttime4_4.setSelected(false);
																}
																
																if(mtime5_4.isSelected()) {
																	ttime5_4.setSelected(true);
																	
																}
																else {
																	ttime5_4.setSelected(false);
																}
																
															}
															  
														  }
														  
														   class CListenerR4D1B2 implements ActionListener{

															@Override
															public void actionPerformed(ActionEvent event) {
																if(mtime1_4.isSelected()) {
																	wtime1_4.setSelected(true);
																	
																}
																else {
																	wtime1_4.setSelected(false);
																}
																
																if(mtime2_4.isSelected()) {
																	wtime2_4.setSelected(true);
																	
																}
																else {
																	wtime2_4.setSelected(false);
																}
																if(mtime3_4.isSelected()) {
																	wtime3_4.setSelected(true);
																	
																}
																else {
																	wtime3_4.setSelected(false);
																}
																if(mtime4_4.isSelected()) {
																	wtime4_4.setSelected(true);
																	
																}
																else {
																	wtime4_4.setSelected(false);
																}
																
																if(mtime5_4.isSelected()) {
																	wtime5_4.setSelected(true);
																	
																}
																else {
																	wtime5_4.setSelected(false);
																}
																
															}
															  
														  }
														  
														  	   class CListenerR4D1B3 implements ActionListener{

															@Override
															public void actionPerformed(ActionEvent event) {
																if(mtime1_4.isSelected()) {
																	htime1_4.setSelected(true);
																	
																}
																else {
																	htime1_4.setSelected(false);
																}
																
																if(mtime2_4.isSelected()) {
																	htime2_4.setSelected(true);
																	
																}
																else {
																	htime2_4.setSelected(false);
																}
																if(mtime3_4.isSelected()) {
																	htime3_4.setSelected(true);
																	
																}
																else {
																	htime3_4.setSelected(false);
																}
																if(mtime4_4.isSelected()) {
																	htime4_4.setSelected(true);
																	
																}
																else {
																	htime4_4.setSelected(false);
																}
																
																if(mtime5_4.isSelected()) {
																	htime5_4.setSelected(true);
																	
																}
																else {
																	htime5_4.setSelected(false);
																}
																
															}
															  
														  }
														  
											 class CListenerR4D1B4 implements ActionListener{

															
															public void actionPerformed(ActionEvent event) {
																if(mtime1_4.isSelected()) {
																	ftime1_4.setSelected(true);
																	
																}
																else {
																	ftime1_4.setSelected(false);
																}
																
																if(mtime2_4.isSelected()) {
																	ftime2_4.setSelected(true);
																	
																}
																else {
																	ftime2_4.setSelected(false);
																}
																if(mtime3_4.isSelected()) {
																	ftime3_4.setSelected(true);
																	
																}
																else {
																	ftime3_4.setSelected(false);
																}
																if(mtime4_4.isSelected()) {
																	ftime4_4.setSelected(true);
																	
																}
																else {
																	ftime4_4.setSelected(false);
																}
																
																if(mtime5_4.isSelected()) {
																	ftime5_4.setSelected(true);
																	
																}
																else {
																	ftime5_4.setSelected(false);
																}
																
															}
															  
										  
									  }
											 
											 class CListenerR4D2B1 implements ActionListener{

													@Override
													public void actionPerformed(ActionEvent event) {
														if(ttime1_4.isSelected()) {
															mtime1_4.setSelected(true);
															
														}
														else {
															mtime1_4.setSelected(false);
														}
														
														if(ttime2_4.isSelected()) {
															mtime2_4.setSelected(true);
															
														}
														else {
															mtime2_4.setSelected(false);
														}
														if(ttime3_4.isSelected()) {
															mtime3_4.setSelected(true);
															
														}
														else {
															mtime3_4.setSelected(false);
														}
														if(ttime4_4.isSelected()) {
															mtime4_4.setSelected(true);
															
														}
														else {
															mtime4_4.setSelected(false);
														}
														
														if(ttime5_4.isSelected()) {
															mtime5_4.setSelected(true);
															
														}
														else {
															mtime5_4.setSelected(false);
														}
														
													}
													  
												  }
												  
											 
											 // day 2
												   class CListenerR4D2B2 implements ActionListener{

													@Override
													public void actionPerformed(ActionEvent event) {
														if(ttime1_4.isSelected()) {
															wtime1_4.setSelected(true);
															
														}
														else {
															wtime1_4.setSelected(false);
														}
														
														if(ttime2_4.isSelected()) {
															wtime2_4.setSelected(true);
															
														}
														else {
															wtime2_4.setSelected(false);
														}
														if(ttime3_4.isSelected()) {
															wtime3_4.setSelected(true);
															
														}
														else {
															wtime3_4.setSelected(false);
														}
														if(ttime4_4.isSelected()) {
															wtime4_4.setSelected(true);
															
														}
														else {
															wtime4_4.setSelected(false);
														}
														
														if(ttime5_4.isSelected()) {
															wtime5_4.setSelected(true);
															
														}
														else {
															wtime5_4.setSelected(false);
														}
														
													}
													  
												  }
												  
												  	   class CListenerR4D2B3 implements ActionListener{

													@Override
													public void actionPerformed(ActionEvent event) {
														if(ttime1_4.isSelected()) {
															htime1_4.setSelected(true);
															
														}
														else {
															htime1_4.setSelected(false);
														}
														
														if(ttime2_4.isSelected()) {
															htime2_4.setSelected(true);
															
														}
														else {
															htime2_4.setSelected(false);
														}
														if(ttime3_4.isSelected()) {
															htime3_4.setSelected(true);
															
														}
														else {
															htime3_4.setSelected(false);
														}
														if(ttime4_4.isSelected()) {
															htime4_4.setSelected(true);
															
														}
														else {
															htime4_4.setSelected(false);
														}
														
														if(ttime5_4.isSelected()) {
															htime5_4.setSelected(true);
															
														}
														else {
															htime5_4.setSelected(false);
														}
														
													}
													  
												  }
												  
												  	   class CListenerR4D2B4 implements ActionListener{

													@Override
													public void actionPerformed(ActionEvent event) {
														if(ttime1_4.isSelected()) {
															ftime1_4.setSelected(true);
															
														}
														else {
															ftime1_4.setSelected(false);
														}
														
														if(ttime2_4.isSelected()) {
															ftime2_4.setSelected(true);
															
														}
														else {
															ftime2_4.setSelected(false);
														}
														if(ttime3_4.isSelected()) {
															ftime3_4.setSelected(true);
															
														}
														else {
															ftime3_4.setSelected(false);
														}
														if(ttime4_4.isSelected()) {
															ftime4_4.setSelected(true);
															
														}
														else {
															ftime4_4.setSelected(false);
														}
														
														if(ttime5_4.isSelected()) {
															ftime5_4.setSelected(true);
															
														}
														else {
															ftime5_4.setSelected(false);
														}
														
													}
													  
												  }
												  	   
												  	   // day 3
												  	   
												  	 class CListenerR4D3B1 implements ActionListener{

												 		@Override
												 		public void actionPerformed(ActionEvent event) {
												 			if(wtime1_4.isSelected()) {
												 				mtime1_4.setSelected(true);
												 				
												 			}
												 			else {
												 				mtime1_4.setSelected(false);
												 			}
												 			
												 			if(wtime2_4.isSelected()) {
												 				mtime2_4.setSelected(true);
												 				
												 			}
												 			else {
												 				mtime2_4.setSelected(false);
												 			}
												 			if(wtime3_4.isSelected()) {
												 				mtime3_4.setSelected(true);
												 				
												 			}
												 			else {
												 				mtime3_4.setSelected(false);
												 			}
												 			if(wtime4_4.isSelected()) {
												 				mtime4_4.setSelected(true);
												 				
												 			}
												 			else {
												 				mtime4_4.setSelected(false);
												 			}
												 			
												 			if(wtime5_4.isSelected()) {
												 				mtime5_4.setSelected(true);
												 				
												 			}
												 			else {
												 				mtime5_4.setSelected(false);
												 			}
												 			
												 		}
												 		  
												 	  }
												 	  
												 	   class CListenerR4D3B2 implements ActionListener{

												 		@Override
												 		public void actionPerformed(ActionEvent event) {
												 			if(wtime1_4.isSelected()) {
												 				ttime1_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ttime1_4.setSelected(false);
												 			}
												 			
												 			if(wtime2_4.isSelected()) {
												 				ttime2_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ttime2_4.setSelected(false);
												 			}
												 			if(wtime3_4.isSelected()) {
												 				ttime3_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ttime3_4.setSelected(false);
												 			}
												 			if(wtime4_4.isSelected()) {
												 				ttime4_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ttime4_4.setSelected(false);
												 			}
												 			
												 			if(wtime5_4.isSelected()) {
												 				ttime5_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ttime5_4.setSelected(false);
												 			}
												 			
												 		}
												 		  
												 	  }
												 	  
												 	  	   class CListenerR4D3B3 implements ActionListener{

												 		@Override
												 		public void actionPerformed(ActionEvent event) {
												 			if(wtime1_4.isSelected()) {
												 				htime1_4.setSelected(true);
												 				
												 			}
												 			else {
												 				htime1_4.setSelected(false);
												 			}
												 			
												 			if(wtime2_4.isSelected()) {
												 				htime2_4.setSelected(true);
												 				
												 			}
												 			else {
												 				htime2_4.setSelected(false);
												 			}
												 			if(wtime3_4.isSelected()) {
												 				htime3_4.setSelected(true);
												 				
												 			}
												 			else {
												 				htime3_4.setSelected(false);
												 			}
												 			if(wtime4_4.isSelected()) {
												 				htime4_4.setSelected(true);
												 				
												 			}
												 			else {
												 				htime4_4.setSelected(false);
												 			}
												 			
												 			if(wtime5_4.isSelected()) {
												 				htime5_4.setSelected(true);
												 				
												 			}
												 			else {
												 				htime5_4.setSelected(false);
												 			}
												 			
												 		}
												 		  
												 	  }
												 	  
												 	  	   class CListenerR4D3B4 implements ActionListener{

												 		@Override
												 		public void actionPerformed(ActionEvent event) {
												 			if(wtime1_4.isSelected()) {
												 				ftime1_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ftime1_4.setSelected(false);
												 			}
												 			
												 			if(wtime2_4.isSelected()) {
												 				ftime2_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ftime2_4.setSelected(false);
												 			}
												 			if(wtime3_4.isSelected()) {
												 				ftime3_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ftime3_4.setSelected(false);
												 			}
												 			if(wtime4_4.isSelected()) {
												 				ftime4_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ftime4_4.setSelected(false);
												 			}
												 			
												 			if(wtime5_4.isSelected()) {
												 				ftime5_4.setSelected(true);
												 				
												 			}
												 			else {
												 				ftime5_4.setSelected(false);
												 			}
												 			
												 		}
												 		  
												 	  }
												 	  	   //// day4
												 	  	   
												 	  	 class CListenerR4D4B1 implements ActionListener{

												 			@Override
												 			public void actionPerformed(ActionEvent event) {
												 				if(htime1_4.isSelected()) {
												 					mtime1_4.setSelected(true);
												 					
												 				}
												 				else {
												 					mtime1_4.setSelected(false);
												 				}
												 				
												 				if(htime2_4.isSelected()) {
												 					mtime2_4.setSelected(true);
												 					
												 				}
												 				else {
												 					mtime2_4.setSelected(false);
												 				}
												 				if(htime3_4.isSelected()) {
												 					mtime3_4.setSelected(true);
												 					
												 				}
												 				else {
												 					mtime3_4.setSelected(false);
												 				}
												 				if(htime4_4.isSelected()) {
												 					mtime4_4.setSelected(true);
												 					
												 				}
												 				else {
												 					mtime4_4.setSelected(false);
												 				}
												 				
												 				if(htime5_4.isSelected()) {
												 					mtime5_4.setSelected(true);
												 					
												 				}
												 				else {
												 					mtime5_4.setSelected(false);
												 				}
												 				
												 			}
												 			  
												 		  }
												 		  
												 		   class CListenerR4D4B2 implements ActionListener{

												 			@Override
												 			public void actionPerformed(ActionEvent event) {
												 				if(htime1_4.isSelected()) {
												 					ttime1_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ttime1_4.setSelected(false);
												 				}
												 				
												 				if(htime2_4.isSelected()) {
												 					ttime2_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ttime2_4.setSelected(false);
												 				}
												 				if(htime3_4.isSelected()) {
												 					ttime3_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ttime3_4.setSelected(false);
												 				}
												 				if(htime4_4.isSelected()) {
												 					ttime4_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ttime4_4.setSelected(false);
												 				}
												 				
												 				if(htime5_4.isSelected()) {
												 					ttime5_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ttime5_4.setSelected(false);
												 				}
												 				
												 			}
												 			  
												 		  }
												 		  
												 		  	   class CListenerR4D4B3 implements ActionListener{

												 			@Override
												 			public void actionPerformed(ActionEvent event) {
												 				if(htime1_4.isSelected()) {
												 					wtime1_4.setSelected(true);
												 					
												 				}
												 				else {
												 					wtime1_4.setSelected(false);
												 				}
												 				
												 				if(htime2_4.isSelected()) {
												 					wtime2_4.setSelected(true);
												 					
												 				}
												 				else {
												 					wtime2_4.setSelected(false);
												 				}
												 				if(htime3_4.isSelected()) {
												 					wtime3_4.setSelected(true);
												 					
												 				}
												 				else {
												 					wtime3_4.setSelected(false);
												 				}
												 				if(htime4_4.isSelected()) {
												 					wtime4_4.setSelected(true);
												 					
												 				}
												 				else {
												 					wtime4_4.setSelected(false);
												 				}
												 				
												 				if(htime5_4.isSelected()) {
												 					wtime5_4.setSelected(true);
												 					
												 				}
												 				else {
												 					wtime5_4.setSelected(false);
												 				}
												 				
												 			}
												 			  
												 		  }
												 		  
												 		  	   class CListenerR4D4B4 implements ActionListener{

												 			@Override
												 			public void actionPerformed(ActionEvent event) {
												 				if(htime1_4.isSelected()) {
												 					ftime1_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ftime1_4.setSelected(false);
												 				}
												 				
												 				if(htime2_4.isSelected()) {
												 					ftime2_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ftime2_4.setSelected(false);
												 				}
												 				if(htime3_4.isSelected()) {
												 					ftime3_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ftime3_4.setSelected(false);
												 				}
												 				if(htime4_4.isSelected()) {
												 					ftime4_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ftime4_4.setSelected(false);
												 				}
												 				
												 				if(htime5_4.isSelected()) {
												 					ftime5_4.setSelected(true);
												 					
												 				}
												 				else {
												 					ftime5_4.setSelected(false);
												 				}
												 				
												 			}
												 			  
												 		  }
												 		  	   //day 5
												 		  	   
												 		  	 class CListenerR4D5B1 implements ActionListener{

												 				@Override
												 				public void actionPerformed(ActionEvent event) {
												 					if(ftime1_4.isSelected()) {
												 						mtime1_4.setSelected(true);
												 						
												 					}
												 					else {
												 						mtime1_4.setSelected(false);
												 					}
												 					
												 					if(ftime2_4.isSelected()) {
												 						mtime2_4.setSelected(true);
												 						
												 					}
												 					else {
												 						mtime2_4.setSelected(false);
												 					}
												 					if(ftime3_4.isSelected()) {
												 						mtime3_4.setSelected(true);
												 						
												 					}
												 					else {
												 						mtime3_4.setSelected(false);
												 					}
												 					if(ftime4_4.isSelected()) {
												 						mtime4_4.setSelected(true);
												 						
												 					}
												 					else {
												 						mtime4_4.setSelected(false);
												 					}
												 					
												 					if(ftime5_4.isSelected()) {
												 						mtime5_4.setSelected(true);
												 						
												 					}
												 					else {
												 						mtime5_4.setSelected(false);
												 					}
												 					
												 				}
												 				  
												 			  }
												 			  
												 			   class CListenerR4D5B2 implements ActionListener{

												 				@Override
												 				public void actionPerformed(ActionEvent event) {
												 					if(ftime1_4.isSelected()) {
												 						ttime1_4.setSelected(true);
												 						
												 					}
												 					else {
												 						ttime1_4.setSelected(false);
												 					}
												 					
												 					if(ftime2_4.isSelected()) {
												 						ttime2_4.setSelected(true);
												 						
												 					}
												 					else {
												 						ttime2_4.setSelected(false);
												 					}
												 					if(ftime3_4.isSelected()) {
												 						ttime3_4.setSelected(true);
												 						
												 					}
												 					else {
												 						ttime3_4.setSelected(false);
												 					}
												 					if(ftime4_4.isSelected()) {
												 						ttime4_4.setSelected(true);
												 						
												 					}
												 					else {
												 						ttime4_4.setSelected(false);
												 					}
												 					
												 					if(ftime5_4.isSelected()) {
												 						ttime5_4.setSelected(true);
												 						
												 					}
												 					else {
												 						ttime5_4.setSelected(false);
												 					}
												 					
												 				}
												 				  
												 			  }
												 			  
												 			  	   class CListenerR4D5B3 implements ActionListener{

												 				@Override
												 				public void actionPerformed(ActionEvent event) {
												 					if(ftime1_4.isSelected()) {
												 						wtime1_4.setSelected(true);
												 						
												 					}
												 					else {
												 						wtime1_4.setSelected(false);
												 					}
												 					
												 					if(ftime2_4.isSelected()) {
												 						wtime2_4.setSelected(true);
												 						
												 					}
												 					else {
												 						wtime2_4.setSelected(false);
												 					}
												 					if(ftime3_4.isSelected()) {
												 						wtime3_4.setSelected(true);
												 						
												 					}
												 					else {
												 						wtime3_4.setSelected(false);
												 					}
												 					if(ftime4_4.isSelected()) {
												 						wtime4_4.setSelected(true);
												 						
												 					}
												 					else {
												 						wtime4_4.setSelected(false);
												 					}
												 					
												 					if(ftime5_4.isSelected()) {
												 						wtime5_4.setSelected(true);
												 						
												 					}
												 					else {
												 						wtime5_4.setSelected(false);
												 					}
												 					
												 				}
												 				  
												 			  }
												 			  
												 			  	   class CListenerR4D5B4 implements ActionListener{

												 				@Override
												 				public void actionPerformed(ActionEvent event) {
												 					if(ftime1_4.isSelected()) {
												 						htime1_4.setSelected(true);
												 						
												 					}
												 					else {
												 						htime1_4.setSelected(false);
												 					}
												 					
												 					if(ftime2_4.isSelected()) {
												 						htime2_4.setSelected(true);
												 						
												 					}
												 					else {
												 						htime2_4.setSelected(false);
												 					}
												 					if(ftime3_4.isSelected()) {
												 						htime3_4.setSelected(true);
												 						
												 					}
												 					else {
												 						htime3_4.setSelected(false);
												 					}
												 					if(ftime4_4.isSelected()) {
												 						htime4_4.setSelected(true);
												 						
												 					}
												 					else {
												 						htime4_4.setSelected(false);
												 					}
												 					
												 					if(ftime5_4.isSelected()) {
												 						htime5_4.setSelected(true);
												 						
												 					}
												 					else {
												 						htime5_4.setSelected(false);
												 					}
												 					
												 				}
												 				  
												 			  }
												 			  	   
												 			  	   
												 			  	   // room 5
												 			  	   
																	  class CListenerR5D1B1 implements ActionListener{

																			@Override
																			public void actionPerformed(ActionEvent event) {
																				if(mtime1_5.isSelected()) {
																					ttime1_5.setSelected(true);
																					
																				}
																				else {
																					ttime1_5.setSelected(false);
																				}
																				
																				if(mtime2_5.isSelected()) {
																					ttime2_5.setSelected(true);
																					
																				}
																				else {
																					ttime2_5.setSelected(false);
																				}
																				if(mtime3_5.isSelected()) {
																					ttime3_5.setSelected(true);
																					
																				}
																				else {
																					ttime3_5.setSelected(false);
																				}
																				if(mtime4_5.isSelected()) {
																					ttime4_5.setSelected(true);
																					
																				}
																				else {
																					ttime4_5.setSelected(false);
																				}
																				
																				if(mtime5_5.isSelected()) {
																					ttime5_5.setSelected(true);
																					
																				}
																				else {
																					ttime5_5.setSelected(false);
																				}
																				
																			}
																			  
																		  }
																		  
																		   class CListenerR5D1B2 implements ActionListener{

																			@Override
																			public void actionPerformed(ActionEvent event) {
																				if(mtime1_5.isSelected()) {
																					wtime1_5.setSelected(true);
																					
																				}
																				else {
																					wtime1_5.setSelected(false);
																				}
																				
																				if(mtime2_5.isSelected()) {
																					wtime2_5.setSelected(true);
																					
																				}
																				else {
																					wtime2_5.setSelected(false);
																				}
																				if(mtime3_5.isSelected()) {
																					wtime3_5.setSelected(true);
																					
																				}
																				else {
																					wtime3_5.setSelected(false);
																				}
																				if(mtime4_5.isSelected()) {
																					wtime4_5.setSelected(true);
																					
																				}
																				else {
																					wtime4_5.setSelected(false);
																				}
																				
																				if(mtime5_5.isSelected()) {
																					wtime5_5.setSelected(true);
																					
																				}
																				else {
																					wtime5_5.setSelected(false);
																				}
																				
																			}
																			  
																		  }
																		  
																		  	   class CListenerR5D1B3 implements ActionListener{

																			@Override
																			public void actionPerformed(ActionEvent event) {
																				if(mtime1_5.isSelected()) {
																					htime1_5.setSelected(true);
																					
																				}
																				else {
																					htime1_5.setSelected(false);
																				}
																				
																				if(mtime2_5.isSelected()) {
																					htime2_5.setSelected(true);
																					
																				}
																				else {
																					htime2_5.setSelected(false);
																				}
																				if(mtime3_5.isSelected()) {
																					htime3_5.setSelected(true);
																					
																				}
																				else {
																					htime3_5.setSelected(false);
																				}
																				if(mtime4_5.isSelected()) {
																					htime4_5.setSelected(true);
																					
																				}
																				else {
																					htime4_5.setSelected(false);
																				}
																				
																				if(mtime5_5.isSelected()) {
																					htime5_5.setSelected(true);
																					
																				}
																				else {
																					htime5_5.setSelected(false);
																				}
																				
																			}
																			  
																		  }
																		  
															 class CListenerR5D1B4 implements ActionListener{

																			
																			public void actionPerformed(ActionEvent event) {
																				if(mtime1_5.isSelected()) {
																					ftime1_5.setSelected(true);
																					
																				}
																				else {
																					ftime1_5.setSelected(false);
																				}
																				
																				if(mtime2_5.isSelected()) {
																					ftime2_5.setSelected(true);
																					
																				}
																				else {
																					ftime2_5.setSelected(false);
																				}
																				if(mtime3_5.isSelected()) {
																					ftime3_5.setSelected(true);
																					
																				}
																				else {
																					ftime3_5.setSelected(false);
																				}
																				if(mtime4_5.isSelected()) {
																					ftime4_5.setSelected(true);
																					
																				}
																				else {
																					ftime4_5.setSelected(false);
																				}
																				
																				if(mtime5_5.isSelected()) {
																					ftime5_5.setSelected(true);
																					
																				}
																				else {
																					ftime5_5.setSelected(false);
																				}
																				
																			}
																			  
														  
													  }
															 
															 class CListenerR5D2B1 implements ActionListener{

																	@Override
																	public void actionPerformed(ActionEvent event) {
																		if(ttime1_5.isSelected()) {
																			mtime1_5.setSelected(true);
																			
																		}
																		else {
																			mtime1_5.setSelected(false);
																		}
																		
																		if(ttime2_5.isSelected()) {
																			mtime2_5.setSelected(true);
																			
																		}
																		else {
																			mtime2_5.setSelected(false);
																		}
																		if(ttime3_5.isSelected()) {
																			mtime3_5.setSelected(true);
																			
																		}
																		else {
																			mtime3_5.setSelected(false);
																		}
																		if(ttime4_5.isSelected()) {
																			mtime4_5.setSelected(true);
																			
																		}
																		else {
																			mtime4_5.setSelected(false);
																		}
																		
																		if(ttime5_5.isSelected()) {
																			mtime5_5.setSelected(true);
																			
																		}
																		else {
																			mtime5_5.setSelected(false);
																		}
																		
																	}
																	  
																  }
																  
															 
															 // day 2
																   class CListenerR5D2B2 implements ActionListener{

																	@Override
																	public void actionPerformed(ActionEvent event) {
																		if(ttime1_5.isSelected()) {
																			wtime1_5.setSelected(true);
																			
																		}
																		else {
																			wtime1_5.setSelected(false);
																		}
																		
																		if(ttime2_5.isSelected()) {
																			wtime2_5.setSelected(true);
																			
																		}
																		else {
																			wtime2_5.setSelected(false);
																		}
																		if(ttime3_5.isSelected()) {
																			wtime3_5.setSelected(true);
																			
																		}
																		else {
																			wtime3_5.setSelected(false);
																		}
																		if(ttime4_5.isSelected()) {
																			wtime4_5.setSelected(true);
																			
																		}
																		else {
																			wtime4_5.setSelected(false);
																		}
																		
																		if(ttime5_5.isSelected()) {
																			wtime5_5.setSelected(true);
																			
																		}
																		else {
																			wtime5_5.setSelected(false);
																		}
																		
																	}
																	  
																  }
																  
																  	   class CListenerR5D2B3 implements ActionListener{

																	@Override
																	public void actionPerformed(ActionEvent event) {
																		if(ttime1_5.isSelected()) {
																			htime1_5.setSelected(true);
																			
																		}
																		else {
																			htime1_5.setSelected(false);
																		}
																		
																		if(ttime2_5.isSelected()) {
																			htime2_5.setSelected(true);
																			
																		}
																		else {
																			htime2_5.setSelected(false);
																		}
																		if(ttime3_5.isSelected()) {
																			htime3_5.setSelected(true);
																			
																		}
																		else {
																			htime3_5.setSelected(false);
																		}
																		if(ttime4_5.isSelected()) {
																			htime4_5.setSelected(true);
																			
																		}
																		else {
																			htime4_5.setSelected(false);
																		}
																		
																		if(ttime5_5.isSelected()) {
																			htime5_5.setSelected(true);
																			
																		}
																		else {
																			htime5_5.setSelected(false);
																		}
																		
																	}
																	  
																  }
																  
																  	   class CListenerR5D2B4 implements ActionListener{

																	@Override
																	public void actionPerformed(ActionEvent event) {
																		if(ttime1_5.isSelected()) {
																			ftime1_5.setSelected(true);
																			
																		}
																		else {
																			ftime1_5.setSelected(false);
																		}
																		
																		if(ttime2_5.isSelected()) {
																			ftime2_5.setSelected(true);
																			
																		}
																		else {
																			ftime2_5.setSelected(false);
																		}
																		if(ttime3_5.isSelected()) {
																			ftime3_5.setSelected(true);
																			
																		}
																		else {
																			ftime3_5.setSelected(false);
																		}
																		if(ttime4_5.isSelected()) {
																			ftime4_5.setSelected(true);
																			
																		}
																		else {
																			ftime4_5.setSelected(false);
																		}
																		
																		if(ttime5_5.isSelected()) {
																			ftime5_5.setSelected(true);
																			
																		}
																		else {
																			ftime5_5.setSelected(false);
																		}
																		
																	}
																	  
																  }
																  	   
																  	   // day 3
																  	   
																  	 class CListenerR5D3B1 implements ActionListener{

																 		@Override
																 		public void actionPerformed(ActionEvent event) {
																 			if(wtime1_5.isSelected()) {
																 				mtime1_5.setSelected(true);
																 				
																 			}
																 			else {
																 				mtime1_5.setSelected(false);
																 			}
																 			
																 			if(wtime2_4.isSelected()) {
																 				mtime2_5.setSelected(true);
																 				
																 			}
																 			else {
																 				mtime2_5.setSelected(false);
																 			}
																 			if(wtime3_5.isSelected()) {
																 				mtime3_5.setSelected(true);
																 				
																 			}
																 			else {
																 				mtime3_5.setSelected(false);
																 			}
																 			if(wtime4_5.isSelected()) {
																 				mtime4_5.setSelected(true);
																 				
																 			}
																 			else {
																 				mtime4_5.setSelected(false);
																 			}
																 			
																 			if(wtime5_5.isSelected()) {
																 				mtime5_5.setSelected(true);
																 				
																 			}
																 			else {
																 				mtime5_5.setSelected(false);
																 			}
																 			
																 		}
																 		  
																 	  }
																 	  
																 	   class CListenerR5D3B2 implements ActionListener{

																 		@Override
																 		public void actionPerformed(ActionEvent event) {
																 			if(wtime1_5.isSelected()) {
																 				ttime1_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ttime1_5.setSelected(false);
																 			}
																 			
																 			if(wtime2_5.isSelected()) {
																 				ttime2_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ttime2_5.setSelected(false);
																 			}
																 			if(wtime3_5.isSelected()) {
																 				ttime3_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ttime3_5.setSelected(false);
																 			}
																 			if(wtime4_5.isSelected()) {
																 				ttime4_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ttime4_5.setSelected(false);
																 			}
																 			
																 			if(wtime5_5.isSelected()) {
																 				ttime5_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ttime5_5.setSelected(false);
																 			}
																 			
																 		}
																 		  
																 	  }
																 	  
																 	  	   class CListenerR5D3B3 implements ActionListener{

																 		@Override
																 		public void actionPerformed(ActionEvent event) {
																 			if(wtime1_5.isSelected()) {
																 				htime1_5.setSelected(true);
																 				
																 			}
																 			else {
																 				htime1_5.setSelected(false);
																 			}
																 			
																 			if(wtime2_5.isSelected()) {
																 				htime2_5.setSelected(true);
																 				
																 			}
																 			else {
																 				htime2_5.setSelected(false);
																 			}
																 			if(wtime3_5.isSelected()) {
																 				htime3_5.setSelected(true);
																 				
																 			}
																 			else {
																 				htime3_5.setSelected(false);
																 			}
																 			if(wtime4_5.isSelected()) {
																 				htime4_5.setSelected(true);
																 				
																 			}
																 			else {
																 				htime4_5.setSelected(false);
																 			}
																 			
																 			if(wtime5_5.isSelected()) {
																 				htime5_5.setSelected(true);
																 				
																 			}
																 			else {
																 				htime5_5.setSelected(false);
																 			}
																 			
																 		}
																 		  
																 	  }
																 	  
																 	  	   class CListenerR5D3B4 implements ActionListener{

																 		@Override
																 		public void actionPerformed(ActionEvent event) {
																 			if(wtime1_5.isSelected()) {
																 				ftime1_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ftime1_5.setSelected(false);
																 			}
																 			
																 			if(wtime2_5.isSelected()) {
																 				ftime2_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ftime2_5.setSelected(false);
																 			}
																 			if(wtime3_5.isSelected()) {
																 				ftime3_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ftime3_5.setSelected(false);
																 			}
																 			if(wtime4_5.isSelected()) {
																 				ftime4_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ftime4_5.setSelected(false);
																 			}
																 			
																 			if(wtime5_5.isSelected()) {
																 				ftime5_5.setSelected(true);
																 				
																 			}
																 			else {
																 				ftime5_5.setSelected(false);
																 			}
																 			
																 		}
																 		  
																 	  }
																 	  	   //// day4
																 	  	   
																 	  	 class CListenerR5D4B1 implements ActionListener{

																 			@Override
																 			public void actionPerformed(ActionEvent event) {
																 				if(htime1_5.isSelected()) {
																 					mtime1_5.setSelected(true);
																 					
																 				}
																 				else {
																 					mtime1_5.setSelected(false);
																 				}
																 				
																 				if(htime2_5.isSelected()) {
																 					mtime2_5.setSelected(true);
																 					
																 				}
																 				else {
																 					mtime2_5.setSelected(false);
																 				}
																 				if(htime3_5.isSelected()) {
																 					mtime3_5.setSelected(true);
																 					
																 				}
																 				else {
																 					mtime3_5.setSelected(false);
																 				}
																 				if(htime4_5.isSelected()) {
																 					mtime4_5.setSelected(true);
																 					
																 				}
																 				else {
																 					mtime4_5.setSelected(false);
																 				}
																 				
																 				if(htime5_5.isSelected()) {
																 					mtime5_5.setSelected(true);
																 					
																 				}
																 				else {
																 					mtime5_5.setSelected(false);
																 				}
																 				
																 			}
																 			  
																 		  }
																 		  
																 		   class CListenerR5D4B2 implements ActionListener{

																 			@Override
																 			public void actionPerformed(ActionEvent event) {
																 				if(htime1_5.isSelected()) {
																 					ttime1_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ttime1_5.setSelected(false);
																 				}
																 				
																 				if(htime2_5.isSelected()) {
																 					ttime2_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ttime2_5.setSelected(false);
																 				}
																 				if(htime3_5.isSelected()) {
																 					ttime3_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ttime3_5.setSelected(false);
																 				}
																 				if(htime4_5.isSelected()) {
																 					ttime4_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ttime4_5.setSelected(false);
																 				}
																 				
																 				if(htime5_5.isSelected()) {
																 					ttime5_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ttime5_5.setSelected(false);
																 				}
																 				
																 			}
																 			  
																 		  }
																 		  
																 		  	   class CListenerR5D4B3 implements ActionListener{

																 			@Override
																 			public void actionPerformed(ActionEvent event) {
																 				if(htime1_5.isSelected()) {
																 					wtime1_5.setSelected(true);
																 					
																 				}
																 				else {
																 					wtime1_5.setSelected(false);
																 				}
																 				
																 				if(htime2_5.isSelected()) {
																 					wtime2_5.setSelected(true);
																 					
																 				}
																 				else {
																 					wtime2_5.setSelected(false);
																 				}
																 				if(htime3_5.isSelected()) {
																 					wtime3_5.setSelected(true);
																 					
																 				}
																 				else {
																 					wtime3_5.setSelected(false);
																 				}
																 				if(htime4_5.isSelected()) {
																 					wtime4_5.setSelected(true);
																 					
																 				}
																 				else {
																 					wtime4_5.setSelected(false);
																 				}
																 				
																 				if(htime5_5.isSelected()) {
																 					wtime5_5.setSelected(true);
																 					
																 				}
																 				else {
																 					wtime5_5.setSelected(false);
																 				}
																 				
																 			}
																 			  
																 		  }
																 		  
																 		  	   class CListenerR5D4B4 implements ActionListener{

																 			@Override
																 			public void actionPerformed(ActionEvent event) {
																 				if(htime1_5.isSelected()) {
																 					ftime1_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ftime1_5.setSelected(false);
																 				}
																 				
																 				if(htime2_5.isSelected()) {
																 					ftime2_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ftime2_5.setSelected(false);
																 				}
																 				if(htime3_5.isSelected()) {
																 					ftime3_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ftime3_5.setSelected(false);
																 				}
																 				if(htime4_5.isSelected()) {
																 					ftime4_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ftime4_5.setSelected(false);
																 				}
																 				
																 				if(htime5_5.isSelected()) {
																 					ftime5_5.setSelected(true);
																 					
																 				}
																 				else {
																 					ftime5_5.setSelected(false);
																 				}
																 				
																 			}
																 			  
																 		  }
																 		  	   //day 5
																 		  	   
																 		  	 class CListenerR5D5B1 implements ActionListener{

																 				@Override
																 				public void actionPerformed(ActionEvent event) {
																 					if(ftime1_5.isSelected()) {
																 						mtime1_5.setSelected(true);
																 						
																 					}
																 					else {
																 						mtime1_5.setSelected(false);
																 					}
																 					
																 					if(ftime2_5.isSelected()) {
																 						mtime2_5.setSelected(true);
																 						
																 					}
																 					else {
																 						mtime2_5.setSelected(false);
																 					}
																 					if(ftime3_5.isSelected()) {
																 						mtime3_5.setSelected(true);
																 						
																 					}
																 					else {
																 						mtime3_5.setSelected(false);
																 					}
																 					if(ftime4_5.isSelected()) {
																 						mtime4_5.setSelected(true);
																 						
																 					}
																 					else {
																 						mtime4_5.setSelected(false);
																 					}
																 					
																 					if(ftime5_5.isSelected()) {
																 						mtime5_5.setSelected(true);
																 						
																 					}
																 					else {
																 						mtime5_5.setSelected(false);
																 					}
																 					
																 				}
																 				  
																 			  }
																 			  
																 			   class CListenerR5D5B2 implements ActionListener{

																 				@Override
																 				public void actionPerformed(ActionEvent event) {
																 					if(ftime1_5.isSelected()) {
																 						ttime1_5.setSelected(true);
																 						
																 					}
																 					else {
																 						ttime1_5.setSelected(false);
																 					}
																 					
																 					if(ftime2_5.isSelected()) {
																 						ttime2_5.setSelected(true);
																 						
																 					}
																 					else {
																 						ttime2_5.setSelected(false);
																 					}
																 					if(ftime3_5.isSelected()) {
																 						ttime3_5.setSelected(true);
																 						
																 					}
																 					else {
																 						ttime3_5.setSelected(false);
																 					}
																 					if(ftime4_5.isSelected()) {
																 						ttime4_5.setSelected(true);
																 						
																 					}
																 					else {
																 						ttime4_5.setSelected(false);
																 					}
																 					
																 					if(ftime5_5.isSelected()) {
																 						ttime5_5.setSelected(true);
																 						
																 					}
																 					else {
																 						ttime5_5.setSelected(false);
																 					}
																 					
																 				}
																 				  
																 			  }
																 			  
																 			  	   class CListenerR5D5B3 implements ActionListener{

																 				@Override
																 				public void actionPerformed(ActionEvent event) {
																 					if(ftime1_5.isSelected()) {
																 						wtime1_5.setSelected(true);
																 						
																 					}
																 					else {
																 						wtime1_5.setSelected(false);
																 					}
																 					
																 					if(ftime2_5.isSelected()) {
																 						wtime2_5.setSelected(true);
																 						
																 					}
																 					else {
																 						wtime2_5.setSelected(false);
																 					}
																 					if(ftime3_5.isSelected()) {
																 						wtime3_5.setSelected(true);
																 						
																 					}
																 					else {
																 						wtime3_5.setSelected(false);
																 					}
																 					if(ftime4_5.isSelected()) {
																 						wtime4_5.setSelected(true);
																 						
																 					}
																 					else {
																 						wtime4_5.setSelected(false);
																 					}
																 					
																 					if(ftime5_5.isSelected()) {
																 						wtime5_5.setSelected(true);
																 						
																 					}
																 					else {
																 						wtime5_5.setSelected(false);
																 					}
																 					
																 				}
																 				  
																 			  }
																 			  
																 			  	   class CListenerR5D5B4 implements ActionListener{

																 				@Override
																 				public void actionPerformed(ActionEvent event) {
																 					if(ftime1_5.isSelected()) {
																 						htime1_5.setSelected(true);
																 						
																 					}
																 					else {
																 						htime1_5.setSelected(false);
																 					}
																 					
																 					if(ftime2_5.isSelected()) {
																 						htime2_5.setSelected(true);
																 						
																 					}
																 					else {
																 						htime2_5.setSelected(false);
																 					}
																 					if(ftime3_5.isSelected()) {
																 						htime3_5.setSelected(true);
																 						
																 					}
																 					else {
																 						htime3_5.setSelected(false);
																 					}
																 					if(ftime4_5.isSelected()) {
																 						htime4_5.setSelected(true);
																 						
																 					}
																 					else {
																 						htime4_5.setSelected(false);
																 					}
																 					
																 					if(ftime5_5.isSelected()) {
																 						htime5_5.setSelected(true);
																 						
																 					}
																 					else {
																 						htime5_5.setSelected(false);
																 					}
																 					
																 				}
																 				  
																 			  }
																 			  	   class CListenersub implements ActionListener{

																		 				@Override
																		 				public void actionPerformed(ActionEvent event) {
																		 					createSchedule();
																		 					JOptionPane.showMessageDialog(null, "Submitted");
																		 					
																		 				}
																		 				  
																		 			  }
													  

									  

			 
}

	  
	  //end



