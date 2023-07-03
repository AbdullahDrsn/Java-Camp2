package video24_37_Arasi;

public class Methods {

    public static void sayiBulmaca (){

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMı = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMı = true;
                break;
            }
        }
        if (varMı) {
            System.out.println(aranacak + " sayısı mevcuttur.");
        } else System.out.println(aranacak + " sayısı mevcut değildir.");
    }
}
