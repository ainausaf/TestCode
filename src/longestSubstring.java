import java.util.ArrayList;
import java.util.HashMap;

public class longestSubstring {
	
	public static void main(String[] args){
		
		
		String s = "dvdf";
		int longlength = 0; 
		
		longlength = longestSubStr(s);
		
		System.out.println("longest substring length:"+longlength);
	}
	
	public static int longestSubStr(String n)
	{
		
		/*ArrayList<Character> str = new ArrayList<Character>();
		for(int i =0;i<n.length();i++)
		{
			
			if(str.contains(n.charAt(i))){
			//	j=str.get(n.charAt(i)+1);
				//System.out.println(j);
				str.clear();
				str.add(n.charAt(i));
			}
			else{
				str.add(n.charAt(i));
				longlen = callength(str,longlen);
			}
				}
	

		return longlen;
	}
	public static int callength(ArrayList<Character> str1,int len){
			int j = str1.size();
		if(j>len)
		{
			len =j;
		}
		return len;
	}*/
		
		int longlen=0;
		
		HashMap <Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0,j=0;i<n.length();i++){
			if(map.containsKey(n.charAt(i))){
				j = Math.max(j, map.get(n.charAt(i))+1);
			}
			map.put(n.charAt(i), i);
			longlen=Math.max(longlen, i-j+1);
		}
		return longlen;
	}

}
