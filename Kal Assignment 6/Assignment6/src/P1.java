
public class P1 {

	public static void main(String[] args) {
		String s = "labbahj";
		String d = "fabbdbbau";
		String p = "vera";
		System.out.println(longestPalindrom(s));
		System.out.println(longestPalindrom(d));
		System.out.println(longestPalindrom(p));
	}
	
	public static String longestPalindrom(String s) {
		int start = 0;
		int end = 0;
		for(int i = 0; i < s.length(); i++) {
			int len1 = getPalLength(s, i, i);
			int len2 = getPalLength(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}
	
	public static int getPalLength(String s, int i, int j) {
		int L = i;
		int R = j; 
		while( L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}
}
