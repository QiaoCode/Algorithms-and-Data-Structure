package com.algorithm;

/*
 * 复杂度：最好、平均O(nlgn),最坏O(n^2)
 */
import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args){
		int[] arr = new int[]{46, 51, 20, 18, 65, 97, 82, 30, 77, 50};
	   	System.out.println("原数组："+Arrays.toString(arr));
	   	sort(arr, 0, arr.length-1);
	   	System.out.println("排序后数组："+Arrays.toString(arr));
	}
	
	//排序
	public static void sort(int[] a, int start, int end){
		if(start < end){
			int partition = divide(a, start, end);
			sort(a, start, partition-1);
			sort(a, partition+1,end);
		}
	}
	
	//划分
	public static int divide(int[] arr, int start, int end){
		int i = start;
		int j = end;
		int base = arr[start];
		
		while(i < j){
			//从右边开始遍历，如果比基准值小，就继续像左走
			while(i < j && arr[j] >= base){
				j--;
			}
			//while停止，代表当前的值比base小，需要交换
			if(i < j){
				int temp = arr[j];
				arr[j] = base;
				arr[i] = temp;
				
				i++;
			}
			
			//从左边开始遍历
			while(i < j && arr[i] <= base){
				i++;
			}
			
			if(i < j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j--;
			}
		}
		
		return i;	
	}
	
}
