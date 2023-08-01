package com.javaprogram.access.package1;
final class firstclass{}
//class secondclass extends firstclass{} final class can't be extended
class secondclass{
	public void mymethod() {}
	final void myothermethod() {}
}
class thirdclass extends secondclass{
	public void mymethod() {}
//	final void myothermethod() {} can't override final method
	public void usingfinalarg(final int arg) {
//		arg=98; not allowed
	}
}

public class FinalClassFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i;
		i=9;
//		i=18;not allowed

	}

}
