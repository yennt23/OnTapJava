/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap1.Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    @Column(name = "number")
    private String number;
    @Column(name = "balance")

    private float balance;
    @Column(name = "description")

    private String description;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    public Account() {
    }

    public Account(int id, String number, float balance, String description) {
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
