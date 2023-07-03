package video24_37_Arasi;

/* Burada toplama işlemine aynı tipten(int int) birden fazla method yükleyebiliyoruz.
 Buna overloading denir.
 İhtiyaca göre ikiside ayrı ayrı kullanılabilir. */

public class Overloading {
    public int toplama(int sayi1,int sayi2){
        return sayi1 + sayi2;
    }


    public int toplama(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
    return toplam;
    }
}
