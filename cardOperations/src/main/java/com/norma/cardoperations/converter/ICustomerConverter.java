package com.norma.cardoperations.converter;

import com.norma.cardoperations.dto.CreateCustomerDTO;
import com.norma.cardoperations.dto.GetCustomerDTO;
import com.norma.cardoperations.model.Customer;

public interface ICustomerConverter {

     Customer createCustomerConvert(CreateCustomerDTO createcustomerDTO);
     GetCustomerDTO getCustomerConvert(Customer customer);

}
