package video24_37_Arasi;

public class Methods2 {

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi.");
    }

    public static void guncelle() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String city() {
        return "Balıkesir";
    }

    //arguments

    //burada ... yazarak buraya istenilen kadar sayı atılabileceğini belirttik.Array de yapılabilirdi.
    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}