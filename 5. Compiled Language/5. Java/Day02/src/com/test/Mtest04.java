package com.test;
//기본자료형 byte(1) ->char(2)->short(2)->int(4)->long(8)->float(4)->double(8)
//0,1 bit*8=8bit (글자 한개) =1byte stream (수치와 크기의 타입에 다라 메모리를 확보한다)
public class Mtest04 {

	public static void main(String[] args) {
		//1byte공간을 확보
		byte a=10; //a라는 변수에 10을 대입한다
		System.out.println("a="+a); //변수 a를 호출하면 값을 리턴한다
		byte b=(byte) 127; //byte는 1바이트라는 방을 만듬.
		System.out.println("b="+b);
		
		short c=30000;
		System.out.println("c="+c);
		
		int r=100;
		System.out.println(r);
		
		long abc=10000000000l;
		System.out.println("long="+abc);
		
		float f=90.9f;
		System.out.println("f="+f);
		
		double d=90.0;
		System.out.println("d="+d);
		
	
		
	}

}
