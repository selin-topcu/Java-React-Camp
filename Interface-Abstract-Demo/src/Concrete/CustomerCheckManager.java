package Concrete;

import Abstract.ICostumerCheckService;
import Abstract.ICostumerService;
import Entities.Customer;

public class CustomerCheckManager implements ICostumerCheckService, ICostumerService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        return Save();
    }

    private boolean Save() {
        return false;
    }

    @Override
    public void Save(Customer customer) throws Exception {

    }
}
