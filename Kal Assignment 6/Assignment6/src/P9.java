
public class P9 {
	public static void main(String[] args) {
	    String[] arr = {"apple", "ape", "april"}; 
	    System.out.println(longestCommonPrefix(arr));
	}
	
	public static String longestCommonPrefix(String[] arr) {
		String common = arr[0];
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < Math.min(common.length(), arr[i].length()); j++) {
				if(arr[i].charAt(j) == common.charAt(j) ) {
					sb = sb.append(arr[i].charAt(j));
				}
			}
			common = sb.toString();
			sb.delete(0,common.length());
		}
		return common;
	}
}
