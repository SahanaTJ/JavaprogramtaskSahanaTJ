package com.java.util.scanner;  //Count N Remove  white space prgm

import java.util.Scanner;
 
public class RemoveAllSpace {
   
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  The String");
		String s =sc.nextLine();
		
		int count =0;
		char [] g=s.toCharArray();
		
		for(int i=0;i<g.length;i++) {
			if(g[i]==' ') {
				count+=1;
				continue;
			}
			else {
				System.out.print(g[i]);
			}
		}
		System.out.println();
		System.out.println("Number of space : "+count);
	
     }
}	
	

//String str = "India  Is  My  Country";
		//	String noSpaceString = null;
	  //String noSpaceStr = str.replaceAll("\\s","");
	  //System.out.println(noSpaceStr);
	