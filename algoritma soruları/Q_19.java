
package github;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
     //ÖR:Klavyeden girilen 50 tane sayıdan büyük olanını bulup ekrana yazdıran programın algoritmasını yapınız?
        int sayi,enb;
        Scanner k=new Scanner(System.in);
        System.out.println("1.Sayiyi giriniz");
        sayi=k.nextInt();
        enb=sayi;
        for (int i = 2; i <= 50; i++) {
            System.out.println(i+".Sayiyi giriniz");
            sayi=k.nextInt();
        }
           if (enb<=sayi) {
                System.out.println("enb="+sayi);
            }
    }
}
