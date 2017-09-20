
public class intPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 121;
		boolean isPalindrome;
		
		isPalindrome = numPalindrome(x);
		
		System.out.println("is the number a Palindrome "+isPalindrome);

	}
	
	public static Boolean numPalindrome(int p){
		int result = 0;
		int q=p;
		
		if(p<0)
		{
			return false;
		}
		while(p!=0)
		{
			int tail = p%10;
			int newresult = result*10+tail;
			
			if((newresult -tail)/10!=result)
			{
				return false;
			}
			
			result = newresult;
			p=p/10;
		}
		System.out.println(q);
		System.out.println(result);
		return result == q;
		
	}

}
