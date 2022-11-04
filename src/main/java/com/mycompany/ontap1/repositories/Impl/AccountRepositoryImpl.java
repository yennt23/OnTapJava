/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.repositories.Impl;

import com.mycompany.ontap1.Model.Account;
import com.mycompany.ontap1.Model.SavingAccount;
import com.mycompany.ontap1.Utiliities.HibernatUtil;
import com.mycompany.ontap1.repositories.AccountRepository;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class AccountRepositoryImpl implements AccountRepository{

    @Override
    public ArrayList<Account> findAll() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<Account> list = (ArrayList<Account>) session.createCriteria(Account.class).list();

        return list;
    }

    @Override
    public boolean add(Account account) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(account);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, Account account) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id + "", account);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Account account = new Account();
        account.setId(id);
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(account);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }

        return false;
    }

    @Override
    public ArrayList<SavingAccount> findAllSavingAccount() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<SavingAccount> list = (ArrayList<SavingAccount>) session.createCriteria(SavingAccount.class).list();
        return list;
    }

    @Override
    public boolean add(SavingAccount savingAccount) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(savingAccount);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
