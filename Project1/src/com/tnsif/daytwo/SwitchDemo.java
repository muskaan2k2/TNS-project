package com.tnsif.daytwo;

public class SwitchDemo {
	public static void main(String[] args) {
		char x='Z';
		switch(x)
		{
		case '1':
		case 'L':
			System.out.println(x+"is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+"is a Digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x+"is a White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x+"is a speacial symbol");
		default:
			System.out.println(x+"is other than letter, digit, space or special symbol");
			break;
		}
	}

}
