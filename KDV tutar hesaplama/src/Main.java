import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    double tutar,kdvOrani= 0.18,kdvTutari,kdvliTutar;
    Scanner input = new Scanner (System.in);
        System.out.println("ücreti giriniz : ");

    tutar = input.nextDouble();
    kdvTutari = tutar * kdvOrani;
    kdvliTutar = tutar + kdvTutari;

        System.out.println("kdv tutarı : " + kdvTutari);
        System.out.println("kdv'li tutar :" + kdvliTutar);
        System.out.println("kdv oranı :" + kdvOrani);


    }

}