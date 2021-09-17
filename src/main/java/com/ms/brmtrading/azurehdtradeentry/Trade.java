package com.ms.brmtrading.azurehdtradeentry;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Trade {
    String tradeId;

    String product;

    Long quantity;

    String tradeType;

    String lender;

    Double rate;


}
