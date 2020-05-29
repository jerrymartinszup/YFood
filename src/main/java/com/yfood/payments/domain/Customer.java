package com.yfood.payments.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private Long id;

    private String email;

    private Set<PaymentTypeEnum> paymentsTypes;

    public Set<PaymentTypeEnum> getPaymentsTypes() {
        return paymentsTypes;
    }
}
