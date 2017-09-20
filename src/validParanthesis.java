import java.util.Stack;

public class validParanthesis {
	
	public static void main(String[] args) {
		
		String s ="({[})";
		
		Boolean isValid;
		
		isValid = valParanthesis(s);
		
		System.out.println("Is it valid: "+ isValid);
	}
	
	public static Boolean valParanthesis(String x)
	{
	//Boolean result=false;
	
	Stack<Character> par = new Stack<Character>();
	
	for(char c: x.toCharArray())
	{
		if(c=='('){
			par.push(')');
		}
		else if(c=='{'){
			par.push('}');
		}
		else if(c=='['){
			par.push(']');
		}
		else if(par.isEmpty()||par.pop()!=c)
		{
			return false;
		}
	}
	return par.isEmpty();
	//return result;
	}

}
