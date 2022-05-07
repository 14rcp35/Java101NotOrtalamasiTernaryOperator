import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fizik,kimya,tarih,turkce,muzik;
        System.out.println("Matematik notunuz : ");
        mat=input.nextInt();
        System.out.println("Fizik notunuz : ");
        fizik=input.nextInt();
        System.out.println("Kimya notunuz : ");
        kimya=input.nextInt();
        System.out.println("Tarih notunuz : ");
        tarih=input.nextInt();
        System.out.println("Turkce notunuz : ");
        turkce=input.nextInt();
        System.out.println("Müzik notunuz : ");
        muzik=input.nextInt();
        int toplam=mat+fizik+kimya+tarih+turkce+muzik;
        double sonuc=toplam/6;
        System.out.println("Not ortalamanız : "+sonuc);
        String durum=(sonuc>=60)?"GEÇTİNİZ":"KALDINIZ";
        System.out.println(durum);

    }
}
