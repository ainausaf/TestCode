import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class customSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {3,1,2,2,4};
		
		 int len = arr.length;
	        int c = 0;
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i =0;i<len; i++){
	            if(map.containsKey(arr[i])){
	            	c= map.get(arr[i]);
	            	map.put(arr[i],c+1);
	            }
	            else
	            	map.put(arr[i],1);
	            
	        }
	        
	        List<Integer> mapkeys = new ArrayList<>(map.keySet());
	        List<Integer> mapValues = new ArrayList<>(map.values());
	        Collections.sort(mapValues);
	        Collections.sort(mapkeys);
	        
	        LinkedHashMap<Integer,Integer> sortMap = new LinkedHashMap<>();
	       Iterator<Integer> valueIt = mapValues.iterator();
	        while(valueIt.hasNext()){
	        Integer val = valueIt.next();
	        Iterator<Integer> keyIt = mapkeys.iterator();
	        
	        while(keyIt.hasNext()){
	        	
	        	
	        	Integer key = keyIt.next();
	        	Integer comp1 = map.get(key);
	        	Integer comp2 = val;
	        	
	        	if(comp1.equals(comp2)){
	        		keyIt.remove();
	        		sortMap.put(key,val);
	        		break;
	        	}
	        	
	        	}
	        }
	        for(Map.Entry<Integer,Integer> entry :sortMap.entrySet()){
	        	int key = entry.getKey();
	        	int value = entry.getValue();
	        	for(int i = 0;i<value;i++){
	        		System.out.println(key);
	        	}
	        }
	        
	        }
	        
	       

}
	
