import java.io.Serializable;

public class Room implements Serializable {
	  Day day1=new Day();
	  Day day2=new Day();
	  Day day3=new Day();
	  Day day4=new Day();
	  Day day5=new Day();
	  boolean fal=false;
	  boolean win=false;
	  String nam ="";
	 boolean av =false ;
	 public Room() {
		 
	 }
	 public Day getD1() {
		 return day1 ;
	 }
	 public Day getD2() {
		 return day2 ;
	 }
	 public Day getD3() {
		 return day3 ;
	 }
	 public Day getD4() {
		 return day4 ;
	 }
	 public Day getD5() {
		 return day5 ;
	 }
	 public boolean getAv() {
		 return av;
	 }
	 public boolean getW() {
		 return win;
	 }
	 public boolean getF() {
		 return fal;
	 }
	 
	 public String getName() {
		 return nam;
	 }
	 
	 public void setName(String n) {
		nam=n;
	 }
	 
	 public void setW(boolean b) {
		 win=b;
	 }
	 
	 public void setF(boolean b) {
		 fal=b;
	 }
	 
public void setD1(Day d) {
	 day1=d ;
	 av=true;
}
public void setD2(Day d) {
	 day2=d ;
	 av=true;
}
public void setD3(Day d) {
	 day3=d ;
	 av=true;
}
public void setD4(Day d) {
	 day4=d ;
	 av=true;
}
public void setD5(Day d) {
	 day5=d ;
	 av=true;
}

}

