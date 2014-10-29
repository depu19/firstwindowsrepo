package com.test.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Find the index upto which smallest sub array can be formed covering all the elements of the array
 * Assume an integer array A of N elements where a[i]<N
 * Eg: A={1,2,-1, 4,2,4} then the smallest sub array covering all the elements is {1,2,-1,4}
 * the last index of this sub array in the original array is 3.
 * i.e: index of 1 is 0, index of 2 is 1, index of -1 is 2, index of 4 is 3.
 * So the method should return 3,  else return 0
 *
 */
public class TestSolutionClass {
	//static int p=0;
		
	int solution(int a[],int n)
	{
	int p=0;
	Set<Integer> s=new HashSet<Integer>();
	List<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
	s.add(a[i]);
	}
	Integer[] sArr = s.toArray(new Integer[s.size()]);
	for (int i=0;i<n;i++)
	{
	for(int k=0;k<s.size();k++)
	{
	if(sArr[k].equals(new Integer(a[i])) && (!al.contains(sArr[k])))

	{
	al.add(sArr[k]);
	System.out.println(i);
	p=i;
	}
	}
	}

	return p;
	}
	
	public static void main(String[] args) {
		int[] a=new int[8];
		a[0]=-1;
		a[1]=-1;
		a[2]=2;
		a[3]=-1;
		a[4]=-3;
		a[5]=4;
		a[6]=1;
		a[7]=0;
		
		TestSolutionClass t=new TestSolutionClass();
		System.out.println("final solution is"+t.solution(a, 8));
		
	}

}
