package com.program;

public class StringPrintLastChar {
	
	public static void main(String[] args) {
		
		String str="hello world";
		String []st=str.split(" ");
		String last="";
		
		
		for(String s:st) {
			
			char ch=s.charAt(s.length()-1);
			last+=ch;
		}
	
		System.out.println(last+" ");
		
	}

}
