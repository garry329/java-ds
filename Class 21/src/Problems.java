
public class Problems {
	public static void main(String[] args) {
		// char[]c=new char[3];
		// printwrongpermu("abc",c,0);
		// int [] a={1,200,100,20,80};
		// int []sum=new int[a.length];
		// System.out.println(maxarray2(a,0,sum));
		// System.out.println(printlcs("abcd","a1b34c312d"));
		// System.out.println(maxarray(a,0));
		// int out[][]=new int["abcd".length()+1]["ab23c56d78".length()+1];
		// for(int i=0;i<out.length;i++){
		// for(int j=0;j<out[i].length;j++){
		// out[i][j]=-1;
		// }
		// }
		// System.out.println(printlcs2("abc","ab23c56d78",out));
		System.out.println(editdistiter("abcd", "abcdefgh"));
	}

	public static int editdist(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}
		if (s1.charAt(0) == s2.charAt(0)) {
			return editdist(s1.substring(1), s2.substring(1));
		} else {
			int a1 = 1 + editdist(s1.substring(1), s2);
			int a2 = 1 + editdist(s1, s2.substring(1));
			int a3 = 1 + editdist(s1.substring(1), s2.substring(1));
			int sans = Math.min(a1, a2);
			return Math.min(sans, a3);
		}
	}

	public static int editdistiter(String s1, String s2) {
		int out[][] = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i <= s2.length(); i++) {
			out[0][i] = i;
		}
		for (int i = 0; i <= s1.length(); i++) {
			out[i][0] = i;
		}
		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s1.charAt(s1.length() - i) == s2.charAt(s2.length() - j)) {
					out[i][j] = out[i - 1][j - 1];
				} else {
					int a1 = 1 + out[i - 1][j];
					int a2 = 1 + out[i][j - 1];
					int a3 = 1 + out[i - 1][j - 1];
					out[i][j] = Math.min(Math.min(a1, a2), a3);
				}
			}
		}
		return out[s1.length()][s2.length()];
	}

	public static void printwrongpermu(String s, char[] out, int pos) {
		if (s.length() == pos) {
			print(out);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (j != i) {
					out[j] = s.charAt(i);
					printwrongpermu(s, out, pos);
					pos++;
				}
			}
		}
	}

	public static void hanoiIter(int n) {
    	
	}

	public static int printlcs2(String s1, String s2, int[][] out) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (out[s1.length()][s2.length()] > -1) {
			return out[s1.length()][s2.length()];
		}
		int ans;
		if (s1.charAt(0) == s2.charAt(0)) {
			return 1 + printlcs2(s1.substring(1), s2.substring(1), out);
		} else {
			ans = Math.max(printlcs2(s1, s2.substring(1), out), printlcs2(s1.substring(1), s2, out));
		}
		out[s1.length()][s2.length()] = ans;
		return ans;
	}

	public static int printlcs(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (s1.charAt(0) == s2.charAt(0)) {
			return 1 + printlcs(s1.substring(1), s2.substring(1));
		} else {
			return Math.max(printlcs(s1, s2.substring(1)), printlcs(s1.substring(1), s2));
		}
	}

	public static int maxarray2(int[] a, int i, int[] sum) {
		if (i >= a.length) {
			return 0;
		}
		if (sum[i] > 0) {
			return sum[i];
		}
		int s1 = maxarray2(a, i + 2, sum) + a[i];
		int s2 = maxarray2(a, i + 1, sum);
		sum[i] = Math.max(s1, s2);
		return sum[i];
	}

	public static int maxarray(int a[], int i) {
		if (i >= a.length) {
			return 0;
		}
		int s1 = maxarray(a, i + 2) + a[i];
		int s2 = maxarray(a, i + 1);
		return Math.max(s1, s2);
	}

	public static void print(char a[]) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
}
