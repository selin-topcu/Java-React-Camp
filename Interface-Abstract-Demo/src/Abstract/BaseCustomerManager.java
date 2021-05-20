package Abstract;

import Entities.Customer;
import MernisService.NAWKPSPublicSoap;

public class BaseCustomerManager implements ICostumerService{
    @Override
    public void Save(Customer customer) throws Exception {
        NAWKPSPublicSoap client =new NAWKPSPublicSoap();
        boolean x = client.TCKimlikNoDogrula(Long.valueOf("55786393310"),"Selin","Dayıoğlu",1999);
        if(x==true){
            System.out.println("Kullanıcı Kaydedildi");
        }
        else{
            System.out.println("Böyle Bir Kullanıcı Bulunamadı!");
        }

    }
}
