package com.javaprogram.enums;

import java.util.Arrays;

enum Season{
	Winter(5),Summer(1),Fall(4),Spring(2),Rainy(3);
	private int value;
	private Season(int value) {
		this.setValue(value);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

public class JavaEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s1=Season.valueOf("Fall");
		System.out.println(s1);
		System.out.println(Season.Rainy.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		System.out.println(Season.Rainy.getValue());

	}

}
