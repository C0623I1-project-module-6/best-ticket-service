package com.codegym.bestticket.converter.user;

import com.codegym.bestticket.dto.CustomerDTO;
import com.codegym.bestticket.dto.response.user.CustomerDtoResponse;
import com.codegym.bestticket.entity.user.Customer;
import org.springframework.beans.BeanUtils;;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {
    public CustomerDtoResponse entityToDto(Customer customer){
        CustomerDtoResponse customerDtoResponse=new CustomerDtoResponse();
        BeanUtils.copyProperties(customer, customerDtoResponse);
        return customerDtoResponse;
    }
    public Customer dtoToEntity(CustomerDTO customerDTO){
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        return customer;
    }
}
