import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		//int x = random.nextInt(20)+1; //Random number from 1 to 20
		//double y = random.nextDouble(); // Random number from 0 to 1
		boolean z = random.nextBoolean(); // Random true or false
		
		System.out.println(z);
	}
}
