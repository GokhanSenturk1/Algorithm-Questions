
package github;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
     //ör:Klavyeden girilen 6 sayıyı ekrana yazan ve bunları toplayıp ortalamasını alan ve bu değerleri ekrana yazan 
     //programın algoritmasını yapınız?
        int top=0,sayac=0;
        Scanner k=new Scanner(System.in);
        
            for (int i = 1; i <= 6; i++) {
            System.out.println(i+".Sayiyi giriniz");
            int a=k.nextInt();
            System.out.println(a);
            
            sayac++;
            top=top+a;
        }
            System.out.println("toplam="+top);
            System.out.println("Ortalama="+(double)(top)/(double)(sayac));


    }
}

  
