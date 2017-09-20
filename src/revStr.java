
public class revStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello world";
		String newstr="";
		int length = str.length()-1;
		int i =0;
		char[] word = str.toCharArray();
		
	/*	for(int i = str.length()-1;i>=0;i--){
			newstr = newstr+str.charAt(i);
		}*/
		
		while(i<length){
			char temp = word[i];
			word[i] = word[length];
			word[length]=temp;
			i++;
			length--;
		}
		String str1 = new String(word);
		System.out.println("reverse string  "+  str1);

	}

}
