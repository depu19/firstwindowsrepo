package com.test.sample;
/**
 * 
 * reverse every word in a string with space
 * Eg; "we test coders", where the string consists of lowercase characters and space
 * output: ew tset sredoc
 *
 */
public class Test1 {	
		
		public static String solution(String s) {
			String splitArr[] = s.split(" ");
			  StringBuilder reverseSentece = new StringBuilder();
			  for (String word : splitArr) {
			   StringBuilder str = new StringBuilder(word);
			   reverseSentece.append(str.reverse()).append(" ");
			  }
			  return reverseSentece.toString();
		
	}
	public static void main(String[] args) {
		
		String s="hello how r u";
		System.out.println(solution(s));
		
	}
	
	
}
