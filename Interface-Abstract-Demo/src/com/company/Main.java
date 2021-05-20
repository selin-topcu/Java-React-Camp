package com.company;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new NeroCustomerManager();
        customerManager.Save(new Customer(1, "Selin", "Dayıoğlu", LocalDate.of(1999, 11, 24), "55786393310"));
        //customerManager.Save(new Customer(2, "Serdar", "Tekin", LocalDate.of(1996, 9, 13), "46717134126"));
    }

    
}
