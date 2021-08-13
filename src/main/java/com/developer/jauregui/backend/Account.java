package com.developer.jauregui.backend;

import java.math.BigDecimal;

public class Account {
    private String vPersons;
    private BigDecimal vBalance;


    public String getvPersons() {
        return vPersons;
    }

    public void setvPersons(String vPersons) {
        this.vPersons = vPersons;
    }

    public BigDecimal getvBalance() {
        return vBalance;
    }

    public void setvBalance(BigDecimal vBalance) {
        this.vBalance = vBalance;
    }
}
