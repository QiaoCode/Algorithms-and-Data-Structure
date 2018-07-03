package com.algorithm;
/*
 * Bubble Sort:
 * ԭ���Ƚ��������ڵ�Ԫ�أ���ֵ���Ԫ�ؽ������Ҷˡ�
 * ˼·�����αȽ����ڵ�����������С������ǰ�棬�������ں��档���ڵ�һ�ˣ����ȱȽϵ�1���͵�2��������С����ǰ�������ź�
 * Ȼ��Ƚϵ�2�����͵�3��������С����ǰ�������ź���˼�����ֱ���Ƚ��������������С����ǰ�������ź�
 * �ظ���һ�˲��裬ֱ��ȫ��������ɡ�
 * ʱ�临�Ӷȣ����O(n^2),��ã�O(n),ƽ��O(n^2)
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
