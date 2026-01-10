package com;

//LOGIC

public class ThirdProgram {

	public static void main(String[] args) {
		
		//fibonacci series
		
		//0,1,1,2,3,5,8,13
		
		int a=0,b=1,c=0;
		for (int i=0;i<10;i++) {
			
			System.out.print(c + " ");
			c=a+b-(a=b);
			
			
			
		}
		
		

	}

}
