package com.test.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * 
 * refer triangle question.txt
 *
 */
public class Triangle {
/**
 * 
 * @param a
 * @param n
 * @return
 */
	
	 static int solution(int a[],int n)
	{
		 int r=0;
		 if(a.length<3)
		 {
			 return r;
		 }
		 else
		 {
			Arrays.sort(a);
			 for(int i=0;i< a.length-2;i++)
			 {
				 if(a[i] + a[i+1] > a[i+2])
				 {
					 r= 1;
					 
				 }
				 
			 }		
			
		 }
		  return r;     
	}
	
	public static int[] getSortedIntArray(int[] a)
	{ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			al.add(new Integer(a[i]));
		}
		
		Collections.sort(al);
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(al.get(i).toString());
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a[]={10,2,5,1,8,20};
		System.out.println(solution(a,6));
	}
}
