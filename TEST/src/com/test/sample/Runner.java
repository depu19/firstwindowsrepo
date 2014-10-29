package com.test.sample;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Fuction to sort an array, get maximum value and minimum value from an array........
 *
 */

public class Runner {

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
		//or Arrays.sort(a)
	}
	
	public static int getmax(int[] a)
	{
		int max = a[0];

		for ( int i = 1; i < a.length; i++) {
		    if ( a[i] > max) {
		      max = a[i];
		}
		}
		return max;
	}
	
	public static int getmin(int[] a)
	{
		int mini=a[0];
		for (int i = 1; i < a.length; i++) {
		    if(mini>a[i]) {
		        mini=a[i];
		    }
		}
		return mini;
	}
	
	public static void main(String[] args) {
			       
		int[] a={3,2,-4,4,7,6};
		getSortedIntArray(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("max:"+getmax(a));
		System.out.println("min:"+getmin(a));
	}
}
