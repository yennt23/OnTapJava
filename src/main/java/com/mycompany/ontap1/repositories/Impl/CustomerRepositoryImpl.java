/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.repositories.Impl;

import com.mycompany.ontap1.Model.Customer;
import com.mycompany.ontap1.Utiliities.HibernatUtil;
import com.mycompany.ontap1.repositories.CustomerRepository;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class CustomerRepositoryImpl implements CustomerRepository{

    @Override
    public ArrayList<Customer> findAll() {
Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<Customer> list = (ArrayList<Customer>) session.createCriteria(Customer.class).list();

        return list;    }

    @Override
    public boolean add(Customer customer) {
 Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    }

    @Override
    public boolean update(int id, Customer customer) {
 Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id + "", customer);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    }

    @Override
    public boolean delete(int id) {
    Customer customer = new Customer();
        customer.setId(id);
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(customer);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }

        return false;    }
    
}
