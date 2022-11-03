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

public class CurrentAccount extends Account {

    @Column(name = "account_title")
    private String account_title;
    @Column(name = "status")
    private String status;

    public CurrentAccount(String account_title, String status, int id, String number, float balance, String description) {
        super(id, number, balance, description);
        this.account_title = account_title;
        this.status = status;
    }

    public CurrentAccount() {
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

}
