package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public String getInstitutionName() {
        return institutionName; //returning the name
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default
        super(name,balance,0); //minimum balance
        this.institutionName=institutionName;
    }

}