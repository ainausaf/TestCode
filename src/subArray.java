
public class subArray {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		
		int [] nums = {1,2,3,4,1};
		int k=3;
		
		
		   int[] sequence_num = new int[k];
		   sequence_num[0]++;
		    int a = 0;
		    int count = 0;
		    for (int i = 0; i < nums.length; i++) {
		        a = ((a + nums[i]) % k + k) % k;
		        count =count + sequence_num[a];
		        sequence_num[a]++;
		    }

		    System.out.println(count);
		

	}

}
