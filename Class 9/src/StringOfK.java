import java.util.*;

public class StringOfK {

	public static void main(String[] args) {
		printpermu("a2bc", "");
	}

	public static void printsk(String s, String outTillNow, int len) {
		if (outTillNow.length() == len) {
			System.out.println(outTillNow);
			outTillNow = "";
			return;
		}

		for (int i = 0; i < s.length(); i++)
			printsk(s, outTillNow + s.charAt(i), len);
	}

	public static void printkeypad(String s, String outTillNow) {
		if (s.length() == 1) {
			for (int i = 0; i < getString(s.charAt(0)).length(); i++) {
				System.out.println(outTillNow + getString(s.charAt(0)).charAt(i));
			}
			return;
		}
		for (int j = 0; j < getString(s.charAt(0)).length(); j++) {
			printkeypad(s.substring(1), outTillNow + getString(s.charAt(0)).charAt(j));
		}
	}

	public static void printpermu(String s, String outTillNow) {
		if (s.length() == 0) {
			System.out.println(outTillNow);
			return;
		} else {
			for (int i = 0; i < s.length(); i++) {
				printpermu(s.substring(0, i) + s.substring(i + 1, s.length()), outTillNow + s.charAt(i));

			}
		}
	}

	public static void printsubseq(String s, String outTillNow) {
		if (s.length() == 0) {
			System.out.println(outTillNow);
			return;
		}
		printsubseq(s.substring(1), outTillNow);
		printsubseq(s.substring(1), outTillNow + s.charAt(0));
	}

	public static String getString(char c) {
		String ans = "";
		if (c == '2') {
			ans = "abc";
		} else if (c == '3') {
			ans = "def";
		} else if (c == '4') {
			ans = "ghi";
		} else if (c == '5') {
			ans = "jkl";
		} else if (c == '6') {
			ans = "mno";
		} else if (c == '7') {
			ans = "pqrs";
		} else if (c == '8') {
			ans = "tuv";
		} else if (c == '9') {
			ans = "wxyz";
		}
		return ans;
	}

	public static void print(String a[]) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
