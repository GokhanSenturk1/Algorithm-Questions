
package github;

import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
    //ör: Klavyeden girilen a ve b değerlerine göre a üssü b yi hesaplayan programın algoritmasını yapınız?
         int a, b;
         double sonuc=1;   
         Scanner k=new Scanner (System.in); 
         System.out.println("A sayisini giriniz");
         a=k.nextInt();
         System.out.println("B sayisini giriniz");
         b=k.nextInt();
         for (int i = 1; i <= b; i++) {
            sonuc=sonuc*a;
            
        }
         System.out.println("Sonuc="+sonuc);
    }
}
