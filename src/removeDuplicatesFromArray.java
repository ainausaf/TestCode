import java.util.HashMap;
import java.util.Map;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int[] num = {1,2,2,2,5};
		int length=0;
		
		length = removeDuplicates(num);
		System.out.println("the length after removing duplicates is"+length);
	}

	public static int removeDuplicates(int[] numbs){
		
		int lengtharr =numbs.length;
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<lengtharr;i++)
		{
			if (map.containsKey(numbs[i])){
				continue;
			}
			map.put(numbs[i], i);	
		}
		
		System.out.println(map.keySet());
		return map.size();
	}
}
