package com.yfood.payments.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Set;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private Long id;

    @Email(message = "e-mail invalido")
    private String email;

    @Size(min = 1, message = "cliente deve ter pelo menos uma forma de pagamento")
    private Set<PaymentType> paymentsTypes;

    public Set<PaymentType> getPaymentsTypesAccepts() {
        return paymentsTypes;
    }
}
