package com.tnsif.dayone;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//byte->short->int->long->float->double
               //char 
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.5f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i2=ch;
		System.out.println(i2);
		
		char var1='\u00A7';
		int i3=var1;
		System.out.println(i3);
		
		double f1=10.3f;
		int i5=(int)f1;
		System.out.println(i5);
		
		long l1=427100921;
		int i4=(int)l1;
		System.out.println(i4);
		
		float f2=34.56f;
		int i1=(int)f2;
		System.out.println(i1);
	}

}
