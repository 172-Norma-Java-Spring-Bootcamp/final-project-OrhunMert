package com.norma.cardoperations.dto;

import com.norma.cardoperations.model.Cards;

import java.math.BigDecimal;

public record GetCustomerDTO(String customerName,
                             BigDecimal totalBalance,
                             Cards cardType){
}
