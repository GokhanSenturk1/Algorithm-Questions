
package github;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
     //ör: Klavyeden girilen sayının switch yapısı ile tek mi çift mi olduğunu gösteren programın algoritmasını yapınız?
          Scanner k= new Scanner (System.in);
          System.out.println("Lutfen bir sayi giriniz");
          
          int sayi=k.nextInt();
          
          switch (sayi%2) {                                        
              
              case 0 : System.out.println("Girilen sayi çifttir");
              case 1 : System.out.println("Girilen sayi tektir");
         }

    }
}
