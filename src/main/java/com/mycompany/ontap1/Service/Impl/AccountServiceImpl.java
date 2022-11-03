/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.Service.Impl;

import com.mycompany.ontap1.Model.Account;
import com.mycompany.ontap1.Service.AccountService;
import com.mycompany.ontap1.repositories.AccountRepository;
import com.mycompany.ontap1.repositories.Impl.AccountRepositoryImpl;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository = new AccountRepositoryImpl();

    @Override
    public ArrayList<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public boolean add(Account account) {
        return accountRepository.add(account);
    }

    @Override
    public boolean update(int id, Account account) {
        return accountRepository.update(id, account);
    }

    @Override
    public boolean delete(int id) {
        return accountRepository.delete(id);
    }

}
