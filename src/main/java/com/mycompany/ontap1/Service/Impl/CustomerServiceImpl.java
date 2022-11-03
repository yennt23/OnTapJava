/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.Service.Impl;

import com.mycompany.ontap1.Model.Customer;
import com.mycompany.ontap1.Service.CustomerService;
import com.mycompany.ontap1.repositories.CustomerRepository;
import com.mycompany.ontap1.repositories.Impl.CustomerRepositoryImpl;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CustomerServiceImpl implements CustomerService{
private CustomerRepository customerRepository= new CustomerRepositoryImpl();
    @Override
    public ArrayList<Customer> findAll() {
    return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
return customerRepository.add(customer);
    }

    @Override
    public boolean update(int id, Customer customer) {
return customerRepository.update(id, customer);
    }

    @Override
    public boolean delete(int id) {
return customerRepository.delete(id);
    }
    
}
