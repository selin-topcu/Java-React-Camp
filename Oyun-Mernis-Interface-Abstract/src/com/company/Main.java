package com.company;

import MernisService.CLVKPSPublicSoap;
import game.gameSale;
import gamer.gamerAdd;
import gamer.gamerManager;
import game.gameManager;
import game.gameSale;

public class Main {

    public static void main(String[] args) throws Exception {
        CLVKPSPublicSoap client =new CLVKPSPublicSoap();
        boolean TCkontrol = client.TCKimlikNoDogrula(Long.valueOf("55786393310"),"Selin","Dayıoğlu",1999);
        if(TCkontrol==true){

            System.out.println("Kimlik Doğrulandı");
            gamerManager gamer1 = new gamerManager(1,"Selin", "Dayıoğlu","CS");
            gamerAdd gamerAdd =new gamerAdd();
            gamerAdd.gamerAdd(gamer1);
            //1,"Counter-Strike","Counter strike oyna ve düşman askerlerini öldür."
            gameManager game1= new gameManager(1,"Counter-Strike","Counter strike oyna ve düşman askerlerini öldür.");
            gameSale gameSale=new gameSale();
            gameSale.gameSale(game1);

        }
        else {
            System.out.println("Kimlik Doğrulanamadı");

        }

    }
}
