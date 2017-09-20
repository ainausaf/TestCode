import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
// Write a program that outputs the string representation of numbers from 1 to n.

//But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
//For numbers which are multiples of both three and five output “FizzBuzz”.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		int fizz=0;
		int buzz=0;
		
		List<String> ret = new ArrayList<String>(n);
		
		for(int i =1;i<=n;i++){
			fizz++;
			buzz++;
			if(fizz==3 && buzz ==5)
			{
				ret.add("FizzBuzz");
				fizz=0;
				buzz=0;
			}
			else if(fizz==3)
			{
				ret.add("Fizz");
				fizz=0;
			}
			else if(buzz==5)
			{
				ret.add("Buzz");
				buzz=0;
			}
			else{
				ret.add(String.valueOf(i));
			}
			
		}
		for( int j = 0;j<ret.size();j++)
		{
			System.out.println("item is"+ ret.get(j));
		}
	}

}
