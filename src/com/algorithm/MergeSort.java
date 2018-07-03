package com.algorithm;

import java.util.Arrays;

/*
 * MergeSort
 * 第一, 分解: 把待排序的 n 个元素的序列分解成两个子序列, 每个子序列包括 n/2 个元素.
 * 第二, 治理: 对每个子序列分别调用归并排序MergeSort, 进行递归操作
 * 第三, 合并: 合并两个排好序的子序列,生成排序结果.
 * 复杂度：最好最坏：O(nlogn)
 */
public class MergeSort {
	 public static void main(String[] args){
   	  int[] arr = new int[]{46, 51, 20, 18, 65, 97, 82, 30, 77, 50};
   	  System.out.println("原数组："+Arrays.toString(arr));
   	  sort(arr, 0, arr.length-1);
   	  System.out.println("排序后数组："+Arrays.toString(arr));
     }
     
     public static void sort(int[] arr, int low, int high){
   	  int mid = (low + high)/2;
   	  if(low < high){
   		  //左边
       	  sort(arr, low, mid);
       	  //右边
       	  sort(arr, mid+1, high);
       	  //归并
       	  merge(arr, low, mid, high);
       	  System.out.println(Arrays.toString(arr));
   	  }
     }
     
     //有序归并
     public static void merge(int[] arr, int low, int mid, int high){
   	  int i = low;
   	  int j = mid + 1;
   	  int k = 0;
   	  int[] temp = new int[high - low +1];
   	  //将小的数放入到temp中
   	  while(i <= mid && j <= high){
   		  if(arr[i] < arr[j]){
   			  temp[k] = arr[i];
   			  i++;
   			  k++;
   		  }else{
   			  temp[k] = arr[j];
   			  j++;
   			  k++;
   		  }
   	  }
   	  
   	  //左侧剩余
   	  while(i <= mid){
   		  temp[k++] = arr[i++];
   	  }
   	  
   	  //右侧剩余
   	  while(j <= high){
   		  temp[k++] = arr[j++];
   	  }
   	    
   	  //把temp赋值给原数组
   	  for(int i1 = 0; i1 < temp.length; i1++){
   		  arr[i1+low] = temp[i1];
   	  }
   	  
     }
}
