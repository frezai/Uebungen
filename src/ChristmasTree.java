
public class ChristmasTree {
	public static void main(String[] args) {
		/*
		 * I				0 - 9		1	+	0		= 1
		 * III				10 - 19		2	+	1		= 3
		 * IIIII			20 - 29		3	+	2		= 5
		 * IIIIIII			30 - 39		4	+	3		= 7
		 * IIIIIIIII		40 - 49		5	+	4		= 9
		 * ...	 	
		 */
		
		int height = 25;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i + i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// stamm
		for(int i = 0; i < height / 2; i++) {
			System.out.print(" ");
		}
		int counter1 = (height / 10) + 1;
		for(int i = 1; i <= height / 10 + counter1; i++) {
			System.out.print("I");
		}
	}
}