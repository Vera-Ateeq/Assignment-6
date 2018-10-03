import java.util.HashSet;

public class P6 {
	public static void main(String[] args) {
		String s = "abcabc";
		System.out.println(distinctLongestSubstring(s));
	}
	
	public static int distinctLongestSubstring( String s) {
		HashSet<Character> set = new HashSet<Character>();
		int maxSoFar = 0;
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				maxSoFar++;
			}else {
				max = 1;
			}
			if(maxSoFar > max) {
				max = maxSoFar;
			}
		}
		return max;
	}
}
