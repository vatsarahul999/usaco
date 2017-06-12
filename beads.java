import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
/*
ID: vatsa.r1
LANG: JAVA
TASK: beads
*/

class beads {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

		int N = Integer.parseInt(br.readLine());
		String allBeads = br.readLine();
		allBeads += allBeads;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 2 * N; i++) {
			int forwardMax = 0;
			char currentChar = 'w';
			int v = 0;
			for (int k = i; k < 2 * N; k++) {
				if (allBeads.charAt(k) == currentChar || allBeads.charAt(k) == 'w') {
					forwardMax++;
					if (allBeads.charAt(k) != 'w') {
						v = 10;
						currentChar = allBeads.charAt(k);
					}

				} else if (allBeads.charAt(k) != 'w') {
					if (v == 0) {
						v = 10;
						forwardMax++;
						currentChar = allBeads.charAt(k);
					} else
						break;
				}
			}

			currentChar = 'w';
			int backwardMax = 0;
			v = 0;
			for (int k = i - 1; k >= 0; k--) {
				if (allBeads.charAt(k) == currentChar || allBeads.charAt(k) == 'w') {
					backwardMax++;
					if (allBeads.charAt(k) != 'w') {
						v = 10;
						currentChar = allBeads.charAt(k);
					}

				} else if (allBeads.charAt(k) != 'w') {
					if (v == 0) {
						v = 10;
						backwardMax++;
						currentChar = allBeads.charAt(k);
					} else
						break;
				}
			}
			if (forwardMax + backwardMax > max) {
				max = forwardMax + backwardMax;
			}
			if (forwardMax + backwardMax >= N) {
				max = N;
				break;
			}
		}
		out.write("" + max + "\n");
		out.close();

	}
}
