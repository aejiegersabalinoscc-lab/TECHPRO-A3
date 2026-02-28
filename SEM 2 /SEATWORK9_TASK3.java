import java.util.Random;

public class SEATWORK9_TASK3 {
	public static void main(String[] args) {
	
	Random random = new Random();
	
	int number;
	boolean isHeads;
	
	number = random.nextInt(6) +1;
	
	isHeads = random.nextBoolean();
	
	System.out.println(number);
	
	if(isHeads){
		System.out.println("HEADS");
	}
	else{
		System.out.println("TAILS");
	}
	}
}
