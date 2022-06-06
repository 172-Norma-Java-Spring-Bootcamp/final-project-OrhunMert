package com.norma.cardoperations.converter.Imp;

import com.norma.cardoperations.converter.ICustomerConverter;
import com.norma.cardoperations.dto.CreateCustomerDTO;
import com.norma.cardoperations.dto.GetCustomerDTO;
import com.norma.cardoperations.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter implements ICustomerConverter {

    @Override
    public Customer createCustomerConvert(CreateCustomerDTO createCustomerDTO){

        Customer customer = new Customer();
        customer.setCustomerName(createCustomerDTO.customerName());
        customer.setTotalBalance(createCustomerDTO.totalBalance());
        customer.setCardType(createCustomerDTO.cardType());


        return customer;
    }

    @Override
    public GetCustomerDTO getCustomerConvert(Customer customer) {
        return new GetCustomerDTO(customer.getCustomerName(),
                customer.getTotalBalance(),
                customer.getCardType());
    }
}
