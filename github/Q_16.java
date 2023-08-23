
package github;

import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args) {
        //ör: Klavyeden girilen 6 tane stringin içinde son harfi z ya da Z olanları bulup ekrana
        //ve bunların kaç tane olduğunu ekrana yazan programın algoritmasını yapınız?
       
        Scanner k=new Scanner (System.in);
        System.out.println("Kelime giriniz");
        
        String kelime;
        int sayac=0;
        
        for (int i = 0; i < 6; i++) {
            kelime=k.next();
            if (kelime.charAt(kelime.length()-1)=='z' || kelime.charAt(kelime.length()-1)=='Z') {
                System.out.println(kelime); 
                sayac++; 
            }
        }
        System.out.println(sayac+ "tane son karekeri z ya da Z olan string vardır");

    }
}
