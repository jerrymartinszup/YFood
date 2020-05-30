package com.yfood.payments.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    private Long id;

    @NotBlank
    private String name;

    @Size(min = 1, message = "restaurante deve aceitar pelo menos uma forma de pagamento")
    private Set<PaymentType> paymentsTypesAccepts;

    public Set<PaymentType> getPaymentsTypesAccepts() {
        return paymentsTypesAccepts;
    }
}
