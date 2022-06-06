package com.norma.cardoperations.controller;

import com.norma.cardoperations.dto.CreateCustomerDTO;
import com.norma.cardoperations.dto.GetCustomerDTO;
import com.norma.cardoperations.service.ICustomerService;
import com.norma.cardoperations.service.Imp.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("customers/")
public class CustomerController{

    private final ICustomerService customerService;

    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody CreateCustomerDTO createCustomerDTO){
        customerService.createCustomer(createCustomerDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<GetCustomerDTO> getCustomer(@PathVariable Long id){
        return ResponseEntity.ok().body(customerService.getCustomer(id));
    }

}
