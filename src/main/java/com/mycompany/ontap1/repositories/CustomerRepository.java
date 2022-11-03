/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ontap1.repositories;

import com.mycompany.ontap1.Model.Customer;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface CustomerRepository {
    public ArrayList<Customer> findAll();

    public boolean add(Customer customer);

    public boolean update(int id, Customer customer);

    public boolean delete(int id);
}
