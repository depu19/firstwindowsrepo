package com.test.sample;

import java.util.ArrayList;

/**
 * 
 * determine the maximal deviation from an array of integers, and return the index of the element having maximal deviation, else return -1
 * if int a[]={9,4, -3,-10} then avg=(9+4-3-10)/4 i.e; 0
 * then maximal deviation m=a(p)-avg, where a(p) is the element of the array having maximal deviation and p is it index in the array a
 * write a function to return p, the index of the maximal deviation element. If there are more than one maximal deviation element, then return the index of atleast one of them, else return -1
 *
 */
public class Test2 {
	
	public static int solution(int[] A)
 {
		int index=-1;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
		}
		double avg = sum / A.length;
		ArrayList<Double> al = new ArrayList<Double>();
		for (int i = 0; i < A.length; i++) {
			al.add(new Double(Math.abs((A[i] - avg))));
		}

		double max = al.get(0);
		for (int i = 1; i < al.size(); i++) {
			if (al.get(i) > max) {
				max = al.get(i);
			}			
		}
		
		if(al.size()>=1)
		{
			index= al.indexOf(new Double(max));
		}
		return index;
		
	}
	
	
	public static void main(String[] args) {
		int[] i= {1, 2, -3 , -10};
		
		System.out.println(solution(i));
	}

}
