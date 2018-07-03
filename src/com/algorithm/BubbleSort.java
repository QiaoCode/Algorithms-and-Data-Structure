package com.algorithm;
/*
 * Bubble Sort:
 * 原理：比较两个相邻的元素，将值大的元素交换至右端。
 * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
 * 然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。
 * 重复第一趟步骤，直至全部排序完成。
 * 时间复杂度：最坏：O(n^2),最好：O(n),平均O(n^2)
 */
public class BubbleSort {
	public static void main(String args[]){
		int[] array = {4,3,11,0,9,12};
		
	for(int j = array.length; j > 0; j--){
		for(int i = 1; i < array.length; i++){
			int temp;
			
			if(array[i] < array[i-1]){
				temp = array[i-1];
				array[i-1] = array[i];
				array[i] = temp;
			}
		}	
	}
		
		for(int i = 0; i <array.length; i++){
			System.out.println(array[i]);
		}
	}

}
