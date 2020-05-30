package com.yfood.payments;

import com.yfood.payments.domain.Customer;
import com.yfood.payments.domain.PaymentType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PaymentsApplication {

	public static void main(String[] args) {

		SpringApplication.run(PaymentsApplication.class, args);

		Set<PaymentType> paymentsTypes = new HashSet<>();
		paymentsTypes.add(PaymentType.VISA);
		paymentsTypes.add(PaymentType.MONEY);

		Customer customer = Customer.builder()
									.email("cliente@email.com")
									.paymentsTypes(paymentsTypes)
									.build();

		System.out.println(customer.getPaymentsTypesAccepts());
	}



}
