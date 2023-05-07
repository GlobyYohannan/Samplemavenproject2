package pack2;

import pack1.A;

public class D extends A{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A ob2=new A();

ob2.sum();//private method is accessible inside the class it is declared
ob2.msg();//default method is accessible inside the package it is declared
ob2.eat();////protected  method is accessible inside the package and outside using subclass 
ob2.add();//public method
	}
}
