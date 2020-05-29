package com.yfood.payments.controller.requestDomain;


import com.yfood.payments.domain.PaymentTypeEnum;
import lombok.Getter;

import java.util.Set;

@Getter
public class CustomerRequest {
    public String email;
    public Set<PaymentTypeEnum> paymentsTypes;
}
