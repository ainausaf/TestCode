import java.util.ArrayList;
import java.util.HashMap;
//this is incomplete - not good for all test cases
//a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
public class longestpalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "babadada";
		String longpal = ""; 
		
		longpal = longestSubStr(s);
		
		
		System.out.println("longest substring length:"+longpal);
		

	}
	
	public static String longestSubStr(String n)
	{
		String llen = "" ;
		String reverse="";
		int len=0;
		int maxlen=0;
		if(n.length()==1|n==null)
		{
			return n;
		}
		Boolean flag=true;
		
		for(int p =0;p<n.length()-1;p++){
			if(n.charAt(p)!=n.charAt(p+1))
			{flag=false;
				break;}
			else{
				continue;
			}
		}
		if(flag){
			return n;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0;i<n.length();i++){
			if(map.containsKey(n.charAt(i))){
				int m = map.get(n.charAt(i));
				len = ((i-m)+1);
				if(len>maxlen)
				{
					maxlen=len;
					System.out.println(maxlen);
					llen=n.substring(m,len+m);
					System.out.println(llen);	
					reverse="";
					for ( int k = llen.length() - 1; k >= 0; k-- )
				         reverse = reverse + llen.charAt(k);
					if(!(llen.equals(reverse))){
						llen= llen.substring(0,1);
					}
					
					
				}
				
		
			}
			if(!(map.containsKey(n.charAt(i)))){
				map.put(n.charAt(i),i);
			}
			
		}
		
		return llen;
	}
	

}
