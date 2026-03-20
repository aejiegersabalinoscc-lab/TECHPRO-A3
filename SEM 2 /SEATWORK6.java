   class SEATWORK6 {
	String name;
	
	void displayName() {
		System.out.println("Worker name: " + name);
	}
}
public class SEATWORK6 {

public static void main(String[ ]args) {
  	
  	
  	Worker w1 = new Worker( );
  	w1.name = "XiaoPang Lee Quaila";
  	
      try {
      	w1.displayName( );
      } catch (Exception e) {
      	System.out.println("Error: Worker Inputed isnt registered");
      }
  }
}
