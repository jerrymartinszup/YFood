package com.yfood.payments.domain;

import lombok.Getter;

public enum PaymentType {
    VISA("cartão visa", true),
    MASTERCARD("cartão mastercard", true),
    MONEY("dinheiri", false),
    MACHINE("máquina", false),
    BANK_CHECK("cheque", false);

    @Getter
    private final String description;

    @Getter
    private final boolean isOnline;

    PaymentType(final String description, final boolean isOnline) {
        this.description = description;
        this.isOnline = isOnline;
    }
}