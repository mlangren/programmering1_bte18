package programmering1_bte18.loopar;

public class Loopstar {

	public static void main(String[] args) {

		for (int k = 0; k < 3; k++) {

			for (int i = 0; i < k+5; i++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
