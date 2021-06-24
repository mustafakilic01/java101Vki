import java.util.Scanner;
public class kitleİndeks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy, indeks;
        int kilo;

        //İlk kullanıcıdan Kio ve Boyunu girmesini isteyeceğiz.
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        //Daha sonra vücut kitle indeksini hesaplayabilmek için formulü yazmalıyız.
        indeks = kilo / (boy*boy);

        //En sonda çıkan sonucu ekrana yazdırmalıyız.
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);
    }
}
