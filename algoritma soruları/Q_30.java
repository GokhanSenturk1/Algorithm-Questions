
package github;

import java.util.Scanner;

public class Q_30 {
    public static void main(String[] args) {
        
    //ör:Klavyeden girilen pozitif tamsayının kaç basamaklı olduğunu bulup ekrana yazan programın algoritmasını yapınız?
        
        Scanner k=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int a=k.nextInt();
        int sayac=0;
        while(a>0){
            a=a/10;
            sayac++;
        }
        System.out.println(sayac);

    }
}
