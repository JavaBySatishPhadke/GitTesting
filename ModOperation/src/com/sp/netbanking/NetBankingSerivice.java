package com.sp.netbanking;

import java.util.Random;

public class NetBankingSerivice {

	public String openAccount(String adhar, String name) {

		return "account is open" + new Random().nextDouble(3475869L);
	}
	
	
	public String feedback(String msg) {
		return "Thank you with Us !! ";
	}
}
