package com.sda.dorinagheorghe.startup.model.account;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "billing_address")
    private String billingAddres;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Customer(Long id, String billingAddres, String deliveryAddress, Account account) {
        this.id = id;
        this.billingAddres = billingAddres;
        this.deliveryAddress = deliveryAddress;
        this.account = account;
    }

    public Customer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillingAddres() {
        return billingAddres;
    }

    public void setBillingAddres(String billingAddres) {
        this.billingAddres = billingAddres;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", billingAddres='" + billingAddres + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", account=" + account +
                '}';
    }
}
