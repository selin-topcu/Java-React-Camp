package Abstract;

import Entities.Customer;

public interface ICostumerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws Exception;
}
