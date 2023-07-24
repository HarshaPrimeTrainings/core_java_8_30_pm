package com.package1;

public class DemoA{
	
	public void display(){
		System.out.println("Hello Iam Public Memeber");

	}
	
	protected void greet(){
		System.out.println("Hello Iam Protected Memeber");
	}
	
	private void secreat(){
		System.out.println("Hello Iam Private Memeber");
	}
	
	void something(){
		System.out.println("Hello Iam Default Memeber");
	}
	
	public static void main(String[] args){
	System.out.println("=== DemoA === ");
	DemoA d = new DemoA();	
	d.display();
	d.greet();
	d.secreat();
	d.something();
	}
	
}