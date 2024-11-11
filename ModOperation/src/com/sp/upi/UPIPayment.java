package com.sp.upi;

import java.util.Random;

public class UPIPayment {

	public String doUPIPayment(String UPIID, float amount) {
		return "UPI Payment is " + amount + " done";
	}

	public double checkBalance(String UPID) {

		return new Random().nextInt(1000);

	}

}
