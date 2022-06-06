package com.norma.cardoperations.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private BigDecimal totalBalance = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    private Cards cardType;

}
