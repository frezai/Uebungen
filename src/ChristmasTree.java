public class ChristmasTree {

	public static void main(String[] args) {

		int height = 49;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height -i -1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <(i * 2 + 1); k++) {
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