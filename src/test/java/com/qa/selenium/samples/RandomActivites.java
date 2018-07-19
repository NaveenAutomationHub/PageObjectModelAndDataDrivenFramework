package com.qa.selenium.samples;
import java.util.Random;
public class RandomActivites {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<=10;i++){
			Random r = new Random();
			int j = r.nextInt(20);
			  System.out.println("Function one value"+j);
			  Thread.sleep(500);
			  }
	}

}
