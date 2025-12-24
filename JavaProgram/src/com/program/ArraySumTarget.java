package com.program;

public class ArraySumTarget {
	
	public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,7,0,8,6,4};
		int sum=8;
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]+ar[j]==sum) {
					
					System.out.println("["+ar[i]+","+ar[j]+"]");
				}
			}
		}
		
		
		
	}

}
