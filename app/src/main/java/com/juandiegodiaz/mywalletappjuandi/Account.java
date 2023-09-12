package com.juandiegodiaz.mywalletappjuandi;

public class Account {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getCurrentvalue() {
        return currentvalue;
    }

    public void setCurrentvalue(Double currentvalue) {
        this.currentvalue = currentvalue;
    }

    public Account(String name, String typeAccount, Double currentvalue) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.currentvalue = currentvalue;
    }

    private String name;

    private String typeAccount;
    private Double currentvalue;
}
