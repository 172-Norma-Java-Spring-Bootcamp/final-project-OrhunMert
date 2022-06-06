package com.norma.cardoperations.service;

import com.norma.cardoperations.dto.CreateCustomerDTO;
import com.norma.cardoperations.dto.GetCustomerDTO;
import com.norma.cardoperations.model.Customer;

public interface ICustomerService {

    void createCustomer(CreateCustomerDTO createCustomerDTO);
    GetCustomerDTO getCustomer(Long id);
}
