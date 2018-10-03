
public class P2 {

	public static void main(String[] args) {
		//String s = "abbccbd";
		String s = "axzzxy";
		System.out.println(noDuplicates(s));
	}
	
	public static String noDuplicates(String s) {
		return removeDuplicates(s, 0);
	}
	
	public static String removeDuplicates(String s, int start) {
		if(s.length() == 0) {
			return "";
		}
		if(start == s.length() - 1) {
			return s.charAt(s.length() - 1) + "";
		}
		if(start == s.length()) {
			return "";
		}
		int count = 0;		
		while(start < s.length() && (start + count) < s.length()) {
			if(s.charAt(start) ==  s.charAt(start + count)) {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
		String result = removeDuplicates(s, start + count);
		if(count == 1) {
			if(result.length() > 0 && result.charAt(0) == s.charAt(start)) {
				System.out.println("count == 1: " + result);
				return result.substring(1);
			}else {
				System.out.println("count == 1 else: "+ result);
				return s.charAt(start) + result;
			}
		}else {
			System.out.println("else "+ result);
			return result;
		}
		
		
	}
}
