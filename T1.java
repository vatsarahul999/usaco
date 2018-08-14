
public class T1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		double inversSum = 0;
		for (int e : arr) {
			sum += e;
			inversSum += ((double) 1 / e);
		}
		double res = sum * inversSum;
		System.out.println(res);
	}

}
