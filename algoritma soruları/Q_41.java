
package github;

import java.util.Scanner;

public class Q_41 {
    public static void main(String[] args) {
        //ör4:t=1+x+x*x+x*x*x+... klavyden girilen x değeri için bu serinin ilk 7 elemanını toplayan programın algoritmasını yapınız?
    Scanner k=new Scanner (System.in);
    int top=1,sonuc=1;
        System.out.println("X in degerini giriniz");
        int x=k.nextInt();
        for (int i = 0; i <6; i++) {
               sonuc=sonuc*x;
                top=top+sonuc; 
        }
        System.out.println("Sonuc="+top);
    }
}
