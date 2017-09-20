
public class validAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "anagram";
		String t = "nagaram";
		int[] count = new int[26];
		
	 if(s.length()!=t.length())
	 {
		 System.out.println("false");
	 }
	 
	 for(int i = 0;i<s.length();i++)
	 {
		 count[s.charAt(i) - 'a']++;
	 }
	 for(int i=0;i<t.length();i++){
		 count[t.charAt(i) - 'a']--;
	 }
	 for(int i :count)
	 {
		 if(i!=0)
		 {
			 System.out.println("false");
		 }
	 }

	 System.out.println("true");
	}

}
