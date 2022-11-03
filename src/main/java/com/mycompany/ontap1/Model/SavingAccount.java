/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author DELL
 */
@Entity
public class SavingAccount extends Account {

    @Column(name = "account_title")
    private String account_title;
    @Column(name = "status")
    private String status;
    @Column(name = "interest")
    private float interest;

    public SavingAccount(String account_title, String status, float interest, int id, String number, float balance, String description) {
        super(id, number, balance, description);
        this.account_title = account_title;
        this.status = status;
        this.interest = interest;
    }

    public SavingAccount() {
    }

    public String getAccount_title() {
        return account_title;
    }

    public void setAccount_title(String account_title) {
        this.account_title = account_title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

}
