import java.util.ArrayList;

public class removeElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {3,2,2,3};
		int target = 3;
		int length=0;
		
		length = removeElements(num,target);
		System.out.println("the length after removing target element is"+length);

	}
	
	public static int removeElements(int[] nums, int val)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i =0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				list.add(nums[i]);
			}
		}
		for (Integer str : list) {
			
			            System.out.println("Item is: " + str);
			
			        }

		return list.size();
		
		/* One more correct way -
		 * 
		 * int m = 0;    
   for(int i = 0; i < A.length; i++){
       
       if(A[i] != elem){
           A[m] = A[i];
           m++;
       }
   }
   
   return m;
		  */
	}
}
