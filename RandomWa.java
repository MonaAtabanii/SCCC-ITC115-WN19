import java.util.Random;

public class RandomWa {

	public static void main(String[] args) {
		//
		randomWalk();
	}
	
	public static void randomWalk() {
		int position = 0, maxPosition = 0;
		Random r = new Random();
		//int rInt = 
		System.out.println("position = " + position);
		while (position >-3 && position <3) {
			//position = (int)(Math.random()*(((3 - (-3))+1)+-3));
			int getRandom = r.nextInt(3);
			if (getRandom == 0)
			{ position++;}
			else {position--;}
			System.out.println("position = " + position);
			//if (position == 0)
			//	{ position++;}
			//else {--position
			if (maxPosition <= position) {
				maxPosition = position;
			}
			
		}
		System.out.print("max position = " + maxPosition);
	}
	
	/*public static int getRand (Random r) {
	int rInt = r.nextInt();
	while (rInt>-3 && rInt<3) {
	return rInt;}*/
}
