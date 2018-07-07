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
		
		//while(vq != null)错误，因为vp已经实例化了，所以永远不会是非null
		while(!vq.isEmpty()){
			System.out.println(vq.elementAt(0));
			   vq.removeElementAt(0);
		}
		vq.clear();
		
		
	}

}
