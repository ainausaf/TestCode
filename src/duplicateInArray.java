import java.util.HashMap;

public class duplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{4,5,2,6,7,2,8};
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				System.out.println("Duplicate in array");
				break;
			}
			else
			map.put(arr[i], 1);
		}

	}

}
