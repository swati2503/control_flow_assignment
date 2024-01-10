package com.assignment5;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<100;i++) {
//			if i is less then or equal 3 then 2,3 all are prime number
			if(i<=3)
			{
				System.out.println(i);
				continue;
			}
			
//			if i is divisible by 2 or 3 then its not a prime number
			if(i%2!=0 && i%3!=0)
			{
				boolean checkPrime=true;
	
				for(int j=5;j*j<=i;j+=6) {
					if(i%j==0 || i%(j+2)==0) {
						checkPrime=false;
						break;
					}	
				}
				if(checkPrime)
					System.out.println(i);
			}
		}
		
	}
}
