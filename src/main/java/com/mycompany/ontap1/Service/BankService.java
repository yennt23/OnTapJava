/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ontap1.Service;

import com.mycompany.ontap1.Model.Bank;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface BankService {
     public ArrayList<Bank> findAll();

    public boolean add(Bank bank);

    public boolean update(int id, Bank bank);

    public boolean delete(int id);
}
