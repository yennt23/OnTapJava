/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.repositories.Impl;

import com.mycompany.ontap1.Model.Bank;
import com.mycompany.ontap1.Utiliities.HibernatUtil;
import com.mycompany.ontap1.repositories.BankRepository;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class BankRepositoryImpl implements BankRepository {

    @Override
    public ArrayList<Bank> findAll() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<Bank> list = (ArrayList<Bank>) session.createCriteria(Bank.class).list();

        return list;
    }

    @Override
    public boolean add(Bank bank) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(bank);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, Bank bank) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id + "", bank);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Bank bank = new Bank();
        bank.setId(id);
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(bank);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }

        return false;
    }

}
