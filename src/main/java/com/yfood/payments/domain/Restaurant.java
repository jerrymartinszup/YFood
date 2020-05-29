package com.yfood.payments.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    private Long id;

    private String email;

    private Set<PaymentTypeEnum> paymentsTypesAccepts;

    public Set<PaymentTypeEnum> getPaymentsTypesAccepts() {
        return paymentsTypesAccepts;
    }
}
