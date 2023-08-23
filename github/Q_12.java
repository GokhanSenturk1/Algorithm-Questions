
package github;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        
      //ör: Klavyeden girilen karekterin a ya ya da A ya eşit olup olmadığımı bulan programın algoritmasını yapınız?
       Scanner k=new Scanner (System.in);
       System.out.println("Karekter giriniz");
       char c;
        for (int i = 0; i < 10; i++) {
           c=k.next().charAt(0);
        if (c=='a' || c=='A' ) {
            System.out.println("Girilen karekter a ya da A dir"); 
        }
        else
            System.out.println("Girilen karekter a ya da A degildir"); 
       }  
    }
}
