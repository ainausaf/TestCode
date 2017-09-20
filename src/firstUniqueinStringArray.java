import java.util.ArrayList;

public class firstUniqueinStringArray {

	public static void main(String[] args) {
		
		String s = "cc";
		//int result=0;
		// TODO Auto-generated method stub
		
		ArrayList<Character> str1 = new ArrayList<Character>();
        if(s.isEmpty())
        {
        	System.out.println("-1");
        }
        if(s.length()==1)
        {
        	System.out.println("0");
        }
        for (int i = 0;i<s.length();i++){
        	if(i==s.length()-1){
        		if(!(str1.contains(s.charAt(i)))){
        		
        		System.out.println(i);
            }
        	}
 
            for(int j=i+1;j<s.length();j++){
                if(str1.contains(s.charAt(i)))
                {
                    break;
                }
                
                if(s.charAt(i)==s.charAt(j))
                {
                    str1.add(s.charAt(i));
                    break;
                }
                if(j==s.length()-1){
                	System.out.println(i);
       
               }
            }
            //return i;
            
            
        }
        System.out.println("-1");

	}

}
