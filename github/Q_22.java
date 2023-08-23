
package github;

import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        //ör: Klavyeden girilen Stringler içinde en uzun karektere sahip olan stringi bulup ekrana yazan ve ancak 
        //exit ifadesi girilmişse durduran programın algoritmasını yapınız?
           String s, en_uzun;
           Scanner k=new Scanner(System.in);
           System.out.println("isim giriniz");
           s=k.next();
           if (s.equals("EXIT")==true) {
               System.exit(1);
           }
           int boy=s.length();
           en_uzun=s;
           for (;;) {
               System.out.println("isim giriniz");
             s=k.next();
               if (s.equals("EXIT")==true) {
                   System.out.println(en_uzun);
                   System.exit(1);
               }
                 if (boy<s.length()) {
                   en_uzun=s;
                   boy=s.length();
               }
           
        }
    }
}
