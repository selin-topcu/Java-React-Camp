package com.company;

import business.concretes.UserManager;
import core.GoogleRegisterManagement;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleRegisterManagement());

        User user1 = new User(1, "Selin", "Dayıoğlu", "slndayioglu@gmail.com", "123456");

        userManager.register(user1);
        userManager.login("slndayioglu@gmail.com", "123456");
    }
}
