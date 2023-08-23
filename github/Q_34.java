
package github;

import java.util.Scanner;

public class Q_34 {
    public static void main(String[] args) {
     //ör:Klavyeden girilen stringler içinde karekter uzunluğu 5 ten büyük olanları toplayan 
     //ve girilen string exit ise duran ve sonucu ekrana yazan programın algoritmasını yapınız?
     
      String s,stoplam="";
      Scanner k=new Scanner(System.in);
        System.out.println("String giriniz");
        for (;;) {
            s=k.next();
            if (s.equals("EXIT")==true) {
                System.out.println(stoplam);
                System.exit(1);
            }
            if (s.length()>5) {
                stoplam=stoplam+s;
                System.out.println(stoplam);
            }
        }
    }
}
