
public class P7 {
	public static void main(String[] args) {
		String s = "-119991";
		System.out.print(atoi(s));
	}
	
	public static int atoi(String s) {
		int value = 0;
		int sign = 1;
		if(s.charAt(0) == '-') {
			sign = -1;
			value = s.charAt(1) - '0';
			for(int i = 2; i < s.length(); i++) {
				value = (value * 10) + (s.charAt(i) - '0'); 
			}
		}else {
			value = s.charAt(0) - '0';
			for(int i = 1; i < s.length(); i++) {
				value = (value * 10) + (s.charAt(i) - '0'); 
			}
		}
		
		return sign * value;
	}
}
