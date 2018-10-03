import java.util.HashMap;

public class P10 {
	public static void main(String[] args) {
		URLshortner shorten = new URLshortner();
		String s = "www.vera.com";
		System.out.println(shorten.longToShort(s));
	}

	public static class URLshortner{
		public int counter;
		public String base;
		public HashMap<String, Integer> hm;
	
		public URLshortner(){
			this.counter = 0;
			this.base = "https://short.ly/";
			this.hm = new HashMap<String, Integer>();
		}
		
		public String longToShort(String s) {
			if(!hm.containsKey(s)){
				counter++;
				hm.put(s, counter);
				return base + counter;
			}else {
				return base + hm.get(s);
			}
		}
		
	}
	
}
