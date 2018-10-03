
public class P3 {
	public static void main(String[] args) {
		//String string1 = "amazon";
		//String string2 = "azonam"; 
		String string1 = "amazon";
		String string2 = "onamaz";
		System.out.println(rotatedString(string1, string2));
	}
	
	public static boolean rotatedString (String s1, String s2) {
        if (s1.length() != s2.length()) 
            return false; 
       
        String clock_rot = ""; 
        String anticlock_rot = ""; 
        int len = s2.length(); 
       
        // Initialize string as anti-clockwise rotation 
        anticlock_rot = anticlock_rot + s2.substring(len-2, len) + s2.substring(0, len-2) ; 
       
        // Initialize string as clock wise rotation 
        clock_rot = clock_rot + s2.substring(2) + s2.substring(0, 2) ; 
       
        // check if any of them is equal to string1 
        return (s1.equals(clock_rot) || s1.equals(anticlock_rot)); 
	}
}
