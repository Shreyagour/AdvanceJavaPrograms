package com.javaprogram.exceptionhandeling;

class Amount{
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public void add(Amount that) throws Exception {
	
			if(!this.currency.equals(that.currency)) {
//				throw new Exception("Currencies don't match");
				throw new CurrenciesDontMatch("Currencies don't match"+this.currency+that.currency);
			}
		this.amount=this.amount+that.amount;
	}
	public String toString() {
		return this.amount+" "+this.currency;
	}
	
}
class CurrenciesDontMatch extends Exception{
	//custom exception
	CurrenciesDontMatch(String m){
		super(m);
	}
}

public class ThrowingException {

	public static void main(String[] args) throws Exception {
		Amount a1=new Amount("INR",30);
		Amount a2=new Amount("INR",30);
//		a1.add(a2);
//		System.out.println(a1);
		Amount a3=new Amount("USD",30);
		a1.add(a3);
		System.out.println(a1);
		

	}

}
