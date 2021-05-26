package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao{
    @Override
    public void add(User user) {
        System.out.println("Kullancı Eklendi " + user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullancı Güncellendi " + user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullancı Silindi " + user.getFirstName());
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
