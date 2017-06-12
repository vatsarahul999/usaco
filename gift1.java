
/*
ID: vatsa.r1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class gift1 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		int np = Integer.parseInt(st.nextToken());
		Map<String, Integer> moneyMap = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < np; i++) {
			st = new StringTokenizer(f.readLine());
			moneyMap.put(st.nextToken(), 0);
		}
		String line = null;
		while ((line = f.readLine()) != null) {
			st = new StringTokenizer(line);
			String key = st.nextToken();
			st = new StringTokenizer(f.readLine());
			int totalAmout = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			if (s != 0) {
				int amt = totalAmout / s;
				int pa = totalAmout % s - totalAmout;
				int a = moneyMap.get(key) + pa;
				moneyMap.put(key, a);
				for (int j = 0; j < s; j++) {
					st = new StringTokenizer(f.readLine());
					key = st.nextToken();
					int ca = moneyMap.get(key);
					ca += amt;
					moneyMap.put(key, ca);
				}
			} else {
				int ca = moneyMap.get(key);
				ca += totalAmout;
				moneyMap.put(key, ca);
			}

		}
		for (Entry<String, Integer> entry : moneyMap.entrySet()) {
			out.print(entry.getKey() + " " + entry.getValue() + "\n");
		}
		out.close(); // close the output file
	}
}