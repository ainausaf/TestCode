import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class singleNumberInArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[]{4, 3, 5, 7, 5, 3, 4};
		
		int length = nums.length;
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i<length;i++)
		{
			if(map.containsKey(nums[i])){
				map.remove(nums[i]);
			}
			else{
			map.put(nums[i], i);
			}
		}
		//System.out.println(getKeyFromValue(map,0));
		Set<Integer> keys = map.keySet();  //get all keys
		for(Integer i: keys)
		{
		    System.out.println(i);
		}

	}
	
	public static Object getKeyFromValue(Map hm, Object value) {
	    for (Object o : hm.keySet()) {
	      if (hm.get(o).equals(value)) {
	        return o;
	      }
	    }
	    return null;
	  }

}
