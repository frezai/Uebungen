

public class Empty {

	public static void main(String[] args) {

		int column = 9;
		int xColumn = column - 1;

		int row = 4;
		int yRow = row - 1;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if ((i % yRow == 0) || (j % xColumn == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

