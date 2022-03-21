package com.bridge.D1_assignments;

public class static_var_block_m {
	static int a = 3;
	static int b;
	
	static void meth(int x) {
		System.out.println("x = "+x);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	static {
		System.out.println("static block initialized");
		b = a*4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth(42);

	}

}
