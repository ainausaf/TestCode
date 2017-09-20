
public class removeSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " name=john age=13 year=2001  ";
		
		String str2 = str.replaceAll("\\s+", "");
		
		String before = "   Hello Geeks . Welcome   to  GeeksforGeeks   .    ";
		
		String after = before.trim().replaceAll(" +", " ");
		
		String after2=after.replaceAll(" \\.","\\.");
		

		System.out.println("before"+str2+"end");
		
		System.out.println(after2);
	}
	
}
