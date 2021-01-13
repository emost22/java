package BOJ.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9251_2 {
	static String str[] = new String[2];
	static int dp[][] = new int[1001][1001];

	static void func() {
		String str1[] = str[0].split("");
		String str2[] = str[1].split("");
		int x = str[0].length();
		int y = str[1].length();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (str1[i].equals(str2[j])) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}
			}
		}

		System.out.println(dp[x][y]);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		str[0] = st.nextToken();
		st = new StringTokenizer(br.readLine());
		str[1] = st.nextToken();
		func();
	}
}
