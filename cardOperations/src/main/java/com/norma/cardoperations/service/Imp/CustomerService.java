package com.norma.cardoperations.service.Imp;

import com.norma.cardoperations.converter.ICustomerConverter;
import com.norma.cardoperations.converter.Imp.CustomerConverter;
import com.norma.cardoperations.dto.CreateCustomerDTO;
import com.norma.cardoperations.dto.GetCustomerDTO;
import com.norma.cardoperations.model.Customer;
import com.norma.cardoperations.repository.CustomerRepository;
import com.norma.cardoperations.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final ICustomerConverter customerConverter;
    private final CustomerRepository customerRepository;

    @Override
    public void createCustomer(CreateCustomerDTO createCustomerDTO) {
        Customer customer = customerConverter.createCustomerConvert(createCustomerDTO);
        customerRepository.save(customer);
    }

    @Override
    public GetCustomerDTO getCustomer(Long id) {
        Customer customer = customerRepository
                .findById(id)
                .orElseThrow();

        return customerConverter.getCustomerConvert(customer);

    }
}
