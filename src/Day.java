import java.io.Serializable;

public class Day implements Serializable {
   boolean time1=false;
   boolean time2=false;
   boolean time3=false;
   boolean time4=false;
   boolean time5=false;
   boolean av;
   public Day() {
	   time1=false;
	   time2=false;
	   time3=false;
	   time4=false;
	   time5=false;
	   av=false;
   }
   public boolean getT1() {
	   return time1;
   }
   public boolean getT2() {
	   return time2;
   }
   public boolean getT3() {
	   return time3;
   }
   public boolean getT4() {
	   return time4;
   }
   public boolean getT5() {
	   return time5;
   }
   public boolean getAv() {
	   return av;
   }
   public void setT1(boolean t) {
	   time1=t;
	   av=true;
   }
   public void setT2(boolean t) {
	   time2=t;
	   av=true;

   }
   public void setT3(boolean t) {
	   time3=t;
	   av=true;

   }
   public void setT4(boolean t) {
	   time4=t;
	   av=true;
   }
   public void setT5(boolean t) {
	   time5=t;
	   av=true;
   }

}
