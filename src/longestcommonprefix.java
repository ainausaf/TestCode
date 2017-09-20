
public class longestcommonprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"aa","abfgf"};
		
		String s="";
		
		s = longestCommonPrefix(str);
		
		System.out.println("Longest common prefix "+s);

	}
	
	public static String longestCommonPrefix(String[] strs)
	{
		if (strs.length==0)
		{
			return null;
		}
		if(strs.length==1)
		{
			return strs[0];
		}
		
		StringBuilder longestprefix = new StringBuilder();
		
		for (int i =0;i<strs[0].length();i++){
			char c = strs[0].charAt(i);
			for(String m:strs){
				
				if((c!=m.charAt(i)) || (m.length()<i+1) )
					return longestprefix.toString();
			}
			longestprefix.append(c);
		}
		return longestprefix.toString();
	}

	
}
