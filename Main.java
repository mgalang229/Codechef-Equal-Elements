import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
				max = Math.max(max, a[i]);
			}
			int[] freq = new int[max+1];
			Arrays.fill(freq, 0);
			for (int x : a) {
				freq[x]++;
			}
			int min = Integer.MAX_VALUE;
			for (int x : a) {
				min = Math.min(min, n - freq[x]);
			}
			System.out.println(min);
		}
		fs.close();
	}
}
