package com.in28minutes.api.f;

public class SwitchExpressionRunner {
	public static String finddayofweekSwitchExp(int day){
		String dayOfWeek=switch(day) {
		case 0->{
			System.out.print("Some Logic");
			yield "Sunday";
		}
		case 1->"Monday";
		case 2->"Tuesday";
		default-> throw new IllegalArgumentException("Invalid option"+day);
	};
		
		return dayOfWeek;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(finddayofweekSwitchExp(1));
		
		

	}

}
