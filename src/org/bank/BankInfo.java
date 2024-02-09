package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("saving:1000");
	}
	private void fixed() {
		System.out.println("fixed:1000");
	}
	public static void main(String[]args) {
		BankInfo info=new BankInfo();
		info.saving();
		info.fixed();
		info.deposit();
	}

}
