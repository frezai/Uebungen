
public class Empty {
	public static void main(String[] args) {
			
		int x  = 5;
		x = x- 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if((i % x== 0) || (j % x== 0)) {
					System.out.print("*");
			} else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
