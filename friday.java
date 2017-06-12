import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
ID: vatsa.r1
LANG: JAVA
TASK: friday
*/
public class friday {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		Map<Integer, Integer> mapMonth = new HashMap<Integer, Integer>();
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 0; i < 7; i++)
			result.put(i, 0);
		mapMonth.put(1, 31);
		mapMonth.put(2, 28);
		mapMonth.put(3, 31);
		mapMonth.put(4, 30);
		mapMonth.put(5, 31);
		mapMonth.put(6, 30);
		mapMonth.put(7, 31);
		mapMonth.put(8, 31);
		mapMonth.put(9, 30);
		mapMonth.put(10, 31);
		mapMonth.put(11, 30);
		mapMonth.put(12, 31);
		int day = 0;
		for (int i = 1900; i < (1900 + N); i++) {
			for (int j = 1; j <= 12; j++) {

				int key = (day + 12) % 7;
				int count = result.get(key);
				count++;
				result.put(key, count);
				day += mapMonth.get(j);
				if (isLeapYear(i) && j == 2)
					day++;
			}
		}
		for (int i = 5; i < 12; i++) {
			out.print(Integer.toString(result.get(i % 7)));
			if(i==11)
				out.print("\n");
			else
				out.print(" ");
		}
		out.close();
	}

	private static boolean isLeapYear(int i) {
		if (i % 100 == 0) {
			return i % 400 == 0;
		} else {
			return i % 4 == 0;
		}
	}

}
