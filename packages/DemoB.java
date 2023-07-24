package com.package2;

import com.package1.DemoA;

public class DemoB extends DemoA{
	
	public static void main(String[] args){
		System.out.println(" ==== DemoB ===== ");
		DemoB d = new DemoB();
		d.display();
		d.greet();
	}
	
	
	
}