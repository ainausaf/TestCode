
public class excelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AB";
		int result=0;
		
		for(int i =0;i<str.length();i++)
		{
			result = result*26;
			result = result+((str.charAt(i)-'A')+1);
		}
		System.out.println(result);

	}

}
