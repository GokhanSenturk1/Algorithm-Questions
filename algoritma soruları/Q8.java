
package github;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
 //ör: Klaveyden girilen sayıların 3 e ve 5 e tam bölünenleri ekrana yazdıran programın olgoritmasını yapınız?
        Scanner k=new Scanner(System.in);
        System.out.println("Tamsayi giriniz");
     
        for (int i = 0; ; i++) {
            
        int a=k.nextInt();
        if (a%3==0 && a%5==0) {
            System.out.println(a+" sayisi 3 veya 5 e tam bolunur");
        }
        }
    }
}
