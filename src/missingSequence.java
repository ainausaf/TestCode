import java.util.ArrayList;
import java.util.List;

public class missingSequence {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		String s = "I am using hackerrank to improve programming";
		String t = "am hackerrank to improve";
		
		List<String> missed = new ArrayList<String>();
		String[] a = s. split(" ");
		String[] b = t.split(" ");
		

		for(int i=0;i < a.length; i++){
			
			int flag = 0;
				for(int j=0;j<b.length;j++){
				
				if(a[i].equals(b[j]))
					flag=1;
			}
			if(flag==0){
				missed.add(a[i]);			
			}
			
		}
		for(int j =0;j<missed.size();j++)
		System.out.println(missed.get(j));

	}

}
