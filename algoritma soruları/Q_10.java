
package github;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
      //ör: Klavyeden girilen 100 tane sayının işaretini bulan programın algoritmasını yapınız?
           
           Scanner k=new Scanner(System.in);
           System.out.println("Klavyeden sayi giriniz");
           for (int i = 0; i < 100; i++) {
           int a=k.nextInt();
           
          if (a==0) {
                System.out.println("Girilen sayi sifirdir");
        }
           else if (a>0){ 
                System.out.println("Girilen sayi pozitifitr");}
           else
              System.out.println("Girilen sayi negatiftir");
        }

    }
}
