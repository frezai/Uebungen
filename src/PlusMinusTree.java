

public class PlusMinusTree {
	
	public static void main(String[] args) {

		int height = 5;
		int x = height -1;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height - i - 1; j++) {
				System.out.print(".");
			}
			for (int k = 0; k <= i + i; k++) {
				if(i == 0 || i == height - 1 || k == 0 || k / 2  == i) { //Inhalt mit Minus und Rahmen mit Plus
					System.out.print("+");
				} else{
					System.out.print("-");
				}	
			}
				System.out.println();
		}
	}

}