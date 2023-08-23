
package github;

import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
       //ör: Klavyeden girilen stringlerin içinde a olanları bulup ekrana yazdıran ve kaçıncı indisde olduğunu 
       //ekrana yazdıran programın algoritmasını yapınız?
      
       Scanner k=new Scanner (System.in);
       String s;
       System.out.println("Kelime giriniz");
        s=k.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a') {
                System.out.println("Kelimin "+i+".indisinde");
            }                   
        }  
         System.out.println("Kelimenin uzunlugu "+s.length()+" dir");
    }
}
