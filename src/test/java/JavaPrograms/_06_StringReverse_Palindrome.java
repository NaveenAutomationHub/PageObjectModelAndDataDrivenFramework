package JavaPrograms;

public class _06_StringReverse_Palindrome {

	public static void main(String[] args) {
		
		//Define the string and its length
		/*String str = "I am reading a book";
		int len = str.length();
		String rev= "";
		
		//By using for loop to reverse the string
		for(int i = len-1;i>=0;i--){
			rev+= str.charAt(i);
			
		}System.out.println("The reverse of a string is:"+rev);
		
		if(rev.equals(str)){
			System.out.println("The given string is a palindrome");
		}else
			System.out.println("The given string is not a palindrome");*/
		
		String str = "I am reading a book";
		String a[] = str.split(" ");
		
		
		
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
	
}
