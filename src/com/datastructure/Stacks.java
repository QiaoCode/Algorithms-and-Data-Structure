package com.datastructure;

import java.util.Stack;

public class Stacks {
      static String[] months = {"1","2","3","4","5","6","7"};
      
      public static void main(String[] args){
    	  Stack stk = new Stack();
    	  for(int i = 0; i < months.length; i++){
    		  stk.push(months[i]);
    	  }
		  System.out.println("stk:"+stk);
		  
		  stk.addElement("the last line");
		  System.out.println("element5:"+stk.elementAt(5));
		  while(!stk.empty()){
			  System.out.println(stk.pop());
		  }
      
      }
}
