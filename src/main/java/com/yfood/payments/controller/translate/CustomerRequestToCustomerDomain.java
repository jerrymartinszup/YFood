package com.yfood.payments.controller.translate;

import com.yfood.payments.controller.requestDomain.CustomerRequest;
import com.yfood.payments.domain.Customer;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerRequestToCustomerDomain {
    public static Customer translate(CustomerRequest customerRequest) {
        return Customer.builder()
                .email(customerRequest.getEmail())
                .paymentsTypes(customerRequest.getPaymentsTypes())
                .build();
    }
}
