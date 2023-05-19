import java.util.Scanner;

public class vucutktleindeksi {
    public static void main (String[] args){
        // değişkenler tanımlandı ve veri girişi için scanner kodu kullanıldı
        double boy, kilo, kitleindeksi;
        Scanner input = new Scanner(System.in);

        System.out.print("LÜTFEN BOYUNUZU (metre cinsinden) GİRİNİZ : ");
        boy =input.nextDouble();

        System.out.print("LÜTFEN KİLONUZU GİRİNİZ : ");
        kilo =input.nextDouble();

        //vücut kitle indeksi hesaplanarak ekrana yazdırıldı
        kitleindeksi = kilo / ( boy * boy);
        System.out.print("VÜCUT KİTLE İNDEKSİNİZ : " +kitleindeksi);


    }
}
