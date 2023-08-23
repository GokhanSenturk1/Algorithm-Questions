
package github;

import java.util.Scanner;

public class Q_31 {
    public static void main(String[] args) {
        //ÖR:Klavyeden sürekli sayılar giriliyor içinde 5 sayısının adedi 10 olunca
        //durduran programın algoritmasını yapınız?
      int sayac=0;
      Scanner k=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        for (int i = 0; ; i++) {
            int a=k.nextInt();
            if (a==5) {
                sayac++;}
                if (sayac==10) {
                    System.out.println("10 tane 5 sayisini girdiniz");
                    System.exit(1);
                }
            }
        
    }
}
