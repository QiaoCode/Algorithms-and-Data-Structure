package com.datastructure;

import java.util.Vector;

public class Queues {
	static String[] months = {"1","2","3","4","5","6","7"};
	
	public static void main(String[] args){
		Vector vq = new Vector();
		
		for(int i = 0; i < months.length; i++){
			vq.addElement(months[i]+" ");
		}
		System.out.println("Queues:"+vq);
		
		//while(vq != null)������Ϊvp�Ѿ�ʵ�����ˣ�������Զ�����Ƿ�null
		while(!vq.isEmpty()){
			System.out.println(vq.elementAt(0));
			   vq.removeElementAt(0);
		}
		vq.clear();
		
		
	}

}
