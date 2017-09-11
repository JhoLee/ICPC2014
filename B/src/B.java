import java.util.*;

public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // Number of cases
		// Test Loop
		for (int i = 0; i < T; i++) {

			// Info Data Input..
			int M = sc.nextInt(); // Number of rows
			int N = sc.nextInt(); // Number of columns
			int L = sc.nextInt(); // Time for ...
			int G = sc.nextInt(); // Fuel

			// Test Data Input..
			int[][] H = new int[M][N - 1]; // Fuel for Horizontal..
			int[][] V = new int[M - 1][N]; // Fuel for Vertical..

			for (int row = 0; row < H.length; row++) {
				for (int col = 0; col < H[i].length; col++) {
					H[row][col] = sc.nextInt();

				}
			}

			for (int row = 0; row < V.length; row++) {
				for (int col = 0; col < V[i].length; col++) {
					V[row][col] = sc.nextInt();

				}
			}
			// End of "Test Data Input.."
			
			
			for (int row = 0; row < H.length; row++) {
				for (int col = 0; col < H[i].length; col++) {
					H[row][col] = sc.nextInt();

				}
			}

			for (int row = 0; row < V.length; row++) {
				for (int col = 0; col < V[i].length; col++) {
					V[row][col] = sc.nextInt();

				}
			}

		} // End of Test Loop
	}

}
