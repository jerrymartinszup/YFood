package com.yfood.payments.controller;

import com.yfood.payments.controller.requestDomain.CustomerRequest;
import com.yfood.payments.controller.translate.CustomerRequestToCustomerDomain;
import com.yfood.payments.domain.Customer;
import com.yfood.payments.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping("new-customer")
    public Mono<Customer> newCustomer(@RequestBody CustomerRequest customer){
        return customerRepository.save(CustomerRequestToCustomerDomain.translate(customer));
    }
}
