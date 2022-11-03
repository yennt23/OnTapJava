/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.Service.Impl;

import com.mycompany.ontap1.Model.Bank;
import com.mycompany.ontap1.Service.BankService;
import com.mycompany.ontap1.repositories.Impl.BankRepositoryImpl;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BankServiceImpl implements BankService {

    private BankRepositoryImpl bankRepositoryImpl = new BankRepositoryImpl();

    @Override
    public ArrayList<Bank> findAll() {
        return bankRepositoryImpl.findAll();
    }

    @Override
    public boolean add(Bank bank) {
        return bankRepositoryImpl.add(bank);
    }

    @Override
    public boolean update(int id, Bank bank) {
        return bankRepositoryImpl.update(id, bank);
    }

    @Override
    public boolean delete(int id) {
        return bankRepositoryImpl.delete(id);
    }

}
