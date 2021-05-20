package Adapters;

import Abstract.ICostumerCheckService;
import Entities.Customer;
import MernisService.NAWKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements ICostumerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {

        return false;
    }
}
