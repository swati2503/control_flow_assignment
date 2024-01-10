package com.assignment6;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContinueTest obj=new ContinueTest();
		obj.checkEven(100);
		for(int i=1;i<100;i++) {
			if(obj.checkEven(i))
				System.out.println(i);
		}
	}
	
	public boolean checkEven(int num) {
		
		if(num%2==0)
			return true;
		
		return false;
	}

}
