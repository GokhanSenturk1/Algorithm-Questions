
package github;

import java.util.Scanner;

public class Q_27 {
    public static void main(String[] args) {
        //ör:Klavyeden girilen string içinde kaç tane a harfi vardır bunun sayısın bulan programı yapınız?
         String s;
         int sayac=0;
         Scanner k=new Scanner (System.in);
         System.out.println("String giriniz");
         s=k.next();
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i)=='a') {
                 sayac++;
             }
        }
            System.out.println(sayac);
    }
}
