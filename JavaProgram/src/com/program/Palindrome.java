package com.program;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="MadaMi";
		String result="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			char ch=s.charAt(i);
			result+=ch;
			
		}
		if(s.equals(result)) {
		
			System.out.println(s+" is palindrome String");
			
		}else
			System.out.println(s+" is not palindrome String");
		
		
		
	}
}
