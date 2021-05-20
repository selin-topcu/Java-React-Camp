package Entities;

import Abstract.ICostumerService;
import Abstract.IEntity;

import java.time.LocalDate;

public class Customer implements ICostumerService, IEntity {
    public int ID;
    public String FirstName;
    public String Lastname;
    public LocalDate DateOfBirth;
    public String NationalityId;

    public Customer(int id, String ad, String soyad, LocalDate doğumTarihi, String TC) {
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFistName() {
        return FirstName;
    }

    public void setFistName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }



    @Override
    public void Save(Customer customer) {

    }
}
