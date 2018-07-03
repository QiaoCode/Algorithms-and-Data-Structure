package com.algorithm;

import java.util.Arrays;

/*
 * MergeSort
 * ��һ, �ֽ�: �Ѵ������ n ��Ԫ�ص����зֽ������������, ÿ�������а��� n/2 ��Ԫ��.
 * �ڶ�, ����: ��ÿ�������зֱ���ù鲢����MergeSort, ���еݹ����
 * ����, �ϲ�: �ϲ������ź����������,����������.
 * ���Ӷȣ�������O(nlogn)
 */
public class MergeSort {
	 public static void main(String[] args){
   	  int[] arr = new int[]{46, 51, 20, 18, 65, 97, 82, 30, 77, 50};
   	  System.out.println("ԭ���飺"+Arrays.toString(arr));
   	  sort(arr, 0, arr.length-1);
   	  System.out.println("��������飺"+Arrays.toString(arr));
     }
     
     public static void sort(int[] arr, int low, int high){
   	  int mid = (low + high)/2;
   	  if(low < high){
   		  //���
       	  sort(arr, low, mid);
       	  //�ұ�
       	  sort(arr, mid+1, high);
       	  //�鲢
       	  merge(arr, low, mid, high);
       	  System.out.println(Arrays.toString(arr));
   	  }
     }
     
     //����鲢
     public static void merge(int[] arr, int low, int mid, int high){
   	  int i = low;
   	  int j = mid + 1;
   	  int k = 0;
   	  int[] temp = new int[high - low +1];
   	  //��С�������뵽temp��
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
   	  
   	  //���ʣ��
   	  while(i <= mid){
   		  temp[k++] = arr[i++];
   	  }
   	  
   	  //�Ҳ�ʣ��
   	  while(j <= high){
   		  temp[k++] = arr[j++];
   	  }
   	    
   	  //��temp��ֵ��ԭ����
   	  for(int i1 = 0; i1 < temp.length; i1++){
   		  arr[i1+low] = temp[i1];
   	  }
   	  
     }
}
