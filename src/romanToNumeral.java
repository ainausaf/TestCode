
public class romanToNumeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "LIX";
		
		int num = romanToNumeral(s);
		
		System.out.println("Roamn to Numeral Conversion "+num);

	}

	
	public static int romanToNumeral(String x){
		int[] nums = new int[x.length()];
		for(int i = 0;i<x.length();i++)
		{
			switch(x.charAt(i)){
			case 'M':
			nums[i]=1000;
			break;
			case'D':
			nums[i]=500;
			break;
			case'C':
				nums[i]=100;
				break;
			case'L':
				nums[i]=50;
				break;
			case'X':
				nums[i]=10;
				break;
			case'V':
				nums[i]=5;
				break;
			case'I':
			nums[i]=1;
			break;
			}
		}
		
		int sum =0;
		
		for(int j=0;j<nums.length-1;j++){
			if(nums[j]<nums[j+1]){
				sum = sum-nums[j];
			}else{
			sum = sum+nums[j];
			}
			
			
			
		}
		
		return sum+nums[nums.length-1];
	}
}
