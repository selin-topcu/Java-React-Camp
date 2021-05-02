public class main {
    public static void main(String[] args){
        //mesleklerin eklenmesi
        is meslek1 = new is(1,"Mühendis", 4000,"Mühendis mesleğidir");
        is meslek2 = new is(2,"Öğretmen", 4000,"Öğretmenlik mesleğidir");

        is[] meslekler={meslek1,meslek2};
        isEkle isEkle =new isEkle();
        isEkle.isEkle(meslek1);
        isEkle.isEkle(meslek2);

        //kişilerin eklenmesi
        kisiler kisi1 = new kisiler(1,"Selin", "Dayıoğlu","Yazılımcı");
        kisiler kisi2 = new kisiler(2,"Pelin", "Dayıoğlu","Mühendis");

        kisiler[] kisiler={kisi1,kisi2};
        kisiEkle kisiEkle =new kisiEkle();
        kisiEkle.kisiEkle(kisi1);
        kisiEkle.kisiEkle(kisi2);

    }
}
