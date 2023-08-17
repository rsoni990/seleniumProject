package com.ice_hrm_automation;

public class demo {

	public static void main(String[] args) {
	
		mathematics math=new mathematics() {
		
	public int addition(int a,int b)
	{
	return a+b;
	}
		
	public int subtraction(int a,int b) {
		return a-b;
	}
	public float division(int a,int b)
	{
		return a/b;
	}
	public float multiplication(int a,int b) {
		return a*b;
		}
	};
System.out.println(	math.addition(300,400));
System.out.println(	math.subtraction(400,300));
System.out.println(	math.division(600,300));	
System.out.println(	math.multiplication(40,30));
	}

}
