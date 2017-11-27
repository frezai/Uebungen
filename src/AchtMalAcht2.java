

public class AchtMalAcht2 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 8; i++) {
			for(int j = i; j < 8 + i; j++) {
				if(j < 9) {
					System.out.print("#");
					System.out.print(" ");
				} else {
					System.out.print("_");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
