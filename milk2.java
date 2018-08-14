import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
ID: vatsa.r1
LANG: JAVA
TASK: milk2
*/
public class milk2 {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		StringTokenizer sTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(sTokenizer.nextToken());
		int minTimeFree = Integer.MAX_VALUE;
		int maxTimeContious = Integer.MIN_VALUE;
		int currentMax = 0;
		int maxStTime = 0;
		int maxEndtime = 0;
		int currentMin = 0;
		int prEndTime = 0;
		for (int i = 0; i < N; i++) {
			sTokenizer = new StringTokenizer(bufferedReader.readLine());
			int stTime = Integer.parseInt(sTokenizer.nextToken());
			int enTime = Integer.parseInt(sTokenizer.nextToken());
			if (i == 0) {
				prEndTime = enTime;
				maxStTime = stTime;
				continue;
			}
			if (stTime <= prEndTime) {
				currentMax += enTime;
			} else {
				currentMin = stTime - prEndTime;
				maxEndtime = prEndTime;
				if (currentMin < minTimeFree)
					minTimeFree = currentMin;
				currentMax = maxEndtime - maxStTime;
				if (currentMax > maxTimeContious) {
					maxTimeContious = currentMax;
				}
				maxStTime = stTime;
			}
			prEndTime = enTime;

		}
		if (currentMin < minTimeFree)
			minTimeFree = currentMin;
		currentMax = prEndTime - maxStTime;
		if (currentMax > maxTimeContious) {
			maxTimeContious = currentMax;
		}
		
		out.print("" + maxTimeContious + " " + minTimeFree + "\n");
		out.close();
		bufferedReader.close();
	}

}
