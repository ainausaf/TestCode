
public class moveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] =  new int[]{0,0,2,0,3};
		
		int j=0;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				int temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				j++;
	
			}
		}
		
		for(int k=0;k<nums.length;k++){
			System.out.println(nums[k]);
		}

	}

}
