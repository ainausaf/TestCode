
public class reverseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 786;
		int s=0;
		
		s = revNumber(x);
		
		System.out.println("reverse Integer is "+s);

	}
	
	public static int revNumber(int p)
	{
		int result=0;
		while(p!=0)
		{
			int tail = p%10;
			int newresult = result*10+tail;
			
			if((newresult -tail)/10!=result)
			{
				return 0;
			}
			
			result = newresult;
			p=p/10;
		}
		
		return result;
	}

}
