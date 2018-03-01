import java.util.*;

public class Maps {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	System.out.println(maxFreqWord(s));
	}

	public static String maxFreqWord(String s) {
		Map<String, Integer> freq = new Map<>();
		int currentWordStart = 0;
		int maxFreq = 0;
		String maxWord = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				String currentWord = s.substring(currentWordStart, i);
				int currentFreq = 0;
				Integer currentfreqint=freq.get(currentWord);
				if (currentfreqint!=null) {
					currentFreq = currentfreqint;
				}
				freq.adde(currentWord, currentFreq + 1);
				int newFreq = currentFreq + 1;
				if (newFreq > maxFreq) {
					maxFreq = currentFreq;
					maxWord = currentWord;
				}
				currentWordStart = i + 1;
			}
		}
		return maxWord;
	}

	public static void intersectionUnsorted(int[] a1, int[] a2) {
		HashMap<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < a1.length; i++) {
			map1.put(a1[i], 1);
		}

		for (int i = 0; i < a2.length; i++) {
			if (map1.containsKey(a2[i])) {
				System.out.println(map1.get(a2[i]));
			}
		}
	}

	public static void pairsumtok(int a[], int k) {
		HashMap<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			map1.put(a[i], 1);

			if (map1.containsKey(k - a[i])) {
				System.out.println(a[i] + " " + (k - a[i]));
			}
		}
	}

	public static void pairsumkrepeat(int a[], int k) {
		HashMap<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			if (map1.containsKey(a[i])) {
				c = map1.get(a[i]);
			}
			
		}

	}

}
