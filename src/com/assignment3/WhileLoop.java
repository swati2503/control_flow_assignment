package com.assignment3;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		
		boolean check=checkPalindrome(num);
		if(check)
			System.out.println(num + " Is a palindrome");
		else
			System.out.println(num + " Is not a palindrome");
	}
	
	public static boolean checkPalindrome(int num) {
		int a=num;
		int reverse=0;
		while(a>0) {
			int temp=a%10;
			reverse=reverse*10+temp;
			a/=10;
		}
		System.out.println("When we reverse the num then we get "+ reverse);
		if(reverse==num)
			return true;
		else
			return false;
	}

}
