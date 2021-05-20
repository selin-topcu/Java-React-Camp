package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICostumerCheckService;
import Entities.Customer;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICostumerCheckService iCostumerCheckService;

    public StarbucksCustomerManager(ICostumerCheckService iCostumerCheckService) {
        this.iCostumerCheckService = iCostumerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
        //eğer doğruysa kaydet
        if(iCostumerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }else{
            System.out.println("Kişi bulunamadı");
        }

    }


}
