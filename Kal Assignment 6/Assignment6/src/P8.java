
public class P8 {
	public static void main(String[] args) {
		String s1 = "bcd";
		String s2 = "abbcde";
		System.out.println(strstr(s1,s2));
	}
	
	public static int strstr(String s1, String s2) {
		int c1 = 0;
		int c2 = 0;
		for(int i = 0; i < s2.length(); i++) {
			c2 = i;
			if(s2.charAt(i) == s1.charAt(0)) {
				while(c2 < s2.length() && c1 < s1.length()) {
					if(s2.charAt(c2) == s1.charAt(c1)) {
						c1++;
						c2++;
					}else {
						c1 = 0;
						break;
					}
				}
				if(c1 == s1.length() ) {
					return i;
				}
			}
		}
		return -1;
	}
}
