package Advent;

import java.util.*;

public class Day6PartOne {
	
	public static void main(String[] args) {
		int[] num = {4,1,3,2,4,3,1,4,4,1,1,1,5,2,4,4,2,1,2,3,4,1,2,4,3,4,5,1,1,3,1,2,1,4,1,1,3,4,1,2,5,1,4,2,2,1,1,1,3,1,5,3,1,2,1,1,1,1,4,1,1,1,2,2,1,3,1,3,1,3,4,5,1,2,2,1,1,1,4,1,5,1,3,1,3,4,1,3,2,3,4,4,4,3,4,5,1,3,1,3,5,1,1,1,1,1,2,4,1,2,1,1,1,5,1,1,2,1,3,1,4,2,3,4,4,3,1,1,3,5,3,1,1,5,2,4,1,1,3,5,1,4,3,1,1,4,2,1,1,1,1,1,1,3,1,1,1,1,1,4,5,1,2,5,3,1,1,3,1,1,1,1,5,1,2,5,1,1,1,1,1,1,3,5,1,3,2,1,1,1,1,1,1,1,4,5,1,1,3,1,5,1,1,1,1,3,3,1,1,1,4,4,1,1,4,1,2,1,4,4,1,1,3,4,3,5,4,1,1,4,1,3,1,1,5,5,1,2,1,2,1,2,3,1,1,3,1,1,2,1,1,3,4,3,1,1,3,3,5,1,2,1,4,1,1,2,1,3,1,1,1,1,1,1,1,4,5,5,1,1,1,4,1,1,1,2,1,2,1,3,1,3,1,1,1,1,1,1,1,5};
		System.out.println(ans(num, 80));
		

	}
	public static ArrayList<Integer> afterOneDay(ArrayList<Integer> num){
		
		for (int i = 0; i < num.size(); i ++) {
			if(num.get(i) == 0) {
				num.set(i, 6);
				num.add(9);
			}else {
				num.set(i, num.get(i) - 1);
			}
		}
		return num;
	}
	public static int ans(int[] num, int days) {
		ArrayList<Integer> nums = convert(num);
		for (int i = 0; i < days; i ++) {
			afterOneDay(nums);
			System.out.println(nums);
		}
		return nums.size();
	}
	public static ArrayList<Integer> convert(int[] fish){
		ArrayList<Integer> nums = new ArrayList<>();
		for (int num : fish) {
			nums.add(num);
		}
		return nums;
	}

}


