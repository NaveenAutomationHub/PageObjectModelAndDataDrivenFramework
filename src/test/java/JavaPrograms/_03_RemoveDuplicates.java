package JavaPrograms;

public class _03_RemoveDuplicates {

	public static void main(String[] args) {
		
		//String declaration
	/*	String input = "Java String String";
		String result = "";*/
				
		/*//Spliting the given array
		String[] split = input.split(" ");
		
		//Defining an array list
		List<String> list = new ArrayList<String>();
		
		for(String a:split){
			if(!list.contains(a))
				list.add(a);
			else
				System.out.println("Duplicate words are:"+a);
		}*/
		
		//OR 
		
		/*for(int i = 0;i<input.length();i++){
		if(!result.contains(String.valueOf(input.charAt(i)))){
			result+=String.valueOf(input.charAt(i));
		}
		}
		System.out.println(result);*/
		
		//By using Arrarys
		
		//Declare the array
		String name[] = {"ABC","DEF","ABC","DEF","GHI"};
		
		//By using brute force
		for(int i = 0;i<name.length;i++){
			
			for(int j = i+1;j<name.length;j++){
				
				if(name[i].equals(name[j])){
					System.out.println("Duplicate values by using arrays: "+name[i]);
				}
			}
		}
		
		
		
	}

}
