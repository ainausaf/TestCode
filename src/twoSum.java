import java.util.HashMap;
import java.util.Map;

public class twoSum {
	
	
	
	public static void main (String[] Args){
		
		
		int target = 6;
		int[] num = {3,2,4};
		int[] indices;
		
		
		indices = sumofnumbers(num,target);
		System.out.println("the indices are:");
		for(int m =0;m<indices.length;m++){
		System.out.println(indices[m]);
		}
		
	}
	
	public static int[] sumofnumbers(int[] no, int sumnumber){
	/*	int[] sumofindices= new int[2];
		int sum = 0;
		int len = no.length;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				sum = no[i]+no[j];
				if(sum == sumnumber){
					sumofindices[0]=i;
					sumofindices[1]=j;
					break;
				}
				else{
					continue;
				}
			}
		}
		

		return sumofindices;*/
		
		int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < no.length; i++) {
	        if (map.containsKey(sumnumber - no[i])) {
	            result[1] = i;
	            result[0] = map.get(sumnumber - no[i]);
	            return result;
	        }
	        map.put(no[i], i);
	    }
	    return result;
	}

}
