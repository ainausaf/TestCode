
public class kthLeastSigBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		
		int k = 4;
		
		int result=0;
		
		result = (num & (1 << (k-1)));
		if(result == 0){
			System.out.println(0);
		}
		else{
			System.out.println(1);
		}
	}

}
