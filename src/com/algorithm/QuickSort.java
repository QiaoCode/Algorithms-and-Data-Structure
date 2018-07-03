package com.algorithm;

/*
 * ���Ӷȣ���á�ƽ��O(nlgn),�O(n^2)
 */
import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args){
		int[] arr = new int[]{46, 51, 20, 18, 65, 97, 82, 30, 77, 50};
	   	System.out.println("ԭ���飺"+Arrays.toString(arr));
	   	sort(arr, 0, arr.length-1);
	   	System.out.println("��������飺"+Arrays.toString(arr));
	}
	
	//����
	public static void sort(int[] a, int start, int end){
		if(start < end){
			int partition = divide(a, start, end);
			sort(a, start, partition-1);
			sort(a, partition+1,end);
		}
	}
	
	//����
	public static int divide(int[] arr, int start, int end){
		int i = start;
		int j = end;
		int base = arr[start];
		
		while(i < j){
			//���ұ߿�ʼ����������Ȼ�׼ֵС���ͼ���������
			while(i < j && arr[j] >= base){
				j--;
			}
			//whileֹͣ������ǰ��ֵ��baseС����Ҫ����
			if(i < j){
				int temp = arr[j];
				arr[j] = base;
				arr[i] = temp;
				
				i++;
			}
			
			//����߿�ʼ����
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
