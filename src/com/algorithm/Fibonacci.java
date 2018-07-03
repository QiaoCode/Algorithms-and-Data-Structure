package com.algorithm;

import java.util.Scanner;

/*
 * F(n)=F(n-1)+F(n-2)
 * Recursion£º1.Determine the purpose; 2.Determine formula; 3.Find out the restrictive condition
 */
public class Fibonacci {
		
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int k = scan.nextInt();
			for(int i = 1; i<=k; i++){
			   System.out.println(fib(i));
		    }
		}
		
		public static int fib(int n){
			int temp;
			
			if(n==1 || n==2){
				return temp = 1;
			}else{
			    return fib(n-1)+fib(n-2);
			}

		}

}
