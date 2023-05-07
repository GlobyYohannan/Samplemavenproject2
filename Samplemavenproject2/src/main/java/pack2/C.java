package pack2;

import pack1.A;

public class C {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A ob1=new A();

ob1.sum();//private method is accessible inside the class it is declared
ob1.msg();//default method is accessible inside the package it is declared
ob1.eat();////protected  method is accessible inside the package and outside using subclass 
ob1.add();//public method
	}
}
