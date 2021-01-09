package com.app.tester;

import java.util.HashMap;

public class TwoSum {

	//[2,3,7,4,8]
	public static void main(String[] args) {
		int array[]=new int[] {2,3,7,4,8};
		int target=18;
		int [] result=getTwoNo(array, target);
		System.out.println(result[0]+" "+result[1]);
		

	}
	
	public static int[] getTwoNo(int[] array,int target) {
		HashMap<Integer,Integer> numMap = new HashMap<>();
		
		for (int i = 0; i < array.length; i++) {
			int delta = target - array[i];
			if(numMap.containsKey(delta)) {
				return new int[] {i,(int)numMap.get(delta)};
			}
			else {
				numMap.put(array[i], i);
			}
		}
		return new int[] {-1,-1};
	}

}
