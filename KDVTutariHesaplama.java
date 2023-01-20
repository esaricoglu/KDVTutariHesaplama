import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double KDVsizFiyat, KDVliFiyat, KDVTutari;

        System.out.print("KDV'siz Fiyat Giriniz : ");
        KDVsizFiyat = input.nextDouble();

        double KDVOran = KDVsizFiyat<= 1000 ? 0.18 : 0.08 ;
        System.out.println("KDV Oranı = " + KDVOran);

        KDVTutari = KDVOran * KDVsizFiyat;
        System.out.println("KDV Tutarı = " + KDVTutari);

        KDVliFiyat = KDVsizFiyat + KDVTutari;
        System.out.println("KDV'li Fiyat = " + KDVliFiyat);

        /*

        double KDVsizFiyat, KDVliFiyat, KDVTutari;

        System.out.print("KDV'siz Fiyat Giriniz : ");
        KDVsizFiyat = input.nextDouble();

        KDVlifiyat = KDVsizfiyat + KDVsizfiyat*18.0/100.0;
        System.out.println("\nKDV'li Fiyat = " + KDVlifiyat);

        KDVtutari = KDVsizfiyat*18.0/100.0;
        System.out.println("\nKDV Tutarı = " + KDVtutari);
        */

    }



}
