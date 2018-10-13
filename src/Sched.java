import java.io.Serializable;
import java.util.*;
public class Sched implements Serializable {
  Room R1=new Room();
  Room R2=new Room();
  Room R3=new Room();
  Room R4=new Room();
  Room R5=new Room();
  String nam ="";
  ArrayList<Sched> a =new ArrayList<Sched>();
  
  public Sched() {
	  
  }
  public Room getR1() {
	  return R1;
  }
  
  public Room getR2() {
	  return R2;
  }
  public Room getR3() {
	  return R3;
  }
  public Room getR4() {
	  return R4;
  }
  public Room getR5() {
	  return R5;
  }
  public ArrayList<Sched> get() {
	  return a;
  }
  
	 public String getName() {
		 return nam;
	 }
	 
	 public void setName(String n) {
		nam=n;
	 }
  public void add(Sched s) {
	  a.add(s);
  }
  public void setR1(Room r) {
	  R1=r;

  }
  
  public void setR2(Room r) {
	  R2=r;
	  
  }
  
  public void setR3(Room r) {
	  R3=r;
	  
  }
  
  public void setR4(Room r) {
	  R4=r;
	  
  }
  
  public void setR5(Room r) {
	  R5=r;
	  
  }
  
  
}
