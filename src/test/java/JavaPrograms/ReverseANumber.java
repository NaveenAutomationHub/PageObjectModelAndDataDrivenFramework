package JavaPrograms;

public class ReverseANumber {

	public static void main(String[] args) {

  int nmber = 568;
  
  int reverse= 0;
  while(nmber!=0){
	  
	  reverse = reverse*10;
	  reverse = reverse+nmber%10;
	  nmber = nmber/10;
	  
  }
  
  System.out.println(reverse);
		

	}

}
