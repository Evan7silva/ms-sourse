package com.decsuperior.hrpayrooll.services;

import org.springframework.stereotype.Service;

import com.decsuperior.hrpayrooll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long worker, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
