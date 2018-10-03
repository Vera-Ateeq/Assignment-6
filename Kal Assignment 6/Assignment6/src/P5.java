
public class P5 {
	public static void main(String[] args) {
		String s1 = "abxcxdxe";
		String s2 = "xbycydyyef";
		System.out.println(longestSubstring(s1,s2));
	}
	
	public static int longestSubstring(String st1, String st2) {
		int s1 = st1.length();
		int s2 = st2.length();
		int[][] arr = new int[s1 + 1][s2 + 1];
		int longest = 0;
	
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[0].length; j++) {
				if(st1.charAt(i - 1) == st2.charAt(j - 1)) {
					arr[i][j] = 1 + arr[i-1][j-1];
					if(arr[i][j] > longest) {
						longest = arr[i][j];
					}
				}else {
					arr[i][j] = 0;
				}
			}
		}
		return longest;
	}
}
