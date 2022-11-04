/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ontap1.repositories;

import com.mycompany.ontap1.Model.Account;
import com.mycompany.ontap1.Model.SavingAccount;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface AccountRepository {

    public ArrayList<Account> findAll();

    public boolean add(Account account);

    public boolean update(int id, Account account);

    public boolean delete(int id);
    
    public ArrayList<SavingAccount> findAllSavingAccount();
    
    public boolean add(SavingAccount savingAccount);
}
