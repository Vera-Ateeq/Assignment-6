import java.util.HashMap;

public class P4 {
	public static void main(String[] args) {
		String s = "XIV";
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		int value = hm.get(s.charAt(s.length() - 1));
		Character prev = s.charAt(s.length() - 1);
		for(int i = s.length() - 2; i >= 0; i--) {
			if(hm.get(s.charAt(i)) >= hm.get(prev)) {
				value = value + hm.get(s.charAt(i));
				prev = s.charAt(i);
			}else {
				value = value - hm.get(s.charAt(i));
				prev = s.charAt(i);
			}
		}
		return value;
	}
}
